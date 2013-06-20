package cn.java.base.ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileByBufferStreamTest {

	public static void main(String[] args) {

		File originalFile = new File("F:\\TDDOWNLOAD\\LJM1130_M1210_MFP_Full_Solution.exe");
		File copyByBufferStreamFile = new File("E:\\temp\\copyByBufferStreamFile.exe");
		
		byte[] b = new byte[100];
		
		// copy file by stream
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int hasread = 0;
		try {
			bis = new BufferedInputStream(new FileInputStream(originalFile));
			if(!copyByBufferStreamFile.exists()) {
				copyByBufferStreamFile.createNewFile();
			}
			bos = new BufferedOutputStream(new FileOutputStream(copyByBufferStreamFile));
			long startTime = System.currentTimeMillis();
			while((hasread = bis.read(b)) != -1) {
				bos.write(b, 0, hasread);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Copy File By bufferStream”√ ±£∫" + (endTime - startTime) + "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(bis != null) bis.close();
					if(bos != null) bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
