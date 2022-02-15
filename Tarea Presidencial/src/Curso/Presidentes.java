package Curso;

public class Presidentes extends Persona{
	
    private String partido;
    
	public Presidentes(String nombre, int edad, String partido) {
		super(nombre, edad);
	
		this.partido = partido;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

}
