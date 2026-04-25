/*
EXPLICACIÓN:

Se aplicó herencia entre Trabajador y TrabajadorPorHora.

Se sobrescribió el método calcularPago()
para calcular el pago basado en horas trabajadas.

Se utilizó polimorfismo con:
Trabajador t = new TrabajadorPorHora();

Casos de prueba:
Se calculó el pago total verificando que el resultado
sea correcto según horas y pago por hora.
*/


package TrabajadoryTrabajadorPorHora;

public class Main {

	public static void main(String[] args) {
		
		   Trabajador t = new TrabajadorPorHora();
	        System.out.println("Pago: " + t.calcularPago());
		
	}

}
