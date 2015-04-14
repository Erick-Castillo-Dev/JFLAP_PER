package com.example;

import java.awt.Color;
import java.awt.Graphics;

public abstract interface InterfaceFigura
{

  public abstract boolean getFinal();
  
  public abstract boolean getInicial();
  
  public abstract void setFinal(boolean f);
  
  public abstract void setInicial(boolean i);
	
  public abstract boolean estaDentro(int paramInt1, int paramInt2);

  public abstract void setPosicion(int paramInt1, int paramInt2);

  public abstract int getX();

  public abstract int getY();
  
  public abstract Color getcolor();
  
  public abstract void setColor(Color c);

  public abstract void dibujate(Graphics paramGraphics);
  
  public abstract void inicial(Graphics paramGraphics);
  
  public abstract void finaldi(Graphics paramGraphics);
}