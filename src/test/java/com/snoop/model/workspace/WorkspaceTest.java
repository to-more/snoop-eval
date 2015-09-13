package com.snoop.model.workspace;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.snoop.model.figuras.childs.Cuadrado;
import com.snoop.model.figuras.childs.Hexagono;

public class WorkspaceTest {

	private Workspace workspace;
	private Cuadrado cuadrado = new Cuadrado(2.0);
	
	@Before
	public void setUp(){
		workspace = new Workspace(1);
	}
	
	@Test
	public void contains(){
		workspace.agregar(cuadrado);
		assertTrue(workspace.contains(cuadrado));
	}
	
	@Test
	public void isEmpty(){
		assertTrue(workspace.isEmpty());
	}
	
	@Test
	public void agregarFigura(){
		workspace.agregar(cuadrado);
		assertTrue(!workspace.isEmpty());
	}
	
	@Test
	public void eliminarFigura(){
		workspace.agregar(cuadrado);
		workspace.eliminar(cuadrado);
		assertTrue(workspace.isEmpty());
	}
	
	@Test
	public void isLleno(){
		workspace.agregar(cuadrado);
		assertTrue(workspace.isLleno());
	}
	
	@Test
	public void getAreaTotal(){
		workspace.agregar(cuadrado);
		Double areaTotalExpected = 4.0;
		assertEquals(areaTotalExpected, workspace.getAreaTotal());
	}
	
	
	@Test
	public void cambiarFigura(){
		Hexagono hexagono = new Hexagono(4.0);
		workspace.agregar(cuadrado);
		workspace.cambiarFigura(cuadrado, hexagono);
		assertTrue(workspace.contains(hexagono));
	}
}
