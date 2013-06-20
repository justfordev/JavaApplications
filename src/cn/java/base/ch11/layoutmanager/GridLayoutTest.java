package cn.java.base.ch11.layoutmanager;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class GridLayoutTest {

	public static void main(String[] args) {
		Frame f = new Frame("¼ÆËãÆ÷");
		Panel p1 = new Panel();
		p1.add(new TextField(20));
		f.add(p1, BorderLayout.NORTH);
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3,5,5,5));
		String[] name = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "-", "*", "/", "."};
		for(int i = 0; i<15; i++) {
			p2.add(new Button(name[i]));
		}
		f.add(p2);
		f.pack();
		f.setVisible(true);
	}

}
