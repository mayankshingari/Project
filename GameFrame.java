package com.DIT.gaming;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	public GameFrame(){
		Board obj2=new Board();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("game dev in java");
		setSize(1500,920);
		setResizable(false);
		setLocationRelativeTo(null);
		add(obj2);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		 new GameFrame();
	
	}

}
