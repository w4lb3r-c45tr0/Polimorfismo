/*
EXPLICACIÓN:

Se aplicó herencia entre Persona y Estudiante.

Se sobrescribió el método presentarse() para incluir
información adicional como carnet y carrera.

Se utilizó polimorfismo con:
Persona p = new Estudiante();

Casos de prueba:
Se ejecutó el método presentarse() verificando que
muestre los datos del estudiante.
*/


package PersonayEstudiante;

public class Main {

	public static void main(String[] args) {
		
		Persona p = new Estudiante(); 
        p.presentarse();
		
	}

}
