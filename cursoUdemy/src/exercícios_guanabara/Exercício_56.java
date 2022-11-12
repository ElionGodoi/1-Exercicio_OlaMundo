package exercícios_guanabara;

import java.util.Scanner;

/*
 * 56) Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado
 */
public class Exercício_56 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int senha = 0;
		int contador = 1;
		double somatorio = 0;
		double numeroDigitado = 0;

		while (numeroDigitado != 111) {
			System.out.printf("Digite o %dº número: ", contador);
			numeroDigitado = entrada.nextDouble();
			somatorio += numeroDigitado;

			contador++;
		}
		
		System.out.println("Somatório: "+(somatorio-111));

		entrada.close();
	}
}
