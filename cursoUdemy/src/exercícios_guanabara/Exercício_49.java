package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 49) Crie um programa que leia 6 n�meros inteiros e no final mostre quantos deles
s�o pares e quantos s�o �mpares.
 */
public class Exerc�cio_49 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contador = 1;
		int numerosPares = 0;
		int numerosImpares = 0;
		int numeroDigitado = 0;

		while (contador <= 6) {
			System.out.printf("Digite o %d� n�mero: \n", contador);

			numeroDigitado = entrada.nextInt();

			if (numeroDigitado % 2 == 0) {
				numerosPares += 1;
			} else {
				numerosImpares += 1;
			}

			contador++;
		}

		System.out.println("N�meros pares: " + numerosPares);
		System.out.println("N�meros �mpares: " + numerosImpares);

		entrada.close();
	}
}
