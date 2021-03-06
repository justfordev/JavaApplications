package cn.java.base.ch11.layoutmanager;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLocation(400, 200);
		f.setLayout(new BorderLayout(30, 10));
		f.add(new Button("北"), BorderLayout.NORTH);
		f.add(new Button("南"), BorderLayout.SOUTH);
		f.add(new Button("西"), BorderLayout.WEST);
		f.add(new Button("东"), BorderLayout.EAST);
		f.add(new Button("中"));
		f.pack();
		f.setVisible(true);
	}

}
