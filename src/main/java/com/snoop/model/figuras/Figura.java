package com.snoop.model.figuras;

import java.io.Serializable;

import com.snoop.model.workspace.PoligonoRegular;

public abstract class Figura implements Serializable, PoligonoRegular{

	private static final long serialVersionUID = 5972974619580580938L;


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
		return new Double(0.0);
	}
	
	public Boolean isRegular(){
		return true;
	}
}
