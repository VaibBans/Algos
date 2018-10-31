package com.cg.gui;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorldApplet {

	static String message = "Hello";
	static MessageDisplay display ;
	private static class MessageDisplay extends JPanel{
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString(message, 20, 100);
		}
	}
	
	private static class ButtonHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if("Hello".equals(message))
				message = "Bye";
			else
				message = "Hello";
			display.repaint();    
		}
	}
	
private static class ExitButtonHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			System.exit(0);    
		}
	}

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("MessageDisplay");
		display = new MessageDisplay();
		ActionListener handler = new ButtonHandler();
		JButton button = new JButton("Change Message");
		ExitButtonHandler exitButtonListener = new ExitButtonHandler();
		JButton exit = new JButton("Exit");
		
		frame.setSize(200, 200);
		display.setSize(200, 200);
		
		display.add(button);
		display.add(exit);
		
		frame.setContentPane(display);
		button.addActionListener(handler);
		exit.addActionListener(exitButtonListener);
		frame.setVisible(true);
	}
}