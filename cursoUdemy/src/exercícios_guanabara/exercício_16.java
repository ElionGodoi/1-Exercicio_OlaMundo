package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usu�rio foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
 */
public class exerc�cio_16 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.println("Digite a velocidade do Carro:");
	String velocidadeCarroString = entrada.next().trim();
	Double velocidadeCarro = Double.parseDouble(velocidadeCarroString);
	
	Double velocidadeUltrapassada = velocidadeCarro-88;
	
	if(velocidadeCarro>88) {
		System.out.println("Voc� foi multado.");
		System.out.printf("O valor da multa foi 5 * %.0f = %.0f reais. ",velocidadeUltrapassada, velocidadeUltrapassada*5);
		
		entrada.close();
	}
	
}
}
