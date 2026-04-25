/*
EXPLICACIÓN:

Se aplicó herencia creando la clase Empleado y la clase Vendedor.

Se sobrescribió el método resumen() en Vendedor
para incluir la comisión.

Se utilizó polimorfismo con:
Empleado e = new Vendedor();

Casos de prueba:
Se ejecutó el método resumen() y se verificó que
muestre nombre y comisión correctamente.
*/


package EmpleadoyVendedor;

public class Main {

	public static void main(String[] args) {
		
		 Empleado e = new Vendedor(); 
	     e.resumen();


}
	
}
