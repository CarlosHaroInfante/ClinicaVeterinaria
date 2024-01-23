package edu.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	public int menu() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menú Clinica Veterinaria Paqui");
		System.out.println("------------------------------");
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Dar alta paciente");
		System.out.println("------------------------------");
		
		int opcion = sc.nextInt();
		
		return opcion;
		
		
	}
}
