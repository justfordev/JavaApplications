package cn.java.base.ch11.component;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {

	Frame f = new Frame("测试Dialog");
	Dialog modal = new Dialog(f, "模式对话框", true);
	Dialog non_modal = new Dialog(f, "非模式对话框", false);
	Button b1 = new Button("打开模式对话框");
	Button b2 = new Button("打开非模式对话框");
	Button b3 = new Button("关闭模式对话框");
	
	public void ini() {
		modal.setBounds(50, 50, 400, 500);
		non_modal.setBounds(450, 550, 400, 500);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("打开了模式下的对话框...");
				modal.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("打开了非模式下的对话框...");
				non_modal.setVisible(true);
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("关闭模式下的对话框...");
				modal.setVisible(false);
			}
		});
		
		modal.add(b3);
		f.add(b1);
		f.add(b2, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new FileDialogTest().ini();
	}

}
