package com.snoop.model.figuras;

import com.snoop.model.figuras.childs.Hexagono;

public abstract class Figura {

	public abstract Double getArea();
	public abstract Double getPerimetro();
	
	private Integer numLados;
	

	public Figura(Integer lados) {
		this.numLados = lados;
	}
	
	protected Integer getNumLados() {
		return numLados;
	}
	public boolean isHexagono() {
		return this.getClass().equals(Hexagono.class);
	}
	
}
