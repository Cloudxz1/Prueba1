package Curso;

public class Establecimiento {

	private int codEst;
	private String DirEst;
	private String nombreEst;
	
	
	public Establecimiento(int codEst, String dirEst, String nombreEst) {
		this.codEst = codEst;
		this.DirEst = dirEst;
		this.nombreEst = nombreEst;
	}
	
	public int getCodEst() {
		return codEst;
	}
	public void setCodEst(int codEst) {
		this.codEst = codEst;
	}
	public String getDirEst() {
		return DirEst;
	}
	public void setDirEst(String dirEst) {
		DirEst = dirEst;
	}
	
	public String getNombreEst() {
		return nombreEst;
	}

	public void setNombreEst(String nombreEst) {
		this.nombreEst = nombreEst;
	}
	
	
}
