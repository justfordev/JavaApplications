package cn.java.base.ch15;

import java.io.StringWriter;

public class StringNodeTest {

	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
		sw.write("��Զ���˴�\n");
		sw.write("��������ů����\n");
		sw.write("��ֻ��һֻС�ڹ�\n");
		sw.write("һ�������ŵ��������\n");
		System.out.println(sw.toString());
	}

}
