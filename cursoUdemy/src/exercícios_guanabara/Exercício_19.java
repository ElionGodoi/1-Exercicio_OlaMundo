package exerc�cios_guanabara;
/*
 * 20) Desenvolva um programa que leia um n�mero inteiro e mostre se ele � PAR ou
�MPAR.
 */

import java.util.Scanner;

public class Exerc�cio_19 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para descobrir se � par ou �mpar:");
		String numeroString = entrada.next().trim().replace(",", ".");
		Double numero = Double.parseDouble(numeroString);
		
		if(numero%2==0) {
			System.out.printf("O n�mero %.0f � par.",numero);
		}
		
		if(numero%2==1) {
			System.out.printf("O n�mero %.0f � �mpar.",numero);
		}
		

		entrada.close();
	}
}
