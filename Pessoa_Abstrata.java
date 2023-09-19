package Proj_1;

public abstract class Pessoa_Abstrata {
	 private String nomePaciente;
	 private String nascimento;
	 private String primeiraConsulta;
	 private String retorno;
	
	public Pessoa_Abstrata(String nomePaciente, String nascimento, String primeiraConsulta, String retorno) {
	
		this.nomePaciente = nomePaciente;
		this.nascimento = nascimento;
		this.primeiraConsulta = primeiraConsulta;
		this.retorno = retorno;
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
	public String  toString()  {
		return "\n                                                 \n"
				+ "                Dados do Paciente                "
				+ "\n                                                 "
				+ "\n*************************************************" + "\nNome do Paciente: " + nomePaciente
				+ "       " + "\nData de nascimento: " + nascimento + "       " + "\nData da primeira consulta: "
				+ primeiraConsulta + "       " + "\nRetorno para: " + retorno + "       ";
	}
}
