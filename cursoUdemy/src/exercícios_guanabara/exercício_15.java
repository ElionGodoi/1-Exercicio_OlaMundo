package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 15) Crie um programa que leia o n�mero de dias trabalhados em um m�s e mostre o
sal�rio de um funcion�rio, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.
 */

public class exerc�cio_15{
	public static void main(String [] args) {	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de dias trabalhados no m�s: ");
		String diasTrabalhados = entrada.next().replace(",", ".");
		
		Double diasTrabalhados1 = Double.parseDouble(diasTrabalhados);
		
		System.out.printf(" Sal�rio do funcion�rio trabalhando %s dias. Sal�rio: %.2f reais.",diasTrabalhados,diasTrabalhados1*8*25);
		
		entrada.close();	
	}
}