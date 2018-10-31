package com.cg.gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITest {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		JPanel content = new JPanel();
		content.setBackground(Color.CYAN);         //setting background color
//		JScrollBar bar = new JScrollBar();
//		content.add(bar);
		window.setSize(1000, 1000);
		window.setContentPane(content);
		window.setLocation(400, 400);
		window.setVisible(true);
	}
}
