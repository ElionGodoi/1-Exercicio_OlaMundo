package exercícios_guanabara;

import java.util.Scanner;

/*
 * 62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de
várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
na tela:
a) Quantas idades foram digitadas
b) Qual é a média entre as idades digitadas
c) Quantas pessoas tem 21 anos ou mais.
 */
public class Exercício_62 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String parar = "";
		double idade = 0;
		double quantificadorDeIdadesDigitadas = 0;
		double somatotalIdades = 0;
		double quantidadeDePessoasMaioresDe21 = 0;

		do {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextDouble();

			if (idade > 21) {
				quantidadeDePessoasMaioresDe21++;
			}

			somatotalIdades += idade;
			quantificadorDeIdadesDigitadas++;
			System.out.println("Deseja parar?");
			System.out.println("Digite o número 1 para (SIM).");
			System.out.println("Digite o número 2 para (NÃO).");
			parar = entrada.next();

		} while (!parar.equals("1"));
		
		System.out.println("Quantidade de idades digitadas: "+quantificadorDeIdadesDigitadas);
		System.out.println("Média entre idades digitadas: "+somatotalIdades/quantificadorDeIdadesDigitadas);
		System.out.println("Quantidade de pessoas maiores de 21 anos: "+quantidadeDePessoasMaioresDe21);
		

		entrada.close();
	}
}
