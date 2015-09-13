package com.snoop.model.figuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class FiguraTest<T extends Figura> {

	protected T figura;
	protected Double expectedArea;
	protected Integer expectedNumLados;
	protected Double expectedPerimetro;
	
	@Test
	public void getPerimetro(){
		assertEquals(expectedPerimetro, figura.getPerimetro());
	}
	
	@Test
	public void getArea(){
		assertEquals(expectedArea, figura.getArea());
	}
	
	@Test
	public void getNumLados() throws Exception{
		assertEquals(expectedNumLados, figura.getNumLados());
	}
	
}
