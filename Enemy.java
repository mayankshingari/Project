package com.DIT.gaming.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy extends sprite {
	
	public Enemy(int x , int speed) {
		w=100;
		h=100;
		this.x=x;
		this.speed=speed;
		y=50;
		image=new ImageIcon(Enemy.class.getResource("game3.gif"));
		
	}
	public void move() {
		if(y>900) {
			y=0;
		}
		y=y+speed;
	}

}
