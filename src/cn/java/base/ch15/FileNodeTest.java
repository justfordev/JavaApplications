package cn.java.base.ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileNodeTest {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("fileWriter.txt");
			fw.write("我远离了大海\n");
			fw.write("看不到春暖花开\n");
			fw.write("我只有一只小乌龟\n");
			fw.write("一样可以闻到馥郁花香\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
