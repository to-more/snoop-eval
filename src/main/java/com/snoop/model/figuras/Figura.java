package com.snoop.model.figuras;

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
}
