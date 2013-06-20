package cn.java.base.ch15.files;

import java.io.File;
import java.io.IOException;

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("file.txt");
		//�����ļ�����صķ���
		System.out.println("Path: " + f.getPath());
		System.out.println("Parent: " + f.getParent());
		System.out.println("AbsoluteFile: " + f.getAbsoluteFile());
		System.out.println("Parent: " + f.getAbsoluteFile().getParent());
		System.out.println("AbsolutePath: " + f.getAbsolutePath());
		//�ļ������صķ���
		System.out.println("Exist: " + f.exists());
		System.out.println("CanWrite: " + f.canWrite());
		System.out.println("CanRead: " + f.canRead());
		System.out.println("CanExecute: " + f.canExecute());
		System.out.println("IsFile: " + f.isFile());
		System.out.println("IsDirectory: " + f.isDirectory());
		System.out.println("IsAbsolute: " + f.isAbsolute());
		//��ȡ�����ļ���Ϣ
		System.out.println("LastModified: " + f.lastModified());
		System.out.println("Length: " + f.length());
		//�ļ���������ط���
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
		//Ŀ¼��������ط���
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
