package exercícios_guanabara;
import java.util.Scanner;
/*
 * 12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.
 */
public class exercício_12{
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto:");
		String precoProduto = entrada.next().replace(",", ".");
		
		Double precoProduto1 = Double.parseDouble(precoProduto);
		
		System.out.printf("Valor do produto %.2f reais.\n",precoProduto1);
		System.out.printf("Valor do produto com 5%% de desconto %.2f reais.\n",precoProduto1*0.95);
		
		
		entrada.close();
	}
}