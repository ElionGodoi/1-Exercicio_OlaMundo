package exerc�cios_guanabara;
import java.util.Scanner;

/*
 * 13) Fa�a um algoritmo que leia o sal�rio de um funcion�rio, calcule e mostre o
seu novo sal�rio, com 15% de aumento.
 */

public class exerc�cio_13{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do sal�rio de um funcion�rio: ");
		String salarioFuncionario = entrada.next().replace(",", ".");
		
		Double salarioFuncion�rio1 = Double.parseDouble(salarioFuncionario);
		
		System.out.printf("Sal�rio do funcion�rio: %.2f reais.\n",salarioFuncion�rio1);
		System.out.printf("Sal�rio do funcion�rio com aumento de 15%%: %.2f reais.\n",salarioFuncion�rio1*1.15);
		
		
		entrada.close();
	}
}