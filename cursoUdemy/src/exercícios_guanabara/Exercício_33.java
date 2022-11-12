package exercícios_guanabara;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */

public class Exercício_33 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String valorCasaString = JOptionPane.showInputDialog("Digite o valor da casa:").trim().replace(",",".");
		double valorCasa = Double.parseDouble(valorCasaString);
		
		String salarioCompradorString = JOptionPane.showInputDialog("Digite o valor do seu salário:").trim().replace(",",".");
		double salarioComprador = Double.parseDouble(salarioCompradorString);
		
		String anosPagamentoString = JOptionPane.showInputDialog("Digite por quantos anos pretende pagar:").trim().replace(",",".");
		double anosDePagamento = Double.parseDouble(anosPagamentoString);
		
		double prestacaoMensalCasa = valorCasa/(anosDePagamento*12);
		
		if( salarioComprador*0.30 <prestacaoMensalCasa  ) {
			System.out.println("Empréstimo negado!");
			System.out.printf("Prestação mensal: R$ %.2f. \n", prestacaoMensalCasa);
			System.out.printf("Valor de 30%% do Salário: R$ %.2f. \n",salarioComprador*0.30 );			
		} 
		
		if( salarioComprador*0.30 >= prestacaoMensalCasa  ) {
			System.out.println("Empréstimo concedido!");
			System.out.printf("Prestação mensal: R$ %.2f. \n", prestacaoMensalCasa);
			System.out.printf("Valor de 30%% do Salário: R$ %.2f. \n",salarioComprador*0.30 );			
		} 
		
		
		entrada.close();
		
	}
}
