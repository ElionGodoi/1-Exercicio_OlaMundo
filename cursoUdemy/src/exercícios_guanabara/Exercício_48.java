package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 48) Fa�a um programa que leia 7 n�meros inteiros e no final mostre o somat�rio
entre eles.
 */
public class Exerc�cio_48 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contador = 1;
		int numeroEscolhido = 0;
		int somatorio = 0;

		while (contador <= 7) {
			System.out.printf("Digite o %d� n�mero: .\n", contador);
			numeroEscolhido = entrada.nextInt();
			somatorio +=numeroEscolhido; 

			contador++;
		}
System.out.println("Somat�rio :"+somatorio);

entrada.close();
	}
}
