package Proj_1;

import Proj_1.Cores_Pacientes;
import java.util.InputMismatchException;
import java.util.Scanner;
import Proj_1.Pacientes;
import Proj_1.Pacientes_Controller;

public class Lista_Pacientes {

	public static void main(String[] args) {
		Pacientes_Controller listaPacientes = new Pacientes_Controller(null, null, null, null);
		Scanner ler = new Scanner(System.in);
		String nomePaciente;
		String nascimento;
		String primeiraConsulta;
		String retorno;
		Pacientes nome2 = null;
		int apagar;
		int opcao = 0;
		
		Pacientes_Controller drRey = new Pacientes_Controller("Dr Rey", "01/10/1961", "Fundou a clínica", "É o proprietário");
		listaPacientes.cadastrarPaciente(drRey);
		while (true) {

			System.out.println(Cores_Pacientes.TEXT_GREEN_BRIGHT + Cores_Pacientes.ANSI_BLACK_BACKGROUND
					+ "************************************************");
			System.out.println("                                                ");
			System.out.println("                 Clinica Dr Rey                 ");
			System.out.println("                                                ");
			System.out.println("************************************************");
			System.out.println("            Digite a opção desejada:            ");
			System.out.println("        1 - Cadastrar novo paciente             ");
			System.out.println("        2 - Listar todos Pacientes              ");
			System.out.println("        3 - Apagar cadastro                     ");
			System.out.println("        4 - Pesquisar pacientes                 ");
			System.out.println("        0 - Para sair                           ");
			try {

				opcao = ler.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite somente numeros inteiros");
				System.out.println("Erro apresentado: " + e);
			}
			if (opcao == 0) {
				System.out.println("Obrigado por usar nosso sistema!                ");
				System.exit(opcao);
			}
			if (opcao > 4) {
				System.out.println("Por favor, digite um número entre 1 e 4!        ");
			}
			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do paciente: ");
				ler.skip("\\R?");
				nomePaciente = ler.nextLine();
				System.out.println("Data de nascimento: ");
				nascimento = ler.nextLine();
				System.out.println("Data da primeira consulta: ");
				primeiraConsulta = ler.nextLine();
				System.out.println("Data do retorno: ");
				retorno = ler.nextLine();

				listaPacientes.cadastrarPaciente(new Pacientes(nomePaciente, nascimento, primeiraConsulta, retorno));

				break;

			case 2:
				listaPacientes.listarPacientes();
			
				break;

			case 3:
				System.out.println("Lembre-se que o Dr Rey é o paciente 0!!");
				System.out.println("Qual paciente deseja apagar?");
				try {
					apagar = ler.nextInt();
					listaPacientes.deletarPaciente(apagar);
					System.out.println("Lista atualizada!!");
					listaPacientes.listarPacientes();
				} catch (Exception e) {
					System.out.println("Digite somente numeros inteiros");
					System.out.println("Erro apresentado: " + e);
					System.exit(opcao);
				}

				break;

			case 4:
				// este método ainda não funciona

				System.out.println("Digite o nome que deseja pesquisar: ");
				ler.skip("\\R?");
				nomePaciente = ler.nextLine();
				listaPacientes.pesquisar(nome2);

				break;

			}
		}
	}

}
