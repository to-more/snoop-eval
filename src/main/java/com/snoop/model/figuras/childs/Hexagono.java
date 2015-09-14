package com.snoop.model.figuras.childs;

import com.snoop.model.figuras.Figura;
import com.snoop.model.workspace.PoligonoRegular;

public class Hexagono extends Figura implements PoligonoRegular{

	private Double radio;

	public Hexagono(Double radio) {
		super(6);
		this.radio = radio;
	}

	@Override
	public Double getArea() {
		return (getPerimetro() * getApotema())/2;
	}

	public Double getApotema() {
		int alCuadrado = 2;
		return Math.sqrt(Math.pow(radio, alCuadrado) + Math.pow(radio * 0.5, alCuadrado));
	}

	@Override
	public Double getPerimetro() {
		return 6 * radio;
	}

}
