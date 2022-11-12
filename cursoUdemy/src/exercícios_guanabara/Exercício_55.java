package exerc�cios_guanabara;

import java.util.Scanner;
import java.util.Random;

/*
 * 55) [DESAFIO] Vamos melhorar o jogo que fizemos no exerc�cio 32. A partir de
agora, o computador vai sortear um n�mero entre 1 e 10 e o jogador vai ter 4
tentativas para tentar acertar.
 */
public class Exerc�cio_55 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random sorteio = new Random();

		int numeroSorteado = 0;
		int numeroEscolhido = 0;

		for (int i = 1; i <= 4; i++) {

			numeroSorteado = sorteio.nextInt(10)+1;
			System.out.printf("Digite o %d� n�mero do sorteio: \n", i);
			numeroEscolhido = entrada.nextInt();

			if (numeroSorteado == numeroEscolhido) {
				System.out.println("Parab�ns,voc� acertou o sorteio.");
				System.out.println("N�mero sorteado: " + numeroSorteado);
				System.out.println("N�mero Escolhido: " + numeroEscolhido+"\n\n");
				
				
			} else if (numeroSorteado != numeroEscolhido) {
				System.out.println("voc� n�o acertou o sorteio.");
				System.out.println("N�mero sorteado: " + numeroSorteado);
				System.out.println("N�mero Escolhido: " + numeroEscolhido+"\n\n");
			}

		}

	}
}
