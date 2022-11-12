package exercícios_guanabara;

import java.util.Scanner;

/*
 * 54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
 */
public class Exercício_54 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double altura = 0;
		double peso = 0;
		double somaAlturaTotal = 0;
		double quantidadeDepessoasPesoMaior90 = 0;
		double pesoMenor50kgAlturaMenor160cm = 0;
		double pesoMaior100kgAlturaMAior190cm = 0;

		for (int i = 1; i <= 7; i++) {

			System.out.printf("Digite o peso da %dº pessoa: ex.:(65.5).\n", i);
			String pesoString = entrada.next().replace(",", ".");
			peso = Double.parseDouble(pesoString);

			System.out.printf("Digite a altura da %dº pessoa: ex.:(1.65) \n", i);
			String alturaString = entrada.next().replace(",", ".");
			altura = Double.parseDouble(alturaString);

			somaAlturaTotal += altura;

			if (peso > 90) {
				quantidadeDepessoasPesoMaior90++;
			}

			if (peso < 50 && altura < 1.60) {
				pesoMenor50kgAlturaMenor160cm++;
			}

			if (peso > 100 && altura > 1.90) {
				pesoMaior100kgAlturaMAior190cm++;
			}

		}
		entrada.close();

		System.out.println("Média da altura do grupo: " + somaAlturaTotal / 7);
		System.out.println("Quantidade de pessoas com peso maior que 90kg: " + quantidadeDepessoasPesoMaior90);
		System.out.println("Quantidade de pessoas com peso menor que 50kg e altura menor que 1.60m: "
				+ pesoMenor50kgAlturaMenor160cm);
		System.out.println("Quantidade de pessoas com peso maior que 90kg e altura maior que 1.90m: "
				+ pesoMaior100kgAlturaMAior190cm);

	}
}
