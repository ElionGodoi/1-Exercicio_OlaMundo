package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 21) Fa�a um algoritmo que leia um determinado ano e mostre se ele � ou n�o
BISSEXTO.
 */

public class Exerc�cio_20 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano para descobrir se � bissexto: ");
		Double ano = entrada.nextDouble();
		entrada.close();
		
		if(ano%4==0 && ano%100!=0) {
			System.out.println("� bissexto.");
			if(ano%4==0 && ano%100==0 && ano%400!=0) {
				System.out.printf("O ano %.0f � bissexto.",ano);
			}
			
		}else {
			System.out.printf("O ano %.0f n�o � bissexto.",ano);
		}
		
	}
}
