package Proj_1;

public  class Pacientes {
	 String nomePaciente;
	 String nascimento;
	 String primeiraConsulta;
	 String retorno;

	public Pacientes(String nomePaciente, String nascimento, String primeiraConsulta, String retorno) {

		this.nomePaciente = nomePaciente;
		this.nascimento = nascimento;
		this.primeiraConsulta = primeiraConsulta;
		this.retorno = retorno;
	}
	public Pacientes() {
		
	}
	
	public void Vizaulizar() {
		System.out.println("\nDados do Paciente\n");
		System.out.println("Nome do Paciente: " + this.getNomePaciente());
		System.out.println("Data de nascimento: " + this.getNascimento());
		System.out.println("Data da primeira consulta: "  + this.getPrimeiraConsulta());
		System.out.println("Retorno para: "+ this.getRetorno());
		
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getPrimeiraConsulta() {
		return primeiraConsulta;
	}

	public void setPrimeiraConsulta(String primeiraConsulta) {
		this.primeiraConsulta = primeiraConsulta;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}
}
