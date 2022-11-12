package exerc�cios_guanabara;

import javax.swing.JOptionPane;

/*
 * 59) Crie um programa que leia o sexo e a idade de v�rias pessoas. O programa vai
perguntar se o usu�rio quer continuar ou n�o a cada pessoa. No final, mostre:
a) qual � a maior idade lida
b) quantos homens foram cadastrados
c) qual � a idade da mulher mais jovem
d) qual � a m�dia de idade entre os homens
 */
public class Exerc�cio_59 {
	public static void main(String[] args) {

		String sexo = "";
		double continuar = 1;
		String idadeString = "";
		double idade = 0;
		double maiorIdadeLida = 0;
		double quantidadeHomensCadastrados = 0;
		double idadeMulherMaisJovem = 999;
		double somaTotalIdadeHomens = 0;

		while (continuar == 1) {

			sexo = JOptionPane.showInputDialog(
					"Digite qual seu sexo: \nLetra [M] para sexo Masculino. \nLetra [F] para sexo Feminino.");

			idadeString = JOptionPane.showInputDialog("Digite qual sua idade em anos: ").replace(",", ".").trim();
			idade = Double.parseDouble(idadeString);

			String continuarString = JOptionPane
					.showInputDialog(" Digite o n�mero: \n [1] para continuar. \n [2] para parar.");
			continuar = Double.parseDouble(continuarString);

			if (maiorIdadeLida < idade) {
				maiorIdadeLida = idade;
			}

			if (sexo.equalsIgnoreCase("m")) {
				quantidadeHomensCadastrados++;
				somaTotalIdadeHomens += idade;
			}

			if (sexo.equalsIgnoreCase("f") && idadeMulherMaisJovem > idade) {
				idadeMulherMaisJovem = idade;
			}

		}

		System.out.printf("A maior idade lida foi de %.0f anos.\n", maiorIdadeLida);
		System.out.printf("Quantidade de homens cadastrados: %.0f .\n", quantidadeHomensCadastrados);
		System.out.printf("Idade da mulher mais Jovem: %.0f anos .\n", idadeMulherMaisJovem);
		System.out.printf("M�dia da idade dos homens: %.2f .\n\n", somaTotalIdadeHomens / quantidadeHomensCadastrados);

	}
}
