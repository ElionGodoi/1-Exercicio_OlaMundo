package exercícios_guanabara;
import java.util.Scanner;

/*
 * 13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.
 */

public class exercício_13{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário de um funcionário: ");
		String salarioFuncionario = entrada.next().replace(",", ".");
		
		Double salarioFuncionário1 = Double.parseDouble(salarioFuncionario);
		
		System.out.printf("Salário do funcionário: %.2f reais.\n",salarioFuncionário1);
		System.out.printf("Salário do funcionário com aumento de 15%%: %.2f reais.\n",salarioFuncionário1*1.15);
		
		
		entrada.close();
	}
}