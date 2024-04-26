package com.DIT.gaming.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player extends sprite {
	
	public Player() {
		w=200;
		h=200;
		x=50;
		y=550;
		image=new ImageIcon(Player.class.getResource("game 5.gif"));
		
	}
	public void move() {
		x=x+speed;
	}
	public boolean outOfScreen() {
		return x>1500;
	}
	
}
