package projetocalculadora;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Calculadora calculadora = new Calculadora();

		String opcao = "";
		double n1 = 0, n2 = 0;

		do {
			if (!calculadora.getStatusCalculadoraLigada()) { // Exibido apenas se a calculadora estiver desligada
				System.out.println("Pressione a tecla [L/l] para ligar a calculadora");
				opcao = entrada.nextLine();

				if (opcao.equalsIgnoreCase("L")) {
					calculadora.setStatusCalculadoraLigada(true);
					calculadora.ligarCalculadora("L");
				} else {
					System.out.println("Opção inválida! Pressione [L] para ligar.");
					continue; // Volta ao início do loop, não exibe o menu
				}
			}

			System.out.println();
			System.out.println("BEM VINDO CALCULADORA");
			System.out.println(" ================ ");
			System.out.println("| MENU DE OPÇÕES |");
			System.out.println(" ================ ");
			System.out.println("ESCOLHA UM OPERADOR");
			System.out.println(" ================ ");
			System.out.println("[ x ] MULTIPLICAR");
			System.out.println("[ / ] DIVIDIR");
			System.out.println("[ + ] SOMAR");
			System.out.println("[ - ] SUBTRAIR");
			System.out.println("[ D ] DESLIGAR");
			System.out.println("Escolha uma opção");
			opcao = entrada.nextLine().toLowerCase();
			switch (opcao) {
			case "L":
				String ligar = entrada.nextLine();
				calculadora.ligarCalculadora(ligar);

				break;
			case "x":
				System.out.print("Digite um número: ");
				n1 = entrada.nextDouble();
				System.out.print("Digite outro número: ");
				n2 = entrada.nextDouble();
				entrada.nextLine();

				calculadora.setN1(n1);
				calculadora.setN2(n2);
				calculadora.setOperador("x");
				calculadora.multiplicar();
				calculadora.getResultado();
				break;
			case "/":
				System.out.print("Digite um número: ");
				n1 = entrada.nextDouble();
				System.out.print("Digite outro número: ");
				n2 = entrada.nextDouble();
				entrada.nextLine();

				calculadora.setN1(n1);
				calculadora.setN2(n2);
				calculadora.setOperador("/");
				calculadora.dividir();

				break;
			case "+":
				System.out.print("Digite um número: ");
				n1 = entrada.nextDouble();
				System.out.print("Digite outro número: ");
				n2 = entrada.nextDouble();
				entrada.nextLine();

				calculadora.setN1(n1);
				calculadora.setN2(n2);
				calculadora.setOperador("+");
				calculadora.somar();

				break;
			case "-":
				System.out.print("Digite um número: ");
				n1 = entrada.nextDouble();
				System.out.print("Digite outro número: ");
				n2 = entrada.nextDouble();
				entrada.nextLine();

				calculadora.setN1(n1);
				calculadora.setN2(n2);
				calculadora.setOperador("-");
				calculadora.subtrair();

				break;
			case "d":
				System.out.println("Pressione a tecla desligar");
				String desligar = entrada.nextLine();
				calculadora.desligarCalculadora(desligar);
				calculadora.getStatusCalculadoraLigada();
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}

		} while (!opcao.equals("d"));

		entrada.close();
	}
}
