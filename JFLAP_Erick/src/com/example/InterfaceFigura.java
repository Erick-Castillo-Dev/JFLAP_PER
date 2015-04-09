package com.example;

import java.awt.Graphics;

public abstract interface InterfaceFigura
{
  public abstract boolean estaDentro(int paramInt1, int paramInt2);

  public abstract void setPosicion(int paramInt1, int paramInt2);

  public abstract int getX();

  public abstract int getY();

  public abstract void dibujate(Graphics paramGraphics);
}