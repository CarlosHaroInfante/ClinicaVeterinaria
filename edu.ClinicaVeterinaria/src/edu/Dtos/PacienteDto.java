package edu.Dtos;

public class PacienteDto {
	
	long idPaciente;
	
	String nombrePaciente = "aaaaa";
	
	int edadPaciente = 11111;
	
	String fchNacimientoPaciente = "9999/12/31 ";
	
	char SexoBiologicoPaciente = 'a';
	
	String especiePaciente = "aaaaa";
	
	long idEsclavo;
	
	
	

	public long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public int getEdadPaciente() {
		return edadPaciente;
	}

	public void setEdadPaciente(int edadPaciente) {
		this.edadPaciente = edadPaciente;
	}

	public String getFchNacimientoPaciente() {
		return fchNacimientoPaciente;
	}

	public void setFchNacimientoPaciente(String fchNacimientoPaciente) {
		this.fchNacimientoPaciente = fchNacimientoPaciente;
	}

	public char getSexoBiologicoPaciente() {
		return SexoBiologicoPaciente;
	}

	public void setSexoBiologicoPaciente(char sexoBiologicoPaciente) {
		SexoBiologicoPaciente = sexoBiologicoPaciente;
	}

	public String getEspeciePaciente() {
		return especiePaciente;
	}

	public void setEspeciePaciente(String especiePaciente) {
		this.especiePaciente = especiePaciente;
	}

	public long getIdEsclavo() {
		return idEsclavo;
	}

	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}
	
	

	public PacienteDto(long idPaciente, String nombrePaciente, int edadPaciente, String fchNacimientoPaciente,
			char sexoBiologicoPaciente, String especiePaciente, long idEsclavo) {
		super();
		this.idPaciente = idPaciente;
		this.nombrePaciente = nombrePaciente;
		this.edadPaciente = edadPaciente;
		this.fchNacimientoPaciente = fchNacimientoPaciente;
		this.SexoBiologicoPaciente = sexoBiologicoPaciente;
		this.especiePaciente = especiePaciente;
		this.idEsclavo = idEsclavo;
	}

	public PacienteDto() {
		super();
	}

	@Override
	public String toString() {
		return "PacienteDto [nombrePaciente=" + nombrePaciente + ", edadPaciente=" + edadPaciente
				+ ", fchNacimientoPaciente=" + fchNacimientoPaciente + ", SexoBiologicoPaciente="
				+ SexoBiologicoPaciente + ", especiePaciente=" + especiePaciente + "]";
	}
	
	
	
	
	
	

}
