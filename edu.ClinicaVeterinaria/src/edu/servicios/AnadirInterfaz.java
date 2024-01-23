package edu.servicios;

import java.util.List;

import edu.Dtos.EsclavoDto;
import edu.Dtos.PacienteDto;

public interface AnadirInterfaz {

	public void darAltaPaciente(List<PacienteDto> listaAntigua);
	
	public void darAltaEsclavo(List<EsclavoDto> listaAntiguaEsclavo);
}
