package exerc�cios_guanabara;

import javax.swing.JOptionPane;

/*
 * 60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de v�rias pessoas.
O programa vai perguntar se o usu�rio quer ou n�o continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A m�dia de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos
 */
public class Exerc�cio_60 {
	public static void main(String[] args) {

		String nome = "";
		String sexo = "";

		String idadeString = "";
		double idade = 0;

		String continuarString = "";
		double continuar = 1;
		
		double maiorIdadeLida = 0;
		
		String nomePessoaMaisVelha = "";
		String nomeMulherMaisJovem = "";
		
		double idadeMulherMaisJovem = 999;
		
		double somaTotalIdades = 0;
		double quantidadeTotalPessoas = 0;
		
		double quantidadeHomensMaioresDe30Anos = 0;
		double quantidadeDeMulheresMenoresDe18Anos = 0;

		while (continuar == 1) {

			nome = JOptionPane.showInputDialog("Digite seu nome: ");

			idadeString = JOptionPane.showInputDialog("Digite sua idade em anos: ").replace(",", ".").trim();
			idade = Double.parseDouble(idadeString);

			sexo = JOptionPane
					.showInputDialog(
							"Digite seu sexo: \n Letra [M] para sexo Masculino. \n Letra [F] para sexo Feminino. ")
					.replace(",", ".").trim();

			continuarString = JOptionPane.showInputDialog(
					"Deseja continuar? \n Digite o n�mero [1] para Sim. \n Digite o n�mero [2] para N�o.");
			continuar = Double.parseDouble(continuarString);
			
			somaTotalIdades+=idade;
			quantidadeTotalPessoas++;
			
			
			if(maiorIdadeLida<idade) {
				maiorIdadeLida=idade;
				nomePessoaMaisVelha = nome;
			}
			
			if(sexo.equalsIgnoreCase("f") && idadeMulherMaisJovem>idade) {
				idadeMulherMaisJovem = idade;
				nomeMulherMaisJovem = nome;
			}
			
			if (sexo.equalsIgnoreCase("m") && idade>30) {
				quantidadeHomensMaioresDe30Anos++;
			}
			
			if(sexo.equalsIgnoreCase("f") && idade<18) {
				quantidadeDeMulheresMenoresDe18Anos++;
			}

		}
		
		System.out.printf("A pessoa com maior idade � %s com %.0f anos.\n",nomePessoaMaisVelha
				
				,maiorIdadeLida);
		System.out.printf("O nome da mulher com menor idade � %s com %.0f anos.\n",nomeMulherMaisJovem,idadeMulherMaisJovem);
		System.out.printf("M�dia da soma de todas as idades: %.2f.\n",somaTotalIdades/quantidadeTotalPessoas);
		System.out.printf("Quantidade de homen(s) maiores de 30 anos: %.0f.\n",quantidadeHomensMaioresDe30Anos);
		System.out.printf("Quantidade de mulhere(s) menores de 18 anos: %.0f.\n",quantidadeDeMulheresMenoresDe18Anos);

	}
}
