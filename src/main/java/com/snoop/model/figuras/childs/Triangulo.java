package com.snoop.model.figuras.childs;

import com.snoop.model.figuras.Figura;

public class Triangulo extends Figura{

	private Double base;
	private Double altura;
	private Double hipotenusa;
	
	public Triangulo() {
		super(3);
	}
	
	public Triangulo(double base, double altura, double hipotenusa) throws Exception {
		super(3);
		if(!Triangulo.pitagoras(base, altura, hipotenusa)){
			throw new Exception("El triangulo creado no cumple con Pitagoras");
		}
		this.altura = altura;
		this.base = base;
		this.hipotenusa = hipotenusa;
	}

	private static boolean pitagoras(double base, double altura, double hipotenusa) {
		return (Math.pow(base, 2) + Math.pow(altura, 2)) == Math.round(Math.pow(hipotenusa, 2));
	}


	@Override
	public Double getArea() {
		return (base * altura) / 2;
	}


	public Double getHipotenusa() {
		return hipotenusa;
	}


	@Override
	public Double getPerimetro() {
		return altura + base + hipotenusa;
	}

	public Boolean isRegular(){
		return false;
	}
	
	public Double getApotema() throws UnsupportedOperationException{
		throw new UnsupportedOperationException("El triangulo no soporta apotemas");
	}

}
