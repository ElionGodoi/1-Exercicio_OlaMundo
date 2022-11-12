package exercícios_guanabara;
/*
 * 20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.
 */

import java.util.Scanner;

public class Exercício_19 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número para descobrir se é par ou ímpar:");
		String numeroString = entrada.next().trim().replace(",", ".");
		Double numero = Double.parseDouble(numeroString);
		
		if(numero%2==0) {
			System.out.printf("O número %.0f é par.",numero);
		}
		
		if(numero%2==1) {
			System.out.printf("O número %.0f é ímpar.",numero);
		}
		

		entrada.close();
	}
}
