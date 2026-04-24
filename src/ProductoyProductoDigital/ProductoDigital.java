package ProductoyProductoDigital;

public class ProductoDigital extends Producto{

	  @Override
	    public void mostrarDescripcion() {
	        System.out.println(nombre + " - Q" + precio + " (Digital)");
	    }
	
}
