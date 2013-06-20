package cn.java.base.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileByStreamTest {

	public static void main(String[] args) {

		File originalFile = new File("F:\\TDDOWNLOAD\\LJM1130_M1210_MFP_Full_Solution.exe");
		File copyByStreamFile = new File("E:\\temp\\copyByStreamFile.exe");
		
		byte[] b = new byte[100];
		
		// copy file by stream
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int hasread = 0;
		try {
			fis = new FileInputStream(originalFile);
			if(!copyByStreamFile.exists()) {
				copyByStreamFile.createNewFile();
			}
			fos = new FileOutputStream(copyByStreamFile);
			long startTime = System.currentTimeMillis();
			while((hasread  = fis.read(b)) != -1) {
				fos.write(b, 0, hasread);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Copy File By Stream”√ ±£∫" + (endTime - startTime) + "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
