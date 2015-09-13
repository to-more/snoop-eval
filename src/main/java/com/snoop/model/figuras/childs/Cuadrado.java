package com.snoop.model.figuras.childs;

import com.snoop.model.figuras.Figura;

public class Cuadrado extends Figura {

	private Double lado;
	
	
	
	public Cuadrado(Double lado) {
		super(4);
		this.lado = lado;
	}


	@Override
	public Double getArea() {
		return lado * lado;
	}


	@Override
	public Double getPerimetro() {
		return lado * 4;
	}

}
