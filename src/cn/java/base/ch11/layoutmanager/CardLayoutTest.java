package cn.java.base.ch11.layoutmanager;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTest {

	Frame f = new Frame("���Դ���");
	CardLayout cl = new CardLayout();
	Panel p = new Panel();
	Panel pl = new Panel();
	String[] names = new String[]{"��һ��", "�ڶ���", "������", "������", "������", "������"};
	
	public void init() {
		p.setLayout(cl);
		for(int i = 0; i < names.length; i++) {
			p.add(names[i], new Button(names[i]));
		}
		
		Button first = new Button("��ҳ");
		first.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.first(p);
			}
		});
		pl.add(first);
		
		Button previous = new Button("��һҳ");
		previous.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.previous(p);
			}
		});
		pl.add(previous);
		
		Button next = new Button("��һҳ");
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.next(p);
			}
		});
		pl.add(next);

		Button last = new Button("βҳ");
		last.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.last(p);
			}
		});
		pl.add(last);
		
		Button show = new Button("������");
		show.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(p, "������");
			}
		});
		pl.add(show);
		
		f.add(p, BorderLayout.NORTH);
		f.add(pl);
		f.pack();
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new CardLayoutTest().init();
	}

}
