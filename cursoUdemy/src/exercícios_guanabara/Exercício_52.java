package exercícios_guanabara;

import java.util.Scanner;

/*
 * 52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida
 */
public class Exercício_52 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int idade = 0;
		double somaIdadeTotal = 0;
		int quantidadeMaiores18 = 0;
		int pessoasMenores5 = 0;
		int maiorIdadeLida = 0;

		int contador = 1;
		while (contador <= 10) {
			System.out.printf("Digite a idade da %dº pessoa: ", contador);
			idade = entrada.nextInt();
			somaIdadeTotal += idade;

			if (idade > 18) {
				quantidadeMaiores18++;
			}
			if (idade < 5) {
				pessoasMenores5++;
			}
			if (maiorIdadeLida < idade) {
				maiorIdadeLida = idade;
			}

			contador++;
		}

		System.out.println("Média da idade do grupo: " + somaIdadeTotal / 10);
		System.out.println("Pessoas maiores de 18 anos: " + quantidadeMaiores18);
		System.out.println("Pessoas menores de 5 anos: " + pessoasMenores5);
		System.out.println("Maior idade lida: " + maiorIdadeLida);

		entrada.close();
	}
}
