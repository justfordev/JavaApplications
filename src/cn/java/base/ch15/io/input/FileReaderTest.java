package cn.java.base.ch15.io.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader(new File("fileWriter.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		char[] buf = new char[20];
		int hasread = 0;
		try {
			while ((hasread = fr.read(buf)) > 0) {
				System.out.print(String.valueOf(buf, 0, hasread));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
