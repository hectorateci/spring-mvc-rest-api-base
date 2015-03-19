package org.springseminar.beans.impl;

import org.springseminar.model.Plato;
import org.springseminar.beans.CalculadorIVA;


public class CalculadorIVARegimen2013 implements CalculadorIVA {

	@Override
	public float obtenerPorcentajeIva(Plato p) {
		if (p.getNombre().contains("gaseosa")){
			return 0.10f;
		}
		else{
			return 0.16f;
		}
	}

}
