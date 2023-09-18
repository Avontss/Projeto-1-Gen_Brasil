package Proj_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Proj_1.Pacientes;

public class Pacientes_Controller extends Pacientes implements Pacientes_Interface {

	public Pacientes_Controller(String nomePaciente, String nascimento, String primeiraConsulta, String retorno) {
		super(nomePaciente, nascimento, primeiraConsulta, retorno);
		
	}
	
	
	private ArrayList<Pacientes> listandoPacientes = new ArrayList<>();
	
	
	
	@Override
	public void listarPacientes() {
		
		for (var pacientes : listandoPacientes) {
			pacientes.Vizaulizar();
		}
		
		
	}

	@Override
	public void cadastrarPaciente(Pacientes pacientes) {
		listandoPacientes.add(pacientes);
		System.out.println("Paciente cadastrado com sucesso!");
		
		
	}

	@Override
	public void deletarPaciente(int numero) {
		
		listandoPacientes.remove(numero);
		System.out.println("Paciente apagado com sucesso");
	}

	@Override
	public void pesquisar(Pacientes pacientes) {
		
		List<String> pesquisando = listandoPacientes.stream() 
		.filter(x-> x.toString().startsWith("J"))
        .collect(Collectors.toList());
		
		System.out.println("Pacientes com esse nome: " + pesquisando);
	}
		
	}
	

	//if (listandoPacientes.contains(this.getNomePaciente())){
		//System.out.println("Paciente encontrado!");
	//} else {System.out.println("Paciente não encontrado!");}
//} 


