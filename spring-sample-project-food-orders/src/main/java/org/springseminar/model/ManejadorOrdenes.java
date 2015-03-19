package org.springseminar.model;

import java.util.LinkedList;
import java.util.List;

import org.springseminar.beans.CalculadorCuenta;


public class ManejadorOrdenes {


	CalculadorCuenta calc=null;
	
	List<Orden> ordenes;
	
	public ManejadorOrdenes(){
		ordenes=new LinkedList<>();
                cargarOrdenes(this);
	}

        public List<Orden> getOrdenes() {
            return ordenes;
        }
	
	public void registrarOrden(Orden o){
		ordenes.add(o);
	}

        public void setCalculadorCuenta(CalculadorCuenta calc) {
            this.calc = calc;
        }

        
        
	public Orden consultarOrden(int n) throws ExcepcionManejadorOrdenes{
		if (n>=ordenes.size()) throw new ExcepcionManejadorOrdenes("Orden inexistente:");
		return ordenes.get(n);
	}
	
	public int calcularTotalOrden(int n) throws ExcepcionManejadorOrdenes{
		if (n>=ordenes.size()) throw new ExcepcionManejadorOrdenes("Orden inexistente:");
		return calc.calcularCosto(ordenes.get(n));		
	}
	
        private static void cargarOrdenes(ManejadorOrdenes mo){
		Orden o=new Orden();
		o.agregarPlato(new Plato("pizza",7500));
		o.agregarPlato(new Plato("gaseosa",3900));
		o.agregarPlato(new Plato("hamburguesa",8000));
		o.agregarPlato(new Plato("gaseosa 350",200));
		
		mo.registrarOrden(o);
		
		o=new Orden();
		
		o.agregarPlato(new Plato("pizza",7500));
		o.agregarPlato(new Plato("pizza",7500));
		o.agregarPlato(new Plato("pizza",7500));
		o.agregarPlato(new Plato("gaseosa litro",4000));
		
		mo.registrarOrden(o);
	}
        
}
