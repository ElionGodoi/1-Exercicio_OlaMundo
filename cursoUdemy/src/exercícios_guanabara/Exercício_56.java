package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 56) Crie um programa que leia v�rios n�meros pelo teclado e mostre no final o
somat�rio entre eles.
Obs: O programa ser� interrompido quando o n�mero 1111 for digitado
 */
public class Exerc�cio_56 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int senha = 0;
		int contador = 1;
		double somatorio = 0;
		double numeroDigitado = 0;

		while (numeroDigitado != 111) {
			System.out.printf("Digite o %d� n�mero: ", contador);
			numeroDigitado = entrada.nextDouble();
			somatorio += numeroDigitado;

			contador++;
		}
		
		System.out.println("Somat�rio: "+(somatorio-111));

		entrada.close();
	}
}
