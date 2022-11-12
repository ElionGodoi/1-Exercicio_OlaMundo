package exercícios_guanabara;
/*
 * 26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais
 */

import java.util.Scanner;

public class Exercício_26 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro:");
		String num1String = entrada.next().trim().replace(",", ".");
		double num1 = Double.parseDouble(num1String);
		
		System.out.println("Digite o primeiro número inteiro:");
		String num2String = entrada.next().trim().replace(",", ".");
		double num2 = Double.parseDouble(num2String);
		
		if(num1>num2) {
			System.out.printf(" O número %.0f é maior que %.0f. ", num1,num2);
		}
		else if (num1==num2){
			System.out.printf(" Os dois valores são iguais. ");
		}
		else if (num1<num2){
			System.out.printf(" O número %.0f é menor que %.0f. ", num1,num2);
		}
		
		entrada.close();
		
	}
}
