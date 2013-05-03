package cn.java.base.ch16;

import cn.java.base.ch16.extendsthread.TeacherB;

public class Demo06 {
	public static void main(String[] args) {
		TeacherB tb = new TeacherB();

		new Thread(tb).start();
		new Thread(tb).start();
		new Thread(tb).start();
	}
}
