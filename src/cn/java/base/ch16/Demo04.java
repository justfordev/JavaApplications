package cn.java.base.ch16;

import cn.java.base.ch16.extendsthread.Student2;
import cn.java.base.ch16.extendsthread.StudentB;

public class Demo04 {

	public static void main(String[] args) {
		Thread stu2 = new Student2();
		Thread stuB = new StudentB();

		stu2.start();
		stuB.start();
	}

}
