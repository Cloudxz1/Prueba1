package Curso;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Creacion de Votantes, Presidentes, Establecimiento
		 */
		Presidentes pre1 = new Presidentes("Juancho",52,"CocoCabra");
		Presidentes pre2 = new Presidentes("Emmanuel",44,"Partido Comunista che");
		Presidentes pre3 = new Presidentes("Juancho",52,"CocoCabra");
		Presidentes pre4 = new Presidentes("Emmanuel",44,"Partido Comunista che");
		
		Establecimiento est1 = new Establecimiento(6378,"Escuela Las Americas","Pedro Lobos #7514");
		
		Votante vot1 =  new Votante(1,"Vanesa","19968462-0",22, est1.getCodEst(),est1.getNombreEst(),est1.getDirEst());
		
		
		
		System.out.println("=====================================================");
		System.out.println("============= ELECCIONES PRESIDENCIALES =============");
		System.out.println("=====================================================");
		System.out.println();
		
		System.out.println("=============== Datos de los cantidatos electos ==============");
		System.out.println("Nombre del candidato:" + pre1.getNombre() + "\n" + "Edad del candidato:" + pre1.getEdad() + "\n" + "Partido:" + pre1.getPartido() + "\n");
		System.out.println("Nombre del candidato:" + pre2.getNombre() + "\n" + "Edad del candidato:" + pre2.getEdad() + "\n" + "Partido:" + pre2.getPartido() + "\n");
		System.out.println("Nombre del candidato:" + pre3.getNombre() + "\n" + "Edad del candidato:" + pre3.getEdad() + "\n" + "Partido:" + pre3.getPartido() + "\n");
		System.out.println("Nombre del candidato:" + pre4.getNombre() + "\n" + "Edad del candidato:" + pre4.getEdad() + "\n" + "Partido:" + pre4.getPartido() + "\n");
		
		
		System.out.println("============== Datos de los Votantes =================");
		System.out.println("Nombre: " +vot1.getNombre() + "\n" + "Rut: " +vot1.getRut() + "\n" + "Edad: " +vot1.getEdad() + "\n"
				+ "Lugar de Establecimiento: " +vot1.getNombreEst() + "\n" + "Cod Establecimiento: " +vot1.getCodEst() + "\n"
				+ "Direccion Establecimiento: " +vot1.getDirEst() + "\n");
	}

}
