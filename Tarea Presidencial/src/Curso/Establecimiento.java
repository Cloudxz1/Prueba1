package Curso;

public class Establecimiento {

	private String nombreEst;
	private String DirEst;
	
	public Establecimiento(String nombreEst, String DirEst) {
		
		this.nombreEst = nombreEst;
		this.DirEst = DirEst;
	}
	
	public String getNombreEst() {
		return nombreEst;
	}

	public void setNombreEst(String nombreEst) {
		this.nombreEst = nombreEst;
	}

	public String getDirEst() {
		return DirEst;
	}

	public void setDirEst(String dirEst) {
		DirEst = dirEst;
	}
	
}
