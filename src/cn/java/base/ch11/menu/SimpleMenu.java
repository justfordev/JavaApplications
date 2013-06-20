package cn.java.base.ch11.menu;

import java.awt.BorderLayout;
import java.awt.CheckboxMenuItem;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import cn.java.base.ch11.listener.MyWindowsListener;

public class SimpleMenu {
	private Frame f = new Frame("�򵥲˵�");

	private TextArea ta = new TextArea(5, 30);
	
	private MenuBar menubar = new MenuBar(); 
	private PopupMenu pop = new PopupMenu();
	
	private Menu file = new Menu("�ļ�");
	private Menu edit = new Menu("�༭");
	private Menu view = new Menu("�鿴");
	private Menu help = new Menu("����");

	private MenuItem create = new MenuItem("�½�");
	private MenuItem open = new MenuItem("��");
	private MenuItem save = new MenuItem("����");
	private MenuItem exit = new MenuItem("�˳�", new MenuShortcut(KeyEvent.VK_Q));

	private MenuItem cut = new MenuItem("����");
	private MenuItem copy = new MenuItem("����");
	private MenuItem paste = new MenuItem("ճ��");

	private MenuItem cl = new CheckboxMenuItem("�Զ�����");
	
	private MenuItem spread = new MenuItem("ƽ��");
	private MenuItem table = new MenuItem("�б�");
	private MenuItem icon = new MenuItem("ͼ��", new MenuShortcut(KeyEvent.VK_I, true));
	private MenuItem detail = new MenuItem("��ϸ��Ϣ");
	
	private Menu format = new Menu("��ʽ");
	private MenuItem al = new MenuItem("�����", new MenuShortcut(KeyEvent.VK_L));
	private MenuItem ar = new MenuItem("�Ҷ���");
	private MenuItem ac = new MenuItem("����");

	private MenuItem about = new MenuItem("����");

	
	private void init() {
		ActionListener iconListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals("ͼ��")) {
					ta.append("�����ͼ��˵�...\n");
				}
			}
		};
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("window is closing...");
				System.exit(0);
			}
		});

		icon.addActionListener(iconListener);
		
		f.addWindowListener(new MyWindowsListener());
		
		file.add(create);
		file.add(open);
		file.add(save);
		file.add(exit);
		
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		
		format.add(al);
		format.add(ar);
		format.add(ac);
		
		view.add(cl);
		view.add(new MenuItem("-"));
		//ʹ������ķ�ʽ��ӷָ��ߣ�ÿ����Ӷ���Ҫnewһ����Ȼ����ӡ���Ϊÿ���˵����ֻ�ܱ����һ�Ρ�
		//MenuItem line0 = new MenuItem("-");
		//view.add(line0);
		view.add(spread);
		view.add(table);
		view.add(icon);
		view.add(detail);
		view.addSeparator();
		view.add(format);
		
		help.add(about);
		
		menubar.add(file);
		menubar.add(view);
		menubar.add(help);
		
		pop .add(edit);

		final Panel p = new Panel();
		p.setPreferredSize(new Dimension(300, 160));
		// ����Ҽ��˵��ͼ���
		p.add(pop);
		p.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					pop.show(p, e.getX(), e.getY());
				}
			}
		});
		
		f.setMenuBar(menubar);
		f.add(ta);
		f.add(p, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SimpleMenu().init();
	}

}
