package exercícios_guanabara;

import java.util.Random;

/*
 * 50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3
 */
public class Exercício_50 {
	public static void main(String[] args) {

		Random aleatorio = new Random();

		int contador = 1;
		int numerosSorteados = 0;
		int quantidadeDeNumeroMaior5 = 0;
		int quantidadeNumerosDivisiveisPor3 = 0;
		
		System.out.println("Números sorteados:");

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
		
		System.out.println("Quantidade de números maiores que 5: "+quantidadeDeNumeroMaior5);
		System.out.println("Quantidade de números divisiveis por 3: "+quantidadeNumerosDivisiveisPor3);
	}
}
