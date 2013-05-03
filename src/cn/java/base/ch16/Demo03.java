package cn.java.base.ch16;

import cn.java.base.ch16.extendsthread.Teacher;

public class Demo03 {
	public static void main(String[] args) {
		Thread teacher = new Teacher();
		teacher.start();
		teacher.interrupt();
	}
}
