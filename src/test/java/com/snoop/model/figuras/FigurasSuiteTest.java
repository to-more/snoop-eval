package com.snoop.model.figuras;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.snoop.model.figuras.childs.CuadradoTest;
import com.snoop.model.figuras.childs.HexagonoTest;
import com.snoop.model.figuras.childs.TrianguloTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	CuadradoTest.class, 
	HexagonoTest.class,
	TrianguloTest.class 
})
public class FigurasSuiteTest {

}
