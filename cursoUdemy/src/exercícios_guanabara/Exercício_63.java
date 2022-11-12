package exercícios_guanabara;

import javax.swing.JOptionPane;

/*
 * 63) Crie um programa usando a estrutura “faça enquanto” que leia vários números.
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
tela:
a) O somatório entre todos os valores
b) Qual foi o menor valor digitado
c) A média entre todos os valores
d) Quantos valores são pares
 */
public class Exercício_63 {
	public static void main(String[] args) {

		String DesejaContinuar = "";
		double somatorioValores = 0;
		double menorValorDigitado = 999;
		double quantidadeDevaloresDigitados = 0;
		double quantidadeDevaloresPares = 0;
		double valorDigitado = 0;
		
		do {
			String valorDigitadoString = JOptionPane.showInputDialog("Digite o número: ");
			valorDigitado = Double.parseDouble(valorDigitadoString);
			somatorioValores+=valorDigitado;
			
			if(valorDigitado<menorValorDigitado) {
				menorValorDigitado=valorDigitado;
			}
			
			if(valorDigitado%2==0) {
				quantidadeDevaloresPares++;
			}
			
			quantidadeDevaloresDigitados++;
			
			
			DesejaContinuar = JOptionPane.showInputDialog(
					"Deseja continuar: \nDigite o número 1 para  [SIM] \nDigite o número 2 para  [NÃO]");
			
		} while (DesejaContinuar.equalsIgnoreCase("1"));
		
		System.out.println("Somatório dos valores digitados: "+somatorioValores);
		System.out.println("Menor valor Digitado: "+menorValorDigitado);
		System.out.println("Média dos valores digitados: "+somatorioValores/quantidadeDevaloresDigitados);
		System.out.println("Quantidade de valores pares: "+quantidadeDevaloresPares);
		

	}

}
