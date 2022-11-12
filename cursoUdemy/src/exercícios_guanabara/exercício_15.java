package exercícios_guanabara;

import java.util.Scanner;

/*
 * 15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.
 */

public class exercício_15{
	public static void main(String [] args) {	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número de dias trabalhados no mês: ");
		String diasTrabalhados = entrada.next().replace(",", ".");
		
		Double diasTrabalhados1 = Double.parseDouble(diasTrabalhados);
		
		System.out.printf(" Salário do funcionário trabalhando %s dias. Salário: %.2f reais.",diasTrabalhados,diasTrabalhados1*8*25);
		
		entrada.close();	
	}
}