package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 3) Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando
 *  no final uma mensagem. Ex: Nome do Funcion�rio: Maria do Carmo
 *   Sal�rio: 1850,45 O funcion�rio Maria do Carmo tem um sal�rio de R$1850,45 em Junho.
 */
public class exerc�cio_03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nomeFuncionario = entrada.nextLine();
		System.out.println("Digite o valor do seu sal�rio:");
		String valorSalario = entrada.nextLine().replace(".", ",");
		System.out.printf("Nome do funcion�rio: %s.\n",nomeFuncionario,valorSalario);
		System.out.printf("Sal�rio do funcion�rio: %s reais.",valorSalario);

		entrada.close();
	}
}
