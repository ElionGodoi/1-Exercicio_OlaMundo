package exercícios_guanabara;

import javax.swing.JOptionPane;

/*
 * 68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
“para”. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres
d) O maior peso entre os homens
 */
public class Exercício_68 {
	public static void main(String[] args) {

		double quantidadeMulheresCadastradas = 0;
		double homensComMais100kg = 0;
		double somaTotalpesoMulheres = 0;
		double maiorPesoHomens = 0;
		double peso = 0;

		for (int i = 1; i <= 6; i++) {
			String sexo = JOptionPane.showInputDialog("Digite o sexo da " + i
					+ "º pessoa:\n Digite a letra \"M\" para (MACULINO).\n Digite a letra  \"F\" para (FEMININO).");

			String pesoString = JOptionPane.showInputDialog("Digite o peso da " + i + "º pessoa:");
			peso = Double.parseDouble(pesoString);

			if (sexo.equalsIgnoreCase("f")) {
				quantidadeMulheresCadastradas++;
			}
			if (sexo.equalsIgnoreCase("m") && peso > 100) {
				homensComMais100kg++;
			}

			if (sexo.equalsIgnoreCase("m") && peso > maiorPesoHomens) {
				maiorPesoHomens = peso;
			}

			if (sexo.equalsIgnoreCase("f")) {
				somaTotalpesoMulheres += peso;
			}

		}
		System.out.println("Quantidade de mulheres cadastradas: " + quantidadeMulheresCadastradas);
		System.out.println("Quantidade de homens com mais de 100 kg: " + homensComMais100kg);
		System.out.println("Média de peso entre as mulheres: " + somaTotalpesoMulheres / quantidadeMulheresCadastradas);
		System.out.println("Maior peso entre os homens: " + maiorPesoHomens);

	}
}
