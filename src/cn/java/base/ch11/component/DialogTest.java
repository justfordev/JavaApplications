package cn.java.base.ch11.component;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {

	Frame f = new Frame("����Dialog");
	Dialog modal = new Dialog(f, "ģʽ�Ի���", true);
	Dialog non_modal = new Dialog(f, "��ģʽ�Ի���", false);
	Button b1 = new Button("��ģʽ�Ի���");
	Button b2 = new Button("�򿪷�ģʽ�Ի���");
	Button b3 = new Button("�ر�ģʽ�Ի���");
	
	public void ini() {
		modal.setBounds(50, 50, 400, 500);
		non_modal.setBounds(450, 550, 400, 500);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("����ģʽ�µĶԻ���...");
				modal.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���˷�ģʽ�µĶԻ���...");
				non_modal.setVisible(true);
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ر�ģʽ�µĶԻ���...");
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
