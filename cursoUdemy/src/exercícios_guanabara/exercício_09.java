package exerc�cios_guanabara;

import javax.swing.JOptionPane;

/*
 * 9) Fa�a um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos d�lares ela pode comprar. Considere US$1,00 = R$3,45.
 */

public class exerc�cio_09{
	public static void main (String[] args) {
		String dinheiroCarteira = JOptionPane.showInputDialog("Digite quanto dinheiro voc� tem: ").replace(",", ".");
		
		Double dinheiroCarteira1 = Double.parseDouble(dinheiroCarteira);
		
		System.out.printf("Com o valor de %.2f reais � poss�vel comprar %.2f d�lares.", dinheiroCarteira1, dinheiroCarteira1/5.29);
	}
}


