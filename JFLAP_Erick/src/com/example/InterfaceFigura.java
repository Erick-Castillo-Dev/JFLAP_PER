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

/* Location:           D:\arrastrar_graficos-1.0.jar
 * Qualified Name:     chuidiang.ejemplos.arrastrar_grafico.InterfaceFigura
 * JD-Core Version:    0.6.0
 */