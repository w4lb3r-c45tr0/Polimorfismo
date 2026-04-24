package EmpleadoyVendedor;

public class Vendedor extends Empleado {

	private double comision = 500;

	@Override
	public void resumen() {
    System.out.println("Empleado: " + nombre + " Comisión: " + comision);
    
	}

	
}
