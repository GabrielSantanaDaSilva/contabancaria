package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.model.contaCorrente;
import conta.model.contaPoupanca;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   BANCO DO POVO                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros \n");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Povo - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}

	}

	public static void keyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "Pressione enter para continuar: \n\n");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter");
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Gabriel Sant'Ana da Silva");
		System.out.println("*********************************************************");
	}
}
