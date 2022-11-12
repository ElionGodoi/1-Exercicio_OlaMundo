package exerc�cios_guanabara;

import javax.swing.JOptionPane;

/*
 * 63) Crie um programa usando a estrutura �fa�a enquanto� que leia v�rios n�meros.
A cada la�o, pergunte se o usu�rio quer continuar ou n�o. No final, mostre na
tela:
a) O somat�rio entre todos os valores
b) Qual foi o menor valor digitado
c) A m�dia entre todos os valores
d) Quantos valores s�o pares
 */
public class Exerc�cio_63 {
	public static void main(String[] args) {

		String DesejaContinuar = "";
		double somatorioValores = 0;
		double menorValorDigitado = 999;
		double quantidadeDevaloresDigitados = 0;
		double quantidadeDevaloresPares = 0;
		double valorDigitado = 0;
		
		do {
			String valorDigitadoString = JOptionPane.showInputDialog("Digite o n�mero: ");
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
					"Deseja continuar: \nDigite o n�mero 1 para  [SIM] \nDigite o n�mero 2 para  [N�O]");
			
		} while (DesejaContinuar.equalsIgnoreCase("1"));
		
		System.out.println("Somat�rio dos valores digitados: "+somatorioValores);
		System.out.println("Menor valor Digitado: "+menorValorDigitado);
		System.out.println("M�dia dos valores digitados: "+somatorioValores/quantidadeDevaloresDigitados);
		System.out.println("Quantidade de valores pares: "+quantidadeDevaloresPares);
		

	}

}
