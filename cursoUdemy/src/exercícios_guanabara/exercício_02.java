package exercícios_guanabara;

import java.util.Scanner;

/*
 * 2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas
para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!
 */

public class exercício_02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu nome:");
		String nome = entrada.nextLine();

		System.out.printf("Olá %s, é um preazer te conhecer!", nome);

		entrada.close();
	}
}
