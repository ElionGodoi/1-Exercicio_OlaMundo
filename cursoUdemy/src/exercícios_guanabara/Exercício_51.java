package exercícios_guanabara;

import java.util.Scanner;

/*
 * 51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
qual foi o maior e qual foi o menor preço digitados.
 */
public class Exercício_51 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		byte contador = 1;
		double valorProduto = 0;
		double maiorValorProduto = 0;
		double menorValorProduto = 999999;

		while (contador <= 8) {
			System.out.printf("Digite o valor do %dº produto: \n", contador);
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
