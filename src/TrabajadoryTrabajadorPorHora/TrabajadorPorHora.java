package TrabajadoryTrabajadorPorHora;

public class TrabajadorPorHora extends Trabajador {
	
	 private int horas = 40;
	    private double pagoHora = 50;

	    @Override
	    public double calcularPago() {
	        return horas * pagoHora;
	    }

}
