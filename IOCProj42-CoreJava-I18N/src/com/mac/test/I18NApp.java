package com.mac.test;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class I18NApp {

	public static void main(String[] args) {
		Locale locale = null;
		ResourceBundle bundle = null;
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		// create Locale object
		locale = new Locale(args[0], args[1]);
		//create ResourceBundle object
		bundle = ResourceBundle.getBundle("com/mac/commons/App", locale);
		frame.setTitle("Internationlization Application (I18N)");
		JButton btnSave = new JButton(bundle.getString("btn.cap1"));
		btnSave.setBounds(52, 150, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnModify = new JButton(bundle.getString("btn.cap2"));
		btnModify.setBounds(52, 202, 89, 23);
		frame.getContentPane().add(btnModify);
		
		JButton btnDelete = new JButton(bundle.getString("btn.cap3"));
		btnDelete.setBounds(250, 150, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnView = new JButton(bundle.getString("btn.cap4"));
		btnView.setBounds(250, 202, 89, 23);
		frame.getContentPane().add(btnView);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//main
}//class
