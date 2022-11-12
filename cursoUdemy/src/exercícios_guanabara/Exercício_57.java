package exerc�cios_guanabara;

import javax.swing.JOptionPane;

/*
 * 57) Desenvolva um aplicativo que leia o sal�rio e o sexo de v�rios funcion�rios.
No final, mostre o total de sal�rios pagos aos homens e o total pago �s
mulheres. O programa vai perguntar ao usu�rio se ele quer continuar ou n�o
sempre que ler os dados de um funcion�rio.
 */
public class Exerc�cio_57 {
	public static void main(String[] args) {
		int continuar = 1;
		double totalSalarioMulher = 0;
		double totalSalarioHomem = 0;

		while (continuar == 1) {

			String salarioString = JOptionPane.showInputDialog("Digite o valor do seu sal�rio:").replace(",", ".");
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
					.showInputDialog("Deseja continuar: \nDigite o n�mero:  [1] SIM. \n Digite o n�mero:  [2] N�O. ");
			continuar = Integer.parseInt(continuarString);

		}

		System.out.println("Sal�rio total dos Homens: " + totalSalarioHomem);
		System.out.println("Sal�rio total das Mulheres: " + totalSalarioMulher);

	}
}
