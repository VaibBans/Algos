package com.cg.shapes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shapes extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.white);
		g.setColor(Color.RED);
		g.drawLine(10,10,20,20);
		g.setColor(Color.CYAN);
		g.drawRect(50, 50, 100, 100);
		g.setColor(Color.cyan);
		Font f = new Font("Sans", Font.ITALIC, 24);
		g.setFont(f);
		g.drawString("Welcome", 500, 24);
		g.setColor(Color.red);
		g.draw3DRect(200, 100, 100, 100, true);
		g.drawOval(300, 200, 100, 50);
		g.drawArc(500, 200, 400, 100, 0, 90);
		g.fillRect(400, 400, 400, 400);
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new Shapes();
		
		frame.setSize(1000, 1000);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
