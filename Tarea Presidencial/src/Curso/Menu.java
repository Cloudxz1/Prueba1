package Curso;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Creacion de Votantes, Presidentes, Establecimiento
		 */
		Presidentes pre1 = new Presidentes("Juancho",52,"CocoCabra");
		Presidentes pre2 = new Presidentes("Emmanuel",44,"Partido Comunista che");
		Presidentes pre3 = new Presidentes("Gabriel",8982,"CocoCabra");
		Presidentes pre4 = new Presidentes("Manuel",4214,"Partido Comunista che");
		
		Establecimiento est1 = new Establecimiento("Escuela Mondiola", "Pedro Lobos #7514");
		Establecimiento es3 = new Establecimiento("Escuela Mondiola", "Pedro Lobos #7514");
		
		Votante vot1 =  new Votante(1,"Vanesa","19968462-0",22, pre3, new ArrayList<Establecimiento>());
		
		vot1.getEsta().add(es3);
		
		System.out.println("=====================================================");
		System.out.println("============= ELECCIONES PRESIDENCIALES =============");
		System.out.println("=====================================================");
		System.out.println();
		
		System.out.println("=============== Datos de los cantidatos electos ==============");
		System.out.println("Nombre del candidato:" + pre1.getNombre() + "\n" + "Edad del candidato:" + pre1.getEdad() + "\n" + "Partido:" + pre1.getPartido() + "\n");
		System.out.println("Nombre del candidato:" + pre2.getNombre() + "\n" + "Edad del candidato:" + pre2.getEdad() + "\n" + "Partido:" + pre2.getPartido() + "\n");
		System.out.println("Nombre del candidato:" + pre3.getNombre() + "\n" + "Edad del candidato:" + pre3.getEdad() + "\n" + "Partido:" + pre3.getPartido() + "\n");
		System.out.println("Nombre del candidato:" + pre4.getNombre() + "\n" + "Edad del candidato:" + pre4.getEdad() + "\n" + "Partido:" + pre4.getPartido() + "\n");
		
		
		String es = "";
		
		for(int i = 0 ;  i<vot1.getEsta().size() ; i++) {
			
			es = es + vot1.getEsta().get(i).getNombreEst();
		}
		
		System.out.println("============== Datos de los Votantes =================");
		System.out.println("Nombre: " +vot1.getNombre() + "\n" + "Rut: " +vot1.getRut() + "\n" + "Edad: " +vot1.getEdad() + "\n"
				+ "Lugar de Establecimiento: "  +"\n" + "Voto por el " + vot1.getPresidentes().getPartido() + "\n" + "En la direccion: " +es) ;
		
		
		try {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un nombre");
		String nombreP = leer.nextLine();
		System.out.println("Ingrese su edad");
		int edadP = Integer.parseInt(leer.nextLine());
		System.out.println("Ingrese el partido politico que pertenece");
		String partidoP = leer.nextLine();
	
		
		Presidentes p3 = new Presidentes(nombreP,edadP,partidoP);
		
		System.out.println(p3.GetPresidente());
		
		}catch(NumberFormatException e) {
			
			System.out.println("No se puede ingresar una letra en la edad");
		}
		
	}

}
