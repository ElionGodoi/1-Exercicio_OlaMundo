package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 51) Fa�a um aplicativo que leia o pre�o de 8 produtos. No final, mostre na tela
qual foi o maior e qual foi o menor pre�o digitados.
 */
public class Exerc�cio_51 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		byte contador = 1;
		double valorProduto = 0;
		double maiorValorProduto = 0;
		double menorValorProduto = 999999;

		while (contador <= 8) {
			System.out.printf("Digite o valor do %d� produto: \n", contador);
			valorProduto = entrada.nextDouble();

			if (maiorValorProduto < valorProduto) {
				maiorValorProduto = valorProduto;
			} 
			if (menorValorProduto > valorProduto) {
				menorValorProduto = valorProduto;
			}

			contador++;
		}
		
		System.out.println("Produto de maior valor: "+maiorValorProduto);
		System.out.println("Produto de menor valor: "+menorValorProduto);

		entrada.close();
	}
}
