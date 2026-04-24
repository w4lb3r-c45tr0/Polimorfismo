package PersonayEstudiante;

public class Estudiante extends Persona {

	  private String carnet = "2025";
	    private String carrera = "Ingeniería";

	    @Override
	    public void presentarse() {
	        System.out.println("Soy estudiante, carnet: " + carnet + ", carrera: " + carrera);
	    }
	
}
