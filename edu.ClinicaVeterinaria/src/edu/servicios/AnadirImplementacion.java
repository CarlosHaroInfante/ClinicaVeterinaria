package edu.servicios;

import java.util.List;
import java.util.Scanner;

import edu.Dtos.EsclavoDto;
import edu.Dtos.PacienteDto;

public class AnadirImplementacion implements AnadirInterfaz {
	
	Scanner sc = new Scanner(System.in);


	public void darAltaPaciente(List<PacienteDto> listaAntigua) {
		
		PacienteDto paciente = Alta();
		listaAntigua.add(paciente);
		
	}
	public void darAltaEsclavo(List<EsclavoDto> listaAntiguaEsclavo) {
		EsclavoDto esclavo = AltaEsclavo();
		listaAntiguaEsclavo.add(esclavo);
		
	}
	
	private PacienteDto Alta() {
		
		PacienteDto pacienteN = new PacienteDto();
		
		
		
		System.out.println("Datos del nuevo paciente");
		
		System.out.println("id del paciente: ");
		long id = sc.nextLong();
		pacienteN.setIdEsclavo(id);
		
		System.out.println("Nombre del Paciente: ");
		String nomP = sc.next();
		pacienteN.setNombrePaciente(nomP);
		
		System.out.println("Edad del Paciente: ");
		int edadP = sc.nextInt();
		pacienteN.setEdadPaciente(edadP);
		
		System.out.println("Fecha de Nacimiento del Paciente: ");
		String fchP = sc.next();
		pacienteN.setFchNacimientoPaciente(fchP);
		
		System.out.println("Sexo Biológico del Paciente: ");
		char sexoP = sc.next().charAt(0);
		pacienteN.setSexoBiologicoPaciente(sexoP);
		
		System.out.println("Especie del Paciente");
		String especieP = sc.next();
		pacienteN.setEspeciePaciente(especieP);
		
		
		
		System.out.println("¿Existe el Esclavo? True=Si creado/ False=No creado");
		boolean validar = sc.nextBoolean();
		if(validar == true) {
			System.out.println("id del Esclavo: ");
			long idEsclavo = sc.nextLong();
			pacienteN.setIdPaciente(idEsclavo);
			System.out.println("Paciente añadido/a correctamente");
		}
		else {
			//EsclavoDto EsclavoN = AltaEsclavo();
			System.out.println("Hola");
			
			
			AltaEsclavo();
			
			
		}
		
		return pacienteN;
		
	}
	
	private EsclavoDto AltaEsclavo() {
		
		
		EsclavoDto esclavoN = new EsclavoDto();
		
		System.out.println("Datos del nuevo Esclavo");
		
		System.out.println("id del Esclavo: ");
		long idE = sc.nextLong();
		esclavoN.setIdEsclavo(idE);
		
		System.out.println("Nombre Esclavo: ");
		String NomE = sc.next();
		esclavoN.setNombreEsclavo(NomE);
		
		System.out.println("Apellidos Esclavo: ");
		String ApeE = sc.next();
		esclavoN.setApellidosEsclavo(ApeE);
		
		System.out.println("DNI Paciente: ");
		String DNIE = sc.next();
		esclavoN.setDniEsclavo(DNIE);
		
		System.out.println("Teléfono Paciente: ");
		String TlfE = sc.next();
		esclavoN.setTlfEsclavo(TlfE);
		
		
		return esclavoN;
		
		
	}
}
