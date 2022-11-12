package exercícios_guanabara;

import java.util.Scanner;

/*
 * 22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.

- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.

- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
 */

public class Exercício_21 {
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
			System.out.println("Seu alistamento será neste ano.");
		}
		
		if (idadeAtual>18) {
			System.out.printf("Já se passaram  %.0f anos do alistamento militar.",idadeAtual-18);
		}

	}
}
