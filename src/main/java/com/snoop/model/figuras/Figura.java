package com.snoop.model.figuras;

import com.snoop.model.workspace.PoligonoRegular;

public abstract class Figura implements PoligonoRegular{

	public abstract Double getArea();
	public abstract Double getPerimetro();
	
	private Integer numLados;
	

	public Figura(Integer lados) {
		this.numLados = lados;
	}
	
	protected Integer getNumLados() {
		return numLados;
	}
	
	public Double getApotema(){
		return 0.0;
	}
	
	public Boolean isRegular(){
		return true;
	}
}
