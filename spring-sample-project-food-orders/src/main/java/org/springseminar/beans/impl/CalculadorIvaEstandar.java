package org.springseminar.beans.impl;

import org.springframework.stereotype.Service;
import org.springseminar.model.Plato;
import org.springseminar.beans.CalculadorIVA;

@Service
public class CalculadorIvaEstandar implements CalculadorIVA {

	@Override
	public float obtenerPorcentajeIva(Plato p) {
		return 0.16f;
	}

}
