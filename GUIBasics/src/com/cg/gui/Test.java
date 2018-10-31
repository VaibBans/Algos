package com.cg.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		JPanel panel = new JPanel();

		panel.setSize(1000, 1000);
		frame.setContentPane(panel);
		panel.add("Button", button);
		
		ActionListener l = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		};
		button.addActionListener(l);
		frame.setVisible(true);
	}
}
