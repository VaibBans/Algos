package com.cg.gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Message extends JPanel{

	@Override
	public void paintComponent(Graphics g) {
		ButtonHandler handler = new ButtonHandler();
		super.paintComponent(g);
		System.out.println("In paint "+handler.message);
		g.drawString(handler.message, 40, 40);
		repaint();
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Message");
		JPanel panel = new Message();
		JButton button = new JButton();
		ActionListener listener = new ButtonHandler();
		
		frame.setSize(200, 200);
		panel.setSize(100, 100);
		panel.add(button, BorderLayout.CENTER);
		button.addActionListener(listener);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
}

class ButtonHandler implements ActionListener{
	
	String message = "Hello";
	Message m = new Message();
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		/*if(message.equals("Hello")) 
			message = "Bye";
		else
			message = "Hello";
		m.repaint();*/
		showMessage();
	}
	
	String showMessage() {
		if(message.equals("Hello")) {
			System.out.println("In show");
			message = "Bye";
		}
		else {
			message = "Hello";
		}
		m.repaint();
		System.out.println("Message "+message);
		
		return message;
	}
}