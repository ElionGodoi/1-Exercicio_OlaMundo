package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situa��o em rela��o ao alistamento militar.

- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.

- Se j� tiver depois dos 18 anos, mostre quantos anos j� se passaram do
alistamento.
 */

public class Exerc�cio_21 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento: ");
		Double anoNascimento = entrada.nextDouble();
		entrada.close();
		
		Double idadeAtual = 2022-anoNascimento;
		
		if (idadeAtual<18) {
			System.out.printf("Faltam %.0f anos para o alistamento militar.",18-idadeAtual);
		}
		
		if (idadeAtual==18) {
			System.out.println("Seu alistamento ser� neste ano.");
		}
		
		if (idadeAtual>18) {
			System.out.printf("J� se passaram  %.0f anos do alistamento militar.",idadeAtual-18);
		}

	}
}
