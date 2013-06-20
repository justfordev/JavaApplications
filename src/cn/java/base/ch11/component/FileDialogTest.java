package cn.java.base.ch11.component;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogTest {

	Frame f = new Frame("����FileDialog");
	Dialog open = new FileDialog(f, "���ļ��Ի���", FileDialog.LOAD);
	Dialog save = new FileDialog(f, "�����ļ��Ի���", FileDialog.SAVE);
	Button b1 = new Button("���ļ��Ի���");
	Button b2 = new Button("�����ļ��Ի���");
	
	public void ini() {
		open.setBounds(50, 50, 400, 500);
		save.setBounds(450, 550, 400, 500);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���ļ��ĶԻ���...");
				open.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�����ļ��ĶԻ���...");
				save.setVisible(true);
			}
		});

		f.add(b1);
		f.add(b2, BorderLayout.SOUTH);
		f.setLocation(500, 300);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new FileDialogTest().ini();
	}

}
