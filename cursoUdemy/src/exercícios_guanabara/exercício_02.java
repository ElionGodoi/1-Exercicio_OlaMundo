package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 2) Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas
para ela:
Ex:
Qual � o seu nome? Jo�o da Silva
Ol� Jo�o da Silva, � um prazer te conhecer!
 */

public class exerc�cio_02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu nome:");
		String nome = entrada.nextLine();

		System.out.printf("Ol� %s, � um preazer te conhecer!", nome);

		entrada.close();
	}
}
