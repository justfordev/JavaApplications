package cn.java.base.ch11.component;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogTest {

	Frame f = new Frame("测试FileDialog");
	Dialog open = new FileDialog(f, "打开文件对话框", FileDialog.LOAD);
	Dialog save = new FileDialog(f, "保存文件对话框", FileDialog.SAVE);
	Button b1 = new Button("打开文件对话框");
	Button b2 = new Button("保存文件对话框");
	
	public void ini() {
		open.setBounds(50, 50, 400, 500);
		save.setBounds(450, 550, 400, 500);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("打开文件的对话框...");
				open.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("保存文件的对话框...");
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
