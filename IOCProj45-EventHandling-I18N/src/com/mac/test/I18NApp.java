package com.mac.test;

import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18NApp {

	public static void main(String[] args) {
		//create IOC container
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			Locale locale = null, locale1=null;
			JFrame frame = new JFrame();
			frame.setBounds(100, 100, 450, 300);
			frame.getContentPane().setLayout(null);
			// create Locale object
			locale = new Locale(args[0], args[1]);
			locale1 = new Locale("hi", "IN");
			frame.setTitle("Internationlization Application (I18N)");
			
			JButton btnSave = new JButton(ctx.getMessage("btn.cap1", new Object[] {"emp"}, "msg1", locale));
			btnSave.setBounds(52, 150, 89, 23);
			frame.getContentPane().add(btnSave);
			
			JButton btnModify = new JButton(ctx.getMessage("btn.cap2", new Object[] {}, "msg2", locale));
			btnModify.setBounds(52, 202, 89, 23);
			frame.getContentPane().add(btnModify);
			
			JButton btnDelete = new JButton(ctx.getMessage("btn.cap3", new Object[] {}, "msg3", locale));
			btnDelete.setBounds(250, 150, 89, 23);
			frame.getContentPane().add(btnDelete);
			
			JButton btnView = new JButton(ctx.getMessage("btn.cap4", new Object[] {"dept"}, "msg4", locale1));
			btnView.setBounds(250, 202, 89, 23);
			frame.getContentPane().add(btnView);

			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ctx.close();
		}//try
	}//main
}//class
