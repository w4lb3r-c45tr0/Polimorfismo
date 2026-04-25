/*
EXPLICACIÓN:

Se aplicó herencia entre Producto y ProductoDigital.

Se sobrescribió el método mostrarDescripcion()
para agregar información adicional del producto digital.

Se utilizó polimorfismo con:
Producto p = new ProductoDigital();

Casos de prueba:
Se ejecutó el método mostrarDescripcion()
verificando que incluya el tipo digital.
*/


package ProductoyProductoDigital;

public class Main {

	public static void main(String[] args) {
	
		 Producto p = new ProductoDigital(); 
	        p.mostrarDescripcion();
		
	}

}
