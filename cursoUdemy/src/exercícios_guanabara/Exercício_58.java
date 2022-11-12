package exercícios_guanabara;

import javax.swing.JOptionPane;

/*
 * 58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual é a média de idade do grupo.
 */
public class Exercício_58 {
	public static void main(String[] args) {

		double idade = 0;
		double totalAlunos = 0;
		double somaTotalidades = 0;

		while (idade != 999) {

			String idadeString = JOptionPane.showInputDialog("Digite sua idade:");
			idade = Double.parseDouble(idadeString);

			somaTotalidades += idade;

			totalAlunos++;
		}
		
		System.out.println("Quantidade total de alunos: "+(totalAlunos-1));
		System.out.println("Média das idades: "+(somaTotalidades-999)/(totalAlunos-1));
		

	}
}
