package cn.java.base.ch16;

import cn.java.base.ch16.extendsthread.Student1;
import cn.java.base.ch16.extendsthread.StudentA;

public class Demo02 {

	public static void main(String[] args) {
		Thread stuA = new StudentA();
		Thread stu1 = new Student1();

		stuA.start();
		stu1.start();
	}
	
}
