package cn.java.base.ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileNodeTest {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("fileWriter.txt");
			fw.write("��Զ���˴�\n");
			fw.write("��������ů����\n");
			fw.write("��ֻ��һֻС�ڹ�\n");
			fw.write("һ�������ŵ��������\n");
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
