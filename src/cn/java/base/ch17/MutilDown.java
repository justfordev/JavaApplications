package cn.java.base.ch17;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;

public class MutilDown {

	public static void main(String[] args) {
		final int DOWN_THREAD_NUM = 4;
		InputStream[] isArray = new InputStream[DOWN_THREAD_NUM];
		RandomAccessFile[] rafArray = new RandomAccessFile[DOWN_THREAD_NUM];
		
		try {
			URL url = new URL("http://localhost:8080/index.html");
			long fileLen = getContentLenth(url);
			long lenth = fileLen/DOWN_THREAD_NUM + 1;
			File outFile = new File("copyOfIndex.html");
			for(int i=0; i<DOWN_THREAD_NUM; i++) {
				isArray[i] = url.openStream();
				rafArray[i] = new RandomAccessFile(outFile, "rw");
				if(i == (DOWN_THREAD_NUM - 1)) {
					DownThread dt = new DownThread(i*lenth, fileLen, isArray[i], rafArray[i]);
					dt.start();
					System.out.println("Thead " + i + " is start...");
				}
				else {
					DownThread dt = new DownThread(i*lenth, (i+1)*lenth, isArray[i], rafArray[i]);
					dt.start();
					System.out.println("Thead " + i + " is start...");
				}
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static long getContentLenth(URL url) throws IOException {
		URLConnection con = url.openConnection();
		long fileLen = con.getContentLength();
		return fileLen;
	}

}
