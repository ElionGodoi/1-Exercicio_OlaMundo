package exercícios_guanabara;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */

public class exercício_14{
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		String kmRodados = JOptionPane.showInputDialog("Digite quantos km foram percoridos:").replace(",", ".");
		Double kmRodados1 = Double.parseDouble(kmRodados);
		
		String diasAlugados = JOptionPane.showInputDialog("Digite a quantidade de dias que ele ficou alugado::").replace(",", ".");
		Double diasAlugados1 = Double.parseDouble(diasAlugados);
		
		System.out.printf("O carro alugado percorreu %.0f km e ficou alugado por %.0f dias.\n",kmRodados1,diasAlugados1);
		System.out.printf("Total a pagar: %.2f reais.",(kmRodados1*0.20)+(diasAlugados1*90));
		
		entrada.close();
	}
}