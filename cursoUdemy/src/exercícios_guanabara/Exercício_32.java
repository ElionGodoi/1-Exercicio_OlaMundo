package exerc�cios_guanabara;

import java.util.Random;
import java.util.Scanner;

/*
 * 32) [DESAFIO] Crie um jogo onde o computador vai sortear um n�mero entre 1 e 5 o
jogador vai tentar descobrir qual foi o valor sorteado.
 */

public class Exerc�cio_32 {
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner entrada = new Scanner(System.in);

		int sorteio = gerador.nextInt(5) + 1;

		System.out.println("Digite um n�mero entre \"1\" e \"5\" para descobrir se acertou no sorteio:");
		int numeroEscolhido = entrada.nextInt();

		if (sorteio == numeroEscolhido) {
			System.out.printf("Parab�ns, voc� acertou no sorteio.\n");
			System.out.printf("N�mero sorteado: %d.\n", sorteio);
			System.out.printf("N�mero escolhido: %d.\n", numeroEscolhido);

		} else if (sorteio != numeroEscolhido) {

			System.out.printf("Voc� n�o acertou no sorteio.\n");
			System.out.printf("N�mero sorteado: %d.\n", sorteio);
			System.out.printf("N�mero escolhido: %d.\n", numeroEscolhido);

		}

		entrada.close();
	}

}
