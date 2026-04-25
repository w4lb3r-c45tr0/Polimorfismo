/*
EXPLICACIÓN:

Se aplicó herencia entre Vehiculo y Motocicleta.

Se sobrescribió el método encender() para cambiar
el comportamiento en la motocicleta.

Se utilizó polimorfismo con:
Vehiculo v = new Motocicleta();

Casos de prueba:
Se ejecutó el método encender() verificando que
muestre el mensaje correcto.
*/


package VehiculoyMotocicleta;

public class Main {

	public static void main(String[] args) {
	
		Vehiculo v = new Motocicleta();
        v.encender();

		
	}

}
