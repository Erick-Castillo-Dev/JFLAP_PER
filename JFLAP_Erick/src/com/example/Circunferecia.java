package com.example;

import java.awt.Color;
import java.awt.Graphics;

public class Circunferecia implements InterfaceFigura {
	private int x;
	private int y;
	private Color color;
	private int radio;
	private int num = 0;
	private boolean in;
	private boolean fi;

	public Circunferecia(int x, int y, int radio, int num, Color color,
			boolean in, boolean fi) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.radio = radio;
		this.num = num;
		this.in = in;
		this.fi = fi;
	}

	public void dibujate(Graphics g) {
		g.setColor(this.color);
		g.fillOval(this.x - this.radio, this.y - this.radio, 2 * this.radio,
				2 * this.radio);
		g.setColor(Color.BLACK);
		g.drawOval(this.x - this.radio, this.y - this.radio, 2 * this.radio,
				2 * this.radio);
		if (num < 10) {
			g.drawString("q" + num, this.x - 5, this.y + 5);
		} else {
			g.drawString("q" + num, this.x - 8, this.y + 5);
		}
	}

	public boolean estaDentro(int x, int y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)
				* (this.y - y)) < this.radio;
	}

	public void setPosicion(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public Color getcolor() {
		return this.color;
	}

	public void setColor(Color c) {
		this.color = c;
	}

	public boolean getFinal() {
		return this.fi;
	}

	public boolean getInicial() {
		return this.in;
	}

	public void setFinal(boolean f) {
		this.fi = f;
	}

	public void setInicial(boolean i) {
		this.in = i;
	}

	public void inicial(Graphics g) {
		g.setColor(this.color);
		g.fillOval(this.x - this.radio, this.y - this.radio, 2 * this.radio,
				2 * this.radio);
		g.setColor(Color.BLACK);
		g.drawOval(this.x - this.radio, this.y - this.radio, 2 * this.radio,
				2 * this.radio);
		if (num < 10) {
			g.drawString("q" + num, this.x - 5, this.y + 5);
		} else {
			g.drawString("q" + num, this.x - 8, this.y + 5);
		}
		g.drawLine(this.x-this.radio-30, this.y-this.radio,this.x-this.radio-30 , this.y-this.radio+40);
		g.drawLine(this.x-this.radio-30, this.y-this.radio,this.x-this.radio, this.y+(this.radio/2)-15);
		g.drawLine(this.x-this.radio, this.y+(this.radio/2)-15,this.x-this.radio-30 , this.y-this.radio+40);
	}

	public void finaldi(Graphics g) {
		g.setColor(this.color);
		g.fillOval(this.x - this.radio, this.y - this.radio, 2 * this.radio,
				2 * this.radio);
		g.setColor(Color.BLACK);
		g.drawOval(this.x - this.radio, this.y - this.radio, 2 * this.radio,
				2 * this.radio);
		g.drawOval(this.x - this.radio+5, this.y - this.radio+5, 2 * this.radio-10,
				2 * this.radio-10);
		if (num < 10) {
			g.drawString("q" + num, this.x - 5, this.y + 5);
		} else {
			g.drawString("q" + num, this.x - 8, this.y + 5);
		}
	}

}