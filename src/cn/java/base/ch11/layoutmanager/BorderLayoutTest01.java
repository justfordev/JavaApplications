package cn.java.base.ch11.layoutmanager;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class BorderLayoutTest01 {

	public static void main(String[] args) {
		Frame f = new Frame("���Դ���");
		f.setLocation(400, 200);
		f.setLayout(new BorderLayout(30, 10));
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("�����"));
		f.add(new Button("��"), BorderLayout.NORTH);
		f.add(new Button("��"), BorderLayout.SOUTH);
		f.add(new Button("��"), BorderLayout.WEST);
		f.add(p, BorderLayout.WEST);
		f.add(new Button("��"), BorderLayout.EAST);
		f.add(new Button("��"));
		f.pack();
		f.setVisible(true);
	}

}
