package exerc�cios_guanabara;
/*
 * 26) Escreva um algoritmo que leia dois n�meros inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
- O primeiro valor � o maior
- O segundo valor � o maior
- N�o existe valor maior, os dois s�o iguais
 */

import java.util.Scanner;

public class Exerc�cio_26 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero inteiro:");
		String num1String = entrada.next().trim().replace(",", ".");
		double num1 = Double.parseDouble(num1String);
		
		System.out.println("Digite o primeiro n�mero inteiro:");
		String num2String = entrada.next().trim().replace(",", ".");
		double num2 = Double.parseDouble(num2String);
		
		if(num1>num2) {
			System.out.printf(" O n�mero %.0f � maior que %.0f. ", num1,num2);
		}
		else if (num1==num2){
			System.out.printf(" Os dois valores s�o iguais. ");
		}
		else if (num1<num2){
			System.out.printf(" O n�mero %.0f � menor que %.0f. ", num1,num2);
		}
		
		entrada.close();
		
	}
}
