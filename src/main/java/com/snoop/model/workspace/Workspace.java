package com.snoop.model.workspace;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.snoop.model.figuras.Figura;

public class Workspace implements Serializable{



	private static final long serialVersionUID = 5936954186023588461L;
	private List<Figura> figuras;
	private Integer limiteFiguras;
	
	private Long id;
	
	
	
	public Workspace(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

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
	
	public Double getApotemaTotal(){

		Double apotemaTotal = 0.0;
		
		for(Figura figura : this.figuras){
			if(figura.isRegular()){
				apotemaTotal += figura.getApotema();
			}
		}
		return apotemaTotal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Workspace [figuras=");
		builder.append(figuras);
		builder.append(", limiteFiguras=");
//		builder.append(limiteFiguras);
//		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

}
