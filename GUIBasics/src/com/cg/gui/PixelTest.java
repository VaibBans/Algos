package com.cg.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PixelTest extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		System.out.println("W= "+width+" H= "+height);
		Color c = g.getColor();
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new PixelTest();
		frame.setSize(100, 100);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

}
