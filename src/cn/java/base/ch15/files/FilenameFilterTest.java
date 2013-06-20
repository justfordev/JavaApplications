package cn.java.base.ch15.files;

import java.io.File;
import java.io.IOException;

public class FilenameFilterTest {

	public static void main(String[] args) {
		File dir = new File("E:/temp/tmp/");
		for(int i=1000; i<1020; i++) {
			try {
				if(i%2 == 0) {
					File.createTempFile("img_", ".jpg", dir);
					continue;
				}
				if(i%3 == 0) {
					new File("E:/temp/tmp/dir_" + i + "//").mkdir();
					continue;
				}
				File.createTempFile("note_", ".txt", dir);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String[] files = dir.list(new MyFilenameFilter());
		if(files != null && files.length != 0) {
			System.out.println("符合条件的File：");
			for(String str : files) {
				System.out.println(str);
			}
		} else {
			System.out.println("There is no files in the dir \"" + dir + "\"");
		}
	}

}
