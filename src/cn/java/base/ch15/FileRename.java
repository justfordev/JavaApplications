package cn.java.base.ch15;

import java.io.File;
import java.util.Scanner;

public class FileRename {

	private static boolean flag = false;
	private static String[] oldFiles;
	private static Integer startNum;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the old directory(eg:f:/LufaxData/byJH):");
		String oldDirStr = in.next();
		File oldDir = new File(oldDirStr);
		if(oldDir.isDirectory()) {
			oldFiles = oldDir.list();
			if(oldFiles.length == 0) {
				System.out.println("--> no files in the old directory [" + oldDirStr + "]");
				System.exit(0);
			}
		} else {
			System.out.println("--> the old directory [" + oldDirStr + "] is not a directory");
			System.exit(0);
		}
		System.out.println("Please input the new directory(eg:f:/Temp/tmp):");
		String newDirStr = in.next();
		File newDir = new File(newDirStr);
		if(!newDir.isDirectory()) {
			System.out.println("--> the new directory [" + newDirStr + "] is error");
			System.exit(0);;
		}
		System.out.println("Please input the new prefix of file(eg:IMG_):");
		String prefix = in.next();
		System.out.println("Please input the new suffix of file(eg:.jpg):");
		String suffix = in.next();
		System.out.println("Please input the start num(eg:0001):");
		String startNumStr = in.next();
		if(startNumStr.charAt(0) == '0') {
			flag  = true;
			startNumStr = '1' + startNumStr;
			startNum = Integer.valueOf(startNumStr);
		} else {
			startNum = Integer.valueOf(startNumStr);
		}
		String newFileFormat = newDirStr + "/" + prefix + "%s" + suffix;
		int i = 0;
		if(flag) {
			for(String oldFileName : oldFiles) {
				String oldFile = oldDirStr + "/" + oldFileName;
				String newFile = String.format(newFileFormat, String.valueOf(startNum + i).substring(1));

				System.out.println("oldfile: " + oldFile);
				System.out.println("newfile: " + newFile);
//				boolean result = new File(oldFile).renameTo(new File(newFile));
//				if(!result) {
//					System.out.println("--> renaming the file [" + oldFile + "] is failed");
//				}
				i++;
			}
		} else {
			for(String oldFileName : oldFiles) {
				String oldFile = oldDirStr + "/" + oldFileName;
				String newFile = String.format(newFileFormat, String.valueOf(startNum + i));
				
				System.out.println("oldfile: " + oldFile);
				System.out.println("newfile: " + newFile);
//				boolean result = new File(oldFile).renameTo(new File(newFile));
//				if(!result) {
//					System.out.println("--> renaming the file [" + oldFile + "] is failed");
//				}
				i++;
			}
		}
	}

}
