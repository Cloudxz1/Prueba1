package Curso;

import java.util.ArrayList;

public class Votante extends Persona{
	
	private int cod;

	private String rut;
	private Presidentes pre;
	private ArrayList<Establecimiento> esta;


	public Votante(int cod,String nombre,String rut, int edad, Presidentes pre, ArrayList<Establecimiento>esta) {
		super(nombre,edad);
		this.cod = cod;
		this.rut = rut;
		this.pre = pre;
		this.esta = esta;
	}
	public Presidentes getPre() {
		return pre;
	}
	public void setPre(Presidentes pre) {
		this.pre = pre;
	}
	public ArrayList<Establecimiento> getEsta() {
		return esta;
	}
	public void setEsta(ArrayList<Establecimiento> esta) {
		this.esta = esta;
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
	public Presidentes getPresidentes() {
		
		return pre;
	}
}
