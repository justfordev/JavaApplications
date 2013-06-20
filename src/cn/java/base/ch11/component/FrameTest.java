package cn.java.base.ch11.component;

import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args) {
		Frame f01 = new Frame("Test Frame01");
		Frame f02 = new Frame("Test Frame02");
		f01.setLocation(100, 100);
		f01.setSize(300,300);
		f01.setVisible(true);
		f02.setBounds(40,40,200,200);
		f02.setVisible(true);
	}
}
