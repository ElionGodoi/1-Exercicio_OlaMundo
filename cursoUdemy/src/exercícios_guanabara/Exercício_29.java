package exercícios_guanabara;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
- Até 3 anos de empresa: aumento de 3%
- entre 3 e 10 anos: aumento de 12.5%
- 10 anos ou mais: aumento de 20%
 */

public class Exercício_29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nomeFuncionario = JOptionPane.showInputDialog("Digite o nome do funcionário:");
		
		String salarioFuncionarioString = JOptionPane.showInputDialog("Digite o salário do funcionário:").trim().replace(",", ".");
		double salarioFuncionario = Double.parseDouble(salarioFuncionarioString);
		
		String anosTrabalhadosEmpresaString = JOptionPane.showInputDialog("Digite quantos anos trabalou na empresa:").trim().replace(",", ".");
		double anosTrabalhadosEmpresa = Double.parseDouble(anosTrabalhadosEmpresaString);
		
		if (anosTrabalhadosEmpresa<=3) {
			System.out.printf("Nome do funcionário: %s.\n",nomeFuncionario);
			System.out.printf("Salário atual: R$ %.2f.\n",salarioFuncionario);
			System.out.printf("Anos de empresa: %.0f.\n",anosTrabalhadosEmpresa);
			System.out.printf("Aumento de 3%%: R$ %.2f.\n",salarioFuncionario*0.03);
			System.out.printf("Salário reajustado com aumento: R$ %.2f.",salarioFuncionario*1.03);
		}
		
		else if (anosTrabalhadosEmpresa>3 && anosTrabalhadosEmpresa <=10) {
			System.out.printf("Nome do funcionário: %s.\n",nomeFuncionario);
			System.out.printf("Salário atual: R$ %.2f.\n",salarioFuncionario);
			System.out.printf("Anos de empresa: %.0f anos.\n",anosTrabalhadosEmpresa);
			System.out.printf("Aumento de 12%%: R$ %.2f.\n",salarioFuncionario*0.12);
			System.out.printf("Salário reajustado com aumento: R$ %.2f.",salarioFuncionario*1.12);
		}
		
		else if (anosTrabalhadosEmpresa>10) {
			System.out.printf("Nome do funcionário: %s.\n",nomeFuncionario);
			System.out.printf("Salário atual: R$ %.2f.\n",salarioFuncionario);
			System.out.printf("Anos de empresa: %.0f anos.\n",anosTrabalhadosEmpresa);
			System.out.printf("Aumento de 20%%: R$ %.2f.\n",salarioFuncionario*0.20);
			System.out.printf("Salário reajustado com aumento: R$ %.2f.",salarioFuncionario*1.20);
		}
		
		

		entrada.close();
	}

}