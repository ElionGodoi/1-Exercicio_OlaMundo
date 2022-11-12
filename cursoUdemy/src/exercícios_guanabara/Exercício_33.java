package exerc�cios_guanabara;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 33) Escreva um programa para aprovar ou n�o o empr�stimo banc�rio para a compra
de uma casa. O programa vai perguntar o valor da casa, o sal�rio do comprador e
em quantos anos ele vai pagar. Calcule o valor da presta��o mensal, sabendo que
ela n�o pode exceder 30% do sal�rio ou ent�o o empr�stimo ser� negado.
 */

public class Exerc�cio_33 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String valorCasaString = JOptionPane.showInputDialog("Digite o valor da casa:").trim().replace(",",".");
		double valorCasa = Double.parseDouble(valorCasaString);
		
		String salarioCompradorString = JOptionPane.showInputDialog("Digite o valor do seu sal�rio:").trim().replace(",",".");
		double salarioComprador = Double.parseDouble(salarioCompradorString);
		
		String anosPagamentoString = JOptionPane.showInputDialog("Digite por quantos anos pretende pagar:").trim().replace(",",".");
		double anosDePagamento = Double.parseDouble(anosPagamentoString);
		
		double prestacaoMensalCasa = valorCasa/(anosDePagamento*12);
		
		if( salarioComprador*0.30 <prestacaoMensalCasa  ) {
			System.out.println("Empr�stimo negado!");
			System.out.printf("Presta��o mensal: R$ %.2f. \n", prestacaoMensalCasa);
			System.out.printf("Valor de 30%% do Sal�rio: R$ %.2f. \n",salarioComprador*0.30 );			
		} 
		
		if( salarioComprador*0.30 >= prestacaoMensalCasa  ) {
			System.out.println("Empr�stimo concedido!");
			System.out.printf("Presta��o mensal: R$ %.2f. \n", prestacaoMensalCasa);
			System.out.printf("Valor de 30%% do Sal�rio: R$ %.2f. \n",salarioComprador*0.30 );			
		} 
		
		
		entrada.close();
		
	}
}
