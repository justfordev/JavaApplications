package cn.java.base.ch15;

import java.io.StringWriter;

public class StringNodeTest {

	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
		sw.write("我远离了大海\n");
		sw.write("看不到春暖花开\n");
		sw.write("我只有一只小乌龟\n");
		sw.write("一样可以闻到馥郁花香\n");
		System.out.println(sw.toString());
	}

}
