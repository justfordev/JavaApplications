package cn.java.base.ch16;

import cn.java.base.ch16.extendsthread.TeacherA;

public class Demo05 {
	public static void main(String[] args) {
		Thread t1 = new TeacherA('a');
		Thread t2 = new TeacherA('b');
		
		t1.start();
		t2.start();
	}
}
