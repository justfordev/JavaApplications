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
	private Frame f = new Frame("简单菜单");

	private TextArea ta = new TextArea(5, 30);
	
	private MenuBar menubar = new MenuBar(); 
	private PopupMenu pop = new PopupMenu();
	
	private Menu file = new Menu("文件");
	private Menu edit = new Menu("编辑");
	private Menu view = new Menu("查看");
	private Menu help = new Menu("帮助");

	private MenuItem create = new MenuItem("新建");
	private MenuItem open = new MenuItem("打开");
	private MenuItem save = new MenuItem("保存");
	private MenuItem exit = new MenuItem("退出", new MenuShortcut(KeyEvent.VK_Q));

	private MenuItem cut = new MenuItem("剪切");
	private MenuItem copy = new MenuItem("复制");
	private MenuItem paste = new MenuItem("粘贴");

	private MenuItem cl = new CheckboxMenuItem("自动换行");
	
	private MenuItem spread = new MenuItem("平铺");
	private MenuItem table = new MenuItem("列表");
	private MenuItem icon = new MenuItem("图标", new MenuShortcut(KeyEvent.VK_I, true));
	private MenuItem detail = new MenuItem("详细信息");
	
	private Menu format = new Menu("格式");
	private MenuItem al = new MenuItem("左对齐", new MenuShortcut(KeyEvent.VK_L));
	private MenuItem ar = new MenuItem("右对齐");
	private MenuItem ac = new MenuItem("居中");

	private MenuItem about = new MenuItem("关于");

	
	private void init() {
		ActionListener iconListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals("图标")) {
					ta.append("点击了图标菜单...\n");
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
		//使用下面的方式添加分隔线，每次添加都需要new一个，然后添加。因为每个菜单组件只能被添加一次。
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
		// 添加右键菜单和监听
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
