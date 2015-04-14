package com.example;

public class Configuracion {
	private boolean cursor = true;
	private boolean estado = false;
	private boolean transicion = false;
	private boolean eliminar = false;
	private boolean des_hacer = false;
	private boolean re_hacer = false;
	private int num_estados = 0;
	
	public Configuracion() {
		this.cursor = true;
		this.estado = false;
		this.transicion = false;
		this.eliminar = false;
		this.des_hacer = false;
		this.re_hacer = false;
		this.num_estados = 0;
	}
	
	public int getNum_estados() {
		return num_estados;
	}
	public void setNum_estados(int num_estados) {
		this.num_estados = num_estados;
	}
	public boolean isCursor() {
		return cursor;
	}
	public void setCursor(boolean cursor) {
		this.cursor = cursor;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public boolean isTransicion() {
		return transicion;
	}
	public void setTransicion(boolean transicion) {
		this.transicion = transicion;
	}
	public boolean isEliminar() {
		return eliminar;
	}
	public void setEliminar(boolean eliminar) {
		this.eliminar = eliminar;
	}
	public boolean isDes_hacer() {
		return des_hacer;
	}
	public void setDes_hacer(boolean des_hacer) {
		this.des_hacer = des_hacer;
	}
	public boolean isRe_hacer() {
		return re_hacer;
	}
	public void setRe_hacer(boolean re_hacer) {
		this.re_hacer = re_hacer;
	}
	
}
