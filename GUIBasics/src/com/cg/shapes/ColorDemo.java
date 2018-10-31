package com.cg.shapes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorDemo extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Color color = new Color(57,13,20);
		setBackground(color); 
	}
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new ColorDemo();
		
		frame .setSize(100, 100);
		frame.setContentPane(panel);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
