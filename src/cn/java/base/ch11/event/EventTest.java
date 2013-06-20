package cn.java.base.ch11.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest {

	Frame f = new Frame("����Event");
	Button b = new Button("ȷ��");
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
			System.out.println("�û������OK��ť...");
			tf.setText("�û������OK��ť...");
		}
	}
	
	public static void main(String[] args) {
		new EventTest().init();
	}

}
