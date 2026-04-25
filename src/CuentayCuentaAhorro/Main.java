/*
EXPLICACIÓN:

Se aplicó herencia entre Cuenta y CuentaAhorro.

Se sobrescribió el método depositar() para agregar
un interés al monto depositado.

Se aplicó polimorfismo usando:
Cuenta c = new CuentaAhorro();

Casos de prueba:
Se realizó un depósito y se verificó que el saldo
incluya el interés adicional.
*/


package CuentayCuentaAhorro;

public class Main {

	public static void main(String[] args) {
		
		  Cuenta c = new CuentaAhorro();   
		  c.depositar(500);
	}

}
