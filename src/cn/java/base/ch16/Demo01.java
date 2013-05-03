package cn.java.base.ch16;

import cn.java.base.ch16.implementrunnable.Student1;
import cn.java.base.ch16.implementrunnable.StudentA;

public class Demo01 {

	public static void main(String[] args) {
		Thread stuA = new Thread(new StudentA());
		Thread stu1 = new Thread(new Student1());

		stuA.start();
		stu1.start();
	}
	
}
