package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 69) [DESAFIO] Desenvolva um programa que leia o primeiro termo e a raz�o de uma
PA (Progress�o Aritm�tica), mostrando na tela os 10 primeiros elementos da PA e
a soma entre todos os valores da sequ�ncia.
 */
public class Exerc�cio_69 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro termo da PA: ");
		double primeiroTermoPA = entrada.nextDouble();

		System.out.println("Digite a raz�o da PA: ");
		double razaoPA = entrada.nextDouble();
		
		System.out.println("Digite quantos termos de uma PA voc� dejesa: ");
		double quantidadeDeTermosDeUmaPA = entrada.nextDouble();

		double somaTotalPa = 0;

		for (int i = 0; i <= (quantidadeDeTermosDeUmaPA-1); i++) {
			double resultadosPA = primeiroTermoPA + i * razaoPA;
			System.out.println(resultadosPA);
			somaTotalPa += resultadosPA;
		}
		System.out.println("Soma total da PA: " + somaTotalPa);

		entrada.close();
	}
}
