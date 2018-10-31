package com.cg.shapes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintedSurface extends JPanel{

	int i = 0,j = 0;
	Font font[] = new Font[4];
	Font font1, font2, font3, font4;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.BLACK);
		font1 = new Font("Sans",Font.BOLD,20);
		font2 = new Font("SansSerif",Font.ITALIC+Font.BOLD,21);
		font3 = new Font("Monospaced",Font.CENTER_BASELINE,22);
		font4 = new Font("Dialog",Font.ITALIC,23);
		
		Font font[] = {font1,font2,font3,font4};		
		j = 0;
		
		for(i=0;i<50;i++) {
		
			if(j<4)
				g.setFont(font[j]);
			else
				j=0;
			j++;
	
		int a = (int)(100*Math.random()),b = (int)(100*Math.random()), c = (int)(100*Math.random());
		Color color = new Color(a,b,c);
		g.setColor(color);
		g.drawString("JAVA!!", (int)(500*Math.random())-50-i,(int)(500*Math.random()-50-i));
		}		
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new PaintedSurface();
		
		frame.setSize(500, 500);
		frame.setContentPane(panel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}
}
