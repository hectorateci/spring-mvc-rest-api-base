package org.springseminar.beans;

import org.springseminar.model.Orden;

public interface CalculadorCuenta {
	
	public int calcularCosto(Orden o);
	
}
