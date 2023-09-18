package Proj_1;

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
		int apagar;
		int opcao = 0;

		do {

			System.out.println("\n***********************************************\n");
			System.out.println("                 Clinica Dr Rey                 ");
			System.out.println("\n***********************************************");
			System.out.println("            Digite a opção desejada:              ");
			System.out.println("        1 - Cadastrar novo paciente               ");
			System.out.println("        2 - Listar todos Pacientes                ");
			System.out.println("        3 - Apagar cadastro                       ");
			System.out.println("        4 - Pesquisar pacientes                   ");
			System.out.println("        0 - Para sair                             ");
			opcao = ler.nextInt();

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
				System.out.println("Qual paciente deseja apagar?");
				apagar = ler.nextInt();
				listaPacientes.deletarPaciente(apagar);

				break;

			case 4:
				System.out.println("Digite o nome que deseja pesquisar: ");
				ler.skip("\\R?");
				nomePaciente = ler.nextLine();
				listaPacientes.pesquisar(nomePaciente);
			
				break;

			}
		} while (opcao != 0);
		System.out.println("Obrigado por utilizar nosso sistema!");
	}

}
