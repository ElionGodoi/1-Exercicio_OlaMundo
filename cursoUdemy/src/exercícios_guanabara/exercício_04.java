package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 4) Desenvolva um algoritmo que leia dois n�meros inteiros e mostre o somat�rio
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 � igual a 13.
 */
public class exerc�cio_04{
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero inteiro:");
		double primeiroInteiro = entrada.nextDouble();
		System.out.println("Digite o segundo n�mero inteiro:");
		double segundoInteiro = entrada.nextDouble();				
		System.out.printf("A soma de %.0f e %.0f � igual a %.0f.",primeiroInteiro,segundoInteiro,primeiroInteiro+segundoInteiro);
								
				entrada.close();
	}
}