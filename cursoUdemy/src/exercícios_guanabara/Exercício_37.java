package exerc�cios_guanabara;

import javax.swing.JOptionPane;

/*
 * 37) Uma empresa precisa reajustar o sal�rio dos seus funcion�rios, dando um
aumento de acordo com alguns fatores. Fa�a um programa que leia o sal�rio atual,
o g�nero do funcion�rio e h� quantos anos esse funcion�rio trabalha na empresa.
No final, mostre o seu novo sal�rio, baseado na tabela a seguir:
- Mulheres
- menos de 15 anos de empresa: +5%
- de 15 at� 20 anos de empresa: +12%
- mais de 20 anos de empresa: +23%
- Homens
- menos de 20 anos de empresa: +3%
- de 20 at� 30 anos de empresa: +13%
- mais de 30 anos de empresa: +25%
 */

public class Exerc�cio_37 {
	public static void main(String[] args) {

		String salarioAtualString = JOptionPane.showInputDialog("Digite o valor do seu sal�rio Atual:").trim()
				.replace(",", ".");
		double salarioAtual = Double.parseDouble(salarioAtualString);

		String genero = JOptionPane
				.showInputDialog("Digite qual o seu g�nero: ex.: \"M\" (Masculino) e \"F\" para (feminino)");

		String anosDeEmpresaString = JOptionPane.showInputDialog("Digite a quantos anos trabalha na empresa: ").trim()
				.replace(",", ".");
		double anosDeEmpresa = Double.parseDouble(anosDeEmpresaString);

		if (genero.equalsIgnoreCase("f")) {

			if (anosDeEmpresa <= 15) {
				System.out.printf("Sal�rio atual:  R$ %.2f.\n", salarioAtual);
				System.out.printf("Sal�rio com Reajuste de 5%%:  R$ %.2f.\n", salarioAtual * 1.05);
			} else if (anosDeEmpresa > 15 && anosDeEmpresa <= 20) {
				System.out.printf("Sal�rio atual:  R$ %.2f.\n", salarioAtual);
				System.out.printf("Sal�rio com Reajuste de 12%%:  R$ %.2f.\n", salarioAtual * 1.12);
			} else if (anosDeEmpresa > 20) {
				System.out.printf("Sal�rio atual:  R$ %.2f.\n", salarioAtual);
				System.out.printf("Sal�rio com Reajuste de 20%%:  R$ %.2f.\n", salarioAtual * 1.20);
			}
		}
		if (genero.equalsIgnoreCase("m")) {

			if (anosDeEmpresa < 20) {
				System.out.printf("Sal�rio atual:  R$ %.2f.\n", salarioAtual);
				System.out.printf("Sal�rio com Reajuste de 3%%:  R$ %.2f.\n", salarioAtual * 1.03);
			} else if (anosDeEmpresa >= 20 && anosDeEmpresa <= 30) {
				System.out.printf("Sal�rio atual:  R$ %.2f.\n", salarioAtual);
				System.out.printf("Sal�rio com Reajuste de 13%%:  R$ %.2f.\n", salarioAtual * 1.13);
			} else if (anosDeEmpresa > 20) {
				System.out.printf("Sal�rio atual:  R$ %.2f.\n", salarioAtual);
				System.out.printf("Sal�rio com Reajuste de 25%%:  R$ %.2f.\n", salarioAtual * 1.25);
			}
		}

	}
}
