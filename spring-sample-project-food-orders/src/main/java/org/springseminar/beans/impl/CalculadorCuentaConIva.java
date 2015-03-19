package org.springseminar.beans.impl;

import org.springseminar.model.Orden;
import org.springseminar.model.Plato;
import org.springseminar.beans.CalculadorCuenta;
import org.springseminar.beans.CalculadorIVA;


public class CalculadorCuentaConIva implements CalculadorCuenta {

	CalculadorIVA civa;
	
	
	@Override
	public int calcularCosto(Orden o) {
		int total=0;
		for (Plato p:o.getPlatos()){
			total+=p.getPrecio()*(1+civa.obtenerPorcentajeIva(p));
		}
		return total;
	}

}
