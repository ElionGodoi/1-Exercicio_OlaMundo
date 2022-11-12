package exercícios_guanabara;

import java.util.Random;
import java.util.Scanner;

/*
 * 32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
jogador vai tentar descobrir qual foi o valor sorteado.
 */

public class Exercício_32 {
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner entrada = new Scanner(System.in);

		int sorteio = gerador.nextInt(5) + 1;

		System.out.println("Digite um número entre \"1\" e \"5\" para descobrir se acertou no sorteio:");
		int numeroEscolhido = entrada.nextInt();

		if (sorteio == numeroEscolhido) {
			System.out.printf("Parabéns, você acertou no sorteio.\n");
			System.out.printf("Número sorteado: %d.\n", sorteio);
			System.out.printf("Número escolhido: %d.\n", numeroEscolhido);

		} else if (sorteio != numeroEscolhido) {

			System.out.printf("Você não acertou no sorteio.\n");
			System.out.printf("Número sorteado: %d.\n", sorteio);
			System.out.printf("Número escolhido: %d.\n", numeroEscolhido);

		}

		entrada.close();
	}

}
