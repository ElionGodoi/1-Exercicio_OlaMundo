package exercícios_guanabara;

import javax.swing.JOptionPane;

/*
 * 57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário.
 */
public class Exercício_57 {
	public static void main(String[] args) {
		int continuar = 1;
		double totalSalarioMulher = 0;
		double totalSalarioHomem = 0;

		while (continuar == 1) {

			String salarioString = JOptionPane.showInputDialog("Digite o valor do seu salário:").replace(",", ".");
			double salario = Double.parseDouble(salarioString);

			String sexo = JOptionPane
					.showInputDialog("Digite qual o seu sexo:\nLetra [M] para masculino. \nLetra [F] para feminino.")
					.replace(",", ".");

			if (sexo.equalsIgnoreCase("m")) {
				totalSalarioHomem += salario;
			}
			if (sexo.equalsIgnoreCase("f")) {
				totalSalarioMulher += salario;
			}

			String continuarString = JOptionPane
					.showInputDialog("Deseja continuar: \nDigite o número:  [1] SIM. \n Digite o número:  [2] NÃO. ");
			continuar = Integer.parseInt(continuarString);

		}

		System.out.println("Salário total dos Homens: " + totalSalarioHomem);
		System.out.println("Salário total das Mulheres: " + totalSalarioMulher);

	}
}
