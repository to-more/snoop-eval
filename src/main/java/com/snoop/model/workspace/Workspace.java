package com.snoop.model.workspace;

import java.util.ArrayList;
import java.util.List;

import com.snoop.model.figuras.Figura;

public class Workspace {

	private List<Figura> figuras;
	private Integer limiteFiguras;
	
	public Workspace(Integer limiteFiguras) {
		this.figuras = new ArrayList<>(limiteFiguras);
		this.limiteFiguras = limiteFiguras;
	}
	
	public void agregar(Figura figura) {
		if(this.figuras.size() < limiteFiguras){
			this.figuras.add(figura);			
		}
	}

	public Boolean isEmpty() {
		return this.figuras.isEmpty();
	}

	public void eliminar(Figura figura) {
		this.figuras.remove(figura);
	}

	public Boolean isLleno() {
		return this.figuras.size() == limiteFiguras.intValue();
	}

	public Double  getAreaTotal() {
		Double areaTotal = 0.0;
		
		for (Figura figura : this.figuras) {
			areaTotal = figura.getArea();
		}
		
		return areaTotal;
	}

	public void cambiarFigura(Figura actual, Figura nueva) {
		int indexActual = this.figuras.indexOf(actual);
		this.figuras.set(indexActual, nueva);
	}

	public boolean contains(Figura figura) {
		return figuras.contains(figura);
	}
}
