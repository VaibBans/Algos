package com.cg.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo extends JPanel implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(0, 0, 100, 100);
		g.drawString("Hello", 320, 100);
	}
	
	public static void main(String[] args) {
		
		JPanelDemo content = new JPanelDemo();
		JPanelDemo panel = new JPanelDemo();
		JButton button = new JButton();
		JFrame frame = new JFrame();
		
		content.setLayout(new BorderLayout());
		frame.setSize(800, 800);
		panel.setSize(500, 500);
		panel.setForeground(Color.CYAN);
		content.setBackground(Color.PINK);
		content.add(panel,BorderLayout.EAST);
		content.add(button,BorderLayout.SOUTH);
		
		button.addActionListener(content);
		
		frame.setContentPane(content);
		frame.setVisible(true);
	}

}
