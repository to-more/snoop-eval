package com.snoop.model.figuras.childs;

import org.junit.Before;

import com.snoop.model.figuras.FiguraTest;
import com.snoop.model.figuras.childs.Hexagono;

public class HexagonoTest extends FiguraTest<Hexagono>{

	
	@Before
	public void setUp() {
		figura = new Hexagono(2.0);
		expectedArea = (12.0 * Math.sqrt(Math.pow(2.0, 2) + Math.pow(2.0 * 0.5, 2))) / 2;
		expectedNumLados = 6; 
		expectedPerimetro = 12.0;
	}
	
}
