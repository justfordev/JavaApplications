package cn.java.base.ch11.component;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentsTest {
	Frame frame = new Frame("����");
	Label label = new Label("��ǩ");
	Button button = new Button("��ť");
	CheckboxGroup checkboxGroup = new CheckboxGroup();
	Checkbox male = new Checkbox("��", checkboxGroup, true);
	Checkbox female = new Checkbox("Ů", checkboxGroup, false);
	Checkbox married = new Checkbox("�Ƿ��ѻ飿", false);
	Choice choice = new Choice();
	List list = new List();
	Scrollbar scrollbar = new Scrollbar(1, 10, 1, 0, 255);
	ScrollPane scrollPane = new ScrollPane();
	TextArea textArea = new TextArea(5, 50);
	TextField textField = new TextField(50);
	
	public void init() {

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ϵͳ�˳�...");
				System.exit(0);
			}
		});
		
//		Canvas canvas = new Canvas();
		choice.add("��ɫ");
		choice.add("��ɫ");
		choice.add("��ɫ");
		list.add("red");
		list.add("yellow");
		list.add("blue");

		Panel bottomPanel = new Panel();
		Panel checkboxPanel = new Panel();

		bottomPanel.add(button);
		bottomPanel.add(label);
		bottomPanel.add(scrollbar);
		bottomPanel.add(scrollPane);
		bottomPanel.add(textArea);
		bottomPanel.add(textField);
		
		checkboxPanel.add(male);
		checkboxPanel.add(female);
		checkboxPanel.add(married);
		checkboxPanel.add(choice);
		checkboxPanel.add(label);
		checkboxPanel.add(list);
		
		frame.add(bottomPanel);
		frame.add(checkboxPanel, BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
	}
	

	
	public static void main(String[] args) {
		new ComponentsTest().init();
	}

}
