package Curso;

public class Votante extends Establecimiento{
	
	private int cod;


	private String nombre;
	private String rut;
	private int edad;


	
	public Votante(int cod,String nombre,String rut, int edad,int codEst,String DirEst,String nombreEst) {
		super(codEst,DirEst,nombreEst);
		this.nombre = nombre;
		this.edad = edad;
		this.cod = cod;
		this.rut = rut;
		
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public String getNombre() {
		return nombre;
	
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
}
