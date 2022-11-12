package exercícios_guanabara;

import java.util.Scanner;
import java.util.Random;

/*
 * 55) [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
tentativas para tentar acertar.
 */
public class Exercício_55 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random sorteio = new Random();

		int numeroSorteado = 0;
		int numeroEscolhido = 0;

		for (int i = 1; i <= 4; i++) {

			numeroSorteado = sorteio.nextInt(10)+1;
			System.out.printf("Digite o %dº número do sorteio: \n", i);
			numeroEscolhido = entrada.nextInt();

			if (numeroSorteado == numeroEscolhido) {
				System.out.println("Parabéns,você acertou o sorteio.");
				System.out.println("Número sorteado: " + numeroSorteado);
				System.out.println("Número Escolhido: " + numeroEscolhido+"\n\n");
				
				
			} else if (numeroSorteado != numeroEscolhido) {
				System.out.println("você não acertou o sorteio.");
				System.out.println("Número sorteado: " + numeroSorteado);
				System.out.println("Número Escolhido: " + numeroEscolhido+"\n\n");
			}

		}

	}
}
