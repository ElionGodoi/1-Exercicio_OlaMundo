package exercícios_guanabara;

import java.util.Scanner;

/*
 * 21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.
 */

public class Exercício_20 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano para descobrir se é bissexto: ");
		Double ano = entrada.nextDouble();
		entrada.close();
		
		if(ano%4==0 && ano%100!=0) {
			System.out.println("É bissexto.");
			if(ano%4==0 && ano%100==0 && ano%400!=0) {
				System.out.printf("O ano %.0f é bissexto.",ano);
			}
			
		}else {
			System.out.printf("O ano %.0f não é bissexto.",ano);
		}
		
	}
}
