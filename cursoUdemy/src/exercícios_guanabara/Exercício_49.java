package exercícios_guanabara;

import java.util.Scanner;

/*
 * 49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares.
 */
public class Exercício_49 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contador = 1;
		int numerosPares = 0;
		int numerosImpares = 0;
		int numeroDigitado = 0;

		while (contador <= 6) {
			System.out.printf("Digite o %dº número: \n", contador);

			numeroDigitado = entrada.nextInt();

			if (numeroDigitado % 2 == 0) {
				numerosPares += 1;
			} else {
				numerosImpares += 1;
			}

			contador++;
		}

		System.out.println("Números pares: " + numerosPares);
		System.out.println("Números ímpares: " + numerosImpares);

		entrada.close();
	}
}
