package CuentayCuentaAhorro;

public class Cuenta {

	   protected double saldo = 1000;

	    public void depositar(double monto) {
	        saldo += monto;
	        System.out.println("Saldo: " + saldo);
	    }
	
	
}
