package exercícios_guanabara;

import java.util.Scanner;

/*
 * 48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
entre eles.
 */
public class Exercício_48 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contador = 1;
		int numeroEscolhido = 0;
		int somatorio = 0;

		while (contador <= 7) {
			System.out.printf("Digite o %dº número: .\n", contador);
			numeroEscolhido = entrada.nextInt();
			somatorio +=numeroEscolhido; 

			contador++;
		}
System.out.println("Somatório :"+somatorio);

entrada.close();
	}
}
