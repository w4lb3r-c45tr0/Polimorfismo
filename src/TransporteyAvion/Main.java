/*
EXPLICACIÓN:

Se aplicó herencia entre Transporte y Avion.

Se sobrescribió el método moverse() para mostrar
un comportamiento específico del avión.

Se utilizó polimorfismo con:
Transporte t = new Avion();

Casos de prueba:
Se llamó al método moverse() y se verificó que
muestre el mensaje del avión.
*/


package TransporteyAvion;

public class Main {

	public static void main(String[] args) {
		
		Transporte t = new Avion(); 
        t.moverse();
		
	}

}
