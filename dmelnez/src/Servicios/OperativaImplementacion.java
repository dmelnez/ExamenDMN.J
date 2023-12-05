package Servicios;

import java.util.Scanner;

public class OperativaImplementacion implements OperativaInterfaz{

	
	
	public long añadirVenta() {
		
		
		Scanner venta = new Scanner (System.in);
		
		long cantidadTotal = 0;
		
		System.out.println("Cantidad de la venta");
		cantidadTotal = venta.nextLong();
		
		
		/*Dinero Suma*/
		return cantidadTotal;
	}
	
	
	
	public long añadirGasto(long cantidadDinero) {
		
		
		Scanner gasto = new Scanner (System.in);
		
		
		long dinero = cantidadDinero;
		System.out.println(dinero);
		
		
		System.out.println("Introduzca el nuevo gasto");
		
		long gastoDinero = gasto.nextLong();
		
		long dineroTotal = dinero - gastoDinero;
		
		
		if(dineroTotal ==0 ) {
			System.out.println("######################################");
			System.out.println("# [ALERTA] - Se ha llegado a 0 Euros #");
			System.out.println("######################################");
		}
		

		if(dineroTotal < 0 ) {
			System.out.println("#############################");
			System.out.println("# [ALERTA] - Se debe Dinero #");
			System.out.println("#############################");
			
		}
		
		
		return dineroTotal;
		
		
	}
	
	
	public void totalDinero(long dineroTotal) {
		
		long dineroLlevado = dineroTotal;
		System.out.println("Dinero Total: " + dineroLlevado);
		
		if(dineroLlevado == 0) {
			
			System.out.println("#############################");
			System.out.println("# [ATENCION!!!] - Vamos Mal #");
			System.out.println("#############################");
			
		}
		
		if (dineroLlevado < 0) {
			System.out.println("#################################");
			System.out.println("# [ATENCION!!!] - Vamos Muy Mal #");
			System.out.println("#################################");
			
			
		}
		
	}
	
	
	
	
	
}
