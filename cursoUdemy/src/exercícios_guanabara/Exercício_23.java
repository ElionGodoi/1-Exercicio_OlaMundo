package exercícios_guanabara;

import java.util.Scanner;

/*
 * 23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
- Homens ganham 5% de desconto
- Mulheres ganham 13% de desconto
 */

public class Exercício_23 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sexo: Letra \"M\" para sexo masculino e Letra \"F\" para feminino.");
		String sexo = entrada.nextLine();
		
		System.out.println("Digite o valor das compras:");
		String valorComprasString = entrada.next().trim().replace(",", ".");
		Double valorCompras = Double.parseDouble(valorComprasString);
		
		entrada.close();
		
		if(sexo.equalsIgnoreCase("m")) {
		 System.out.printf("O senhor %s fez compras no valor de %.2f e ganhou um desconto de"
		 		+ " 5%% que corresponde a %.2f reais. Valor total que pagará = %.2f reais. ",
				 nome,valorCompras, valorCompras*0.05,valorCompras*0.95);
		}
				
		if(sexo.equalsIgnoreCase("f")) {
			System.out.printf("A senhora %s fez compras no valor de %.2f e ganhou um desconto de 13%%"
					+ " que corresponde a %.2f reais. Valor total que pagará = %.2f reais.",
					nome,valorCompras, valorCompras*0.13,valorCompras*0.87 );
		}
		
	}
}
