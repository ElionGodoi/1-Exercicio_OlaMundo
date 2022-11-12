package exercícios_guanabara;

import javax.swing.JOptionPane;

/*
 * 9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */

public class exercício_09{
	public static void main (String[] args) {
		String dinheiroCarteira = JOptionPane.showInputDialog("Digite quanto dinheiro você tem: ").replace(",", ".");
		
		Double dinheiroCarteira1 = Double.parseDouble(dinheiroCarteira);
		
		System.out.printf("Com o valor de %.2f reais é possível comprar %.2f dólares.", dinheiroCarteira1, dinheiroCarteira1/5.29);
	}
}


