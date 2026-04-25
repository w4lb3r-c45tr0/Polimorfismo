/*
EXPLICACIÓN:

Se aplicó herencia entre Figura (clase base) y Rectangulo (clase hija).

Se sobrescribió el método area() para calcular base * altura.

Se aplicó polimorfismo usando:
Figura f = new Rectangulo();

Casos de prueba:
Se creó un rectángulo y se calculó su área,
verificando que el resultado sea correcto.
*/


package FigurayRectangulo;

public class Main {

	public static void main(String[] args) {
		
	System.out.println("=== RECTANGULO ===");	
	Rectangulo r = new Rectangulo(3, 7);
	System.out.println("\nArea: " + r.area());	
	 

	}

}
