package cn.java.base.ch11.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest {

	Frame f = new Frame("测试Event");
	Button b = new Button("确定");
	TextField tf = new TextField(10);

	public void init() {
		b.addActionListener(new OKListener());
		
		f.add(tf);
		f.add(b, BorderLayout.EAST);
		f.pack();
		f.setVisible(true);
	}
	
	class OKListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("用户点击了OK按钮...");
			tf.setText("用户点击了OK按钮...");
		}
	}
	
	public static void main(String[] args) {
		new EventTest().init();
	}

}
