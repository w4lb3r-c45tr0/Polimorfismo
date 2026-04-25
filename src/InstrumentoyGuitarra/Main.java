/*
EXPLICACIÓN:

Se aplicó herencia entre Instrumento y Guitarra.

Se sobrescribió el método tocar() para mostrar
el sonido específico de la guitarra.

Se utilizó polimorfismo con:
Instrumento i = new Guitarra();

Casos de prueba:
Se llamó al método tocar() verificando que
se ejecute el sonido de la guitarra.
*/


package InstrumentoyGuitarra;

public class Main {

	public static void main(String[] args) {
		
		Instrumento i = new Guitarra(); 
        i.tocar();
		
	}

}
