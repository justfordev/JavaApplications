package cn.java.base.ch15.files;

import java.io.File;
import java.io.IOException;

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("file.txt");
		//访问文件名相关的方法
		System.out.println("Path: " + f.getPath());
		System.out.println("Parent: " + f.getParent());
		System.out.println("AbsoluteFile: " + f.getAbsoluteFile());
		System.out.println("Parent: " + f.getAbsoluteFile().getParent());
		System.out.println("AbsolutePath: " + f.getAbsolutePath());
		//文件检测相关的方法
		System.out.println("Exist: " + f.exists());
		System.out.println("CanWrite: " + f.canWrite());
		System.out.println("CanRead: " + f.canRead());
		System.out.println("CanExecute: " + f.canExecute());
		System.out.println("IsFile: " + f.isFile());
		System.out.println("IsDirectory: " + f.isDirectory());
		System.out.println("IsAbsolute: " + f.isAbsolute());
		//获取常规文件信息
		System.out.println("LastModified: " + f.lastModified());
		System.out.println("Length: " + f.length());
		//文件操作的相关方法
		try {
			System.out.println("CreateNewFile: " + f.createNewFile());
			File tempFile1 = File.createTempFile("img_", ".txt");
			System.out.println("CreateTempFile: " + tempFile1);
			System.out.println("Delete: " + tempFile1.delete());
			File tempFile2 = File.createTempFile("img_", ".txt", new File("E:/temp/"));
			System.out.println("CreateTempFile: " + tempFile2);
			tempFile2.deleteOnExit();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//目录操作的相关方法
		File tempDir = new File("E:/temp/tmp/");
		if(!tempDir.exists()) {
			System.out.println("MkDir: " + tempDir.mkdir());
		} else {
			System.out.println("The dir \"" + tempDir + "\" is existed");
		}
		System.out.println("List:");
		for(String str : tempDir.list()) {
			System.out.println(str);
		}
		System.out.println("ListFiles:");
		for(File file : tempDir.listFiles()) {
			System.out.println(file);
		}
		System.out.println("ListRoots:");
		for(File dir : File.listRoots()) {
			System.out.println(dir);
		}
		
	}

}
