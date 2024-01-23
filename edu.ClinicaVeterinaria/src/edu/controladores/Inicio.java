package edu.controladores;

import java.util.ArrayList;
import java.util.List;

import edu.Dtos.EsclavoDto;
import edu.Dtos.PacienteDto;
import edu.servicios.AnadirImplementacion;
import edu.servicios.AnadirInterfaz;
import edu.servicios.MenuImplementacion;
import edu.servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EsclavoDto esclavo1 = new EsclavoDto();
		PacienteDto paciente1 = new PacienteDto();
		MenuInterfaz menu = new MenuImplementacion();
		AnadirInterfaz ana = new AnadirImplementacion();
		
		List<PacienteDto> listaPaciente = new ArrayList<PacienteDto>();
		List<EsclavoDto> listaEsclavo = new ArrayList<EsclavoDto>();
		
		boolean cerrarMenu = false;
		
		while(!cerrarMenu) {
			
			int opcion = menu.menu();
			
			switch(opcion) {
			
			case 0:
				System.out.println("Cerrar Menú");
				cerrarMenu = true;
				break;
			
			case 1:
				System.out.println("Añadir nuevo paciente");
				ana.darAltaPaciente(listaPaciente);
				break;
			
			default:
				System.out.println("Ninguna opción seleccionada");
				break;
			}
			
		}
		
		
	}

}
