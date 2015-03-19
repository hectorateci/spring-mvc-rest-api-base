package org.springseminar.beans.impl;

import org.springseminar.model.Orden;
import org.springseminar.model.Plato;
import org.springseminar.beans.CalculadorCuenta;

public class CalculadorBasicoCuentas implements CalculadorCuenta {

	@Override
	public int calcularCosto(Orden o) {
		int total=0;
		for (Plato p:o.getPlatos()){
			total+=p.getPrecio();
		}
		return total;
	}

}
