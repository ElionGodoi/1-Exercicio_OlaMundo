package exercícios_guanabara;

import java.util.Scanner;

/*
 * 53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
 * 
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos
 */
public class Exercício_53 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int contador = 1;
		int idades = 0;
		String sexo = "";
		int quantidadeTotalHomens = 0;
		int quantidadeTotalmulheres = 0;
		double somaTotalIdades = 0;
		double somaTotalIdadesHomens = 0;
		int mulheresMaiores20anos = 0;

		while (contador <= 5) {
			System.out.printf("Digite a idade da %dº pessoa: \n", contador);
			idades = entrada.nextInt();
			System.out.printf("Digite o sexo da %dº pessoa:  \n", contador);
			System.out.printf("- Letra (m) Masculino.\n");
			System.out.printf("- Letra (f) feminino.\n");
			sexo = entrada.next().toLowerCase();

			if (sexo.equals("m")) {
				quantidadeTotalHomens++;
			}
			if (sexo.equals("f")) {
				quantidadeTotalmulheres++;
			}
			if (sexo.equals("m")) {
				somaTotalIdadesHomens += idades;
			}
			if (sexo.equals("f") && idades > 20) {
				somaTotalIdadesHomens += idades;
			}

			somaTotalIdades += idades;
			contador++;
		}

		System.out.println("Quantidade de homens Cadastrados: " + quantidadeTotalHomens);
		System.out.println("Quantidade de mulheres Cadastrados: " + quantidadeTotalmulheres);
		System.out.println("Média da idade do grupo: " + somaTotalIdades / 5);
		System.out.println("Média da idade dos homens: " + somaTotalIdadesHomens / quantidadeTotalHomens);
		System.out.println("Quantidade total de mulheres maiores de 20 anos: " + mulheresMaiores20anos);

		entrada.close();
	}
}
