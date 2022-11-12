package exerc�cios_guanabara;

import java.util.Random;

/*
 * 50) Desenvolva um programa que fa�a o sorteio de 20 n�meros entre 0 e 10 e
mostre na tela:
a) Quais foram os n�meros sorteados
b) Quantos n�meros est�o acima de 5
c) Quantos n�meros s�o divis�veis por 3
 */
public class Exerc�cio_50 {
	public static void main(String[] args) {

		Random aleatorio = new Random();

		int contador = 1;
		int numerosSorteados = 0;
		int quantidadeDeNumeroMaior5 = 0;
		int quantidadeNumerosDivisiveisPor3 = 0;
		
		System.out.println("N�meros sorteados:");

		while (contador <= 20) {
			numerosSorteados = aleatorio.nextInt(11);
			System.out.println(numerosSorteados);

			if (numerosSorteados > 5) {
				quantidadeDeNumeroMaior5 += 1;
			}

			else if (numerosSorteados % 3 == 0) {
				quantidadeNumerosDivisiveisPor3 += 1;
			}
			contador++;
		}
		
		System.out.println("Quantidade de n�meros maiores que 5: "+quantidadeDeNumeroMaior5);
		System.out.println("Quantidade de n�meros divisiveis por 3: "+quantidadeNumerosDivisiveisPor3);
	}
}
