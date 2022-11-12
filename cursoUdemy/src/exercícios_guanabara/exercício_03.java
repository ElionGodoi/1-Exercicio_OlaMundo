package exercícios_guanabara;

import java.util.Scanner;

/*
 * 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando
 *  no final uma mensagem. Ex: Nome do Funcionário: Maria do Carmo
 *   Salário: 1850,45 O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
 */
public class exercício_03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nomeFuncionario = entrada.nextLine();
		System.out.println("Digite o valor do seu salário:");
		String valorSalario = entrada.nextLine().replace(".", ",");
		System.out.printf("Nome do funcionário: %s.\n",nomeFuncionario,valorSalario);
		System.out.printf("Salário do funcionário: %s reais.",valorSalario);

		entrada.close();
	}
}
