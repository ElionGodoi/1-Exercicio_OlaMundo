package exerc�cios_guanabara;

import javax.swing.JOptionPane;

/*
 * 58) Fa�a um algoritmo que leia a idade de v�rios alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual � a m�dia de idade do grupo.
 */
public class Exerc�cio_58 {
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
		System.out.println("M�dia das idades: "+(somaTotalidades-999)/(totalAlunos-1));
		

	}
}
