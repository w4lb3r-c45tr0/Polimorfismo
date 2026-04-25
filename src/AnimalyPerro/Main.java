/*
EXPLICACIÓN:

Se aplicó herencia creando la clase Animal como clase base
y la clase Perro como clase hija.

Se sobrescribió el método hacerSonido() en la clase Perro
para cambiar el comportamiento del método heredado.

Se aplicó polimorfismo al usar:
Animal a = new Perro();

Casos de prueba:
Se creó un objeto Perro y se llamó al método hacerSonido(),
verificando que se ejecute el sonido del perro y no el genérico.
*/

package AnimalyPerro;

public class Main {

	public static void main(String[] args) {
		
		
		 Animal a = new Perro(); 
	        a.hacerSonido();
		
	}
	
}
