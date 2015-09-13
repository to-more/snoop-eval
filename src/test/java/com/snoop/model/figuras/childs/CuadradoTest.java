package com.snoop.model.figuras.childs;

import org.junit.Before;

import com.snoop.model.figuras.FiguraTest;
import com.snoop.model.figuras.childs.Cuadrado;

public class CuadradoTest extends FiguraTest<Cuadrado>{

	
	@Before
	public void setUp() {
		figura = new Cuadrado(2.0);
		expectedArea = new Double(4.0);
		expectedNumLados = 4;
		expectedPerimetro = 8.0;
	}
	
}
