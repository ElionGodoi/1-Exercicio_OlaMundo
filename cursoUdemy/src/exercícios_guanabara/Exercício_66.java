package exercícios_guanabara;

import java.util.Scanner;

/*
 * 66) Escreva um programa que leia um número qualquer e mostre a tabuada desse
número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 ...
 */
public class Exercício_66 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha de qual numero voce deseja ver a tabuada: ");
		int numeroEscolhido = entrada.nextInt();
		
		System.out.println("Escolha ate qual numero você deseja ver a tabuada: ");
		int numeroFinal = entrada.nextInt();
		

		for (int i = 1; i<= numeroFinal ; i++) {
			
			System.out.printf("%d X %d = %d\n",numeroEscolhido,i,numeroEscolhido*i);

		}

	}
}
