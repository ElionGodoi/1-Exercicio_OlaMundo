package exercícios_guanabara;

import java.util.Scanner;

/*
 * 4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.
 */
public class exercício_04{
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro:");
		double primeiroInteiro = entrada.nextDouble();
		System.out.println("Digite o segundo número inteiro:");
		double segundoInteiro = entrada.nextDouble();				
		System.out.printf("A soma de %.0f e %.0f é igual a %.0f.",primeiroInteiro,segundoInteiro,primeiroInteiro+segundoInteiro);
								
				entrada.close();
	}
}