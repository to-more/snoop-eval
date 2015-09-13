package com.snoop.model.figuras.childs;

import org.junit.Before;

import com.snoop.model.figuras.FiguraTest;
import com.snoop.model.figuras.childs.Triangulo;

public class TrianguloTest extends FiguraTest<Triangulo>{

	
	@Before
	public void setUp() throws Exception{
		figura = new Triangulo(1, 1, Math.sqrt(2));
		expectedArea = new Double(1.0 / 2.0);
		expectedNumLados = 3;
		expectedPerimetro = 2 + Math.sqrt(2);
	}
		
}
