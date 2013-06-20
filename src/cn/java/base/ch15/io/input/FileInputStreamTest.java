package cn.java.base.ch15.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("fileInputStream.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(fis.markSupported());
		
		byte[] b = new byte[10];
		int hasread = 0;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("fileOutputStream.txt"));
			
//			int i;
//			while((i = fis.read()) != -1) {
//				fos.write(i);
//			}
			
			while ((hasread = fis.read(b)) > 0) {
				fos.write(b, 0, hasread);
				fis.skip(2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
