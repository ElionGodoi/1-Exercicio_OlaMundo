package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 62) Fa�a um programa usando a estrutura �fa�a enquanto� que leia a idade de
v�rias pessoas. A cada la�o, voc� dever� perguntar para o usu�rio se ele quer ou
n�o continuar a digitar dados. No final, quando o usu�rio decidir parar, mostre
na tela:
a) Quantas idades foram digitadas
b) Qual � a m�dia entre as idades digitadas
c) Quantas pessoas tem 21 anos ou mais.
 */
public class Exerc�cio_62 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String parar = "";
		double idade = 0;
		double quantificadorDeIdadesDigitadas = 0;
		double somatotalIdades = 0;
		double quantidadeDePessoasMaioresDe21 = 0;

		do {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextDouble();

			if (idade > 21) {
				quantidadeDePessoasMaioresDe21++;
			}

			somatotalIdades += idade;
			quantificadorDeIdadesDigitadas++;
			System.out.println("Deseja parar?");
			System.out.println("Digite o n�mero 1 para (SIM).");
			System.out.println("Digite o n�mero 2 para (N�O).");
			parar = entrada.next();

		} while (!parar.equals("1"));
		
		System.out.println("Quantidade de idades digitadas: "+quantificadorDeIdadesDigitadas);
		System.out.println("M�dia entre idades digitadas: "+somatotalIdades/quantificadorDeIdadesDigitadas);
		System.out.println("Quantidade de pessoas maiores de 21 anos: "+quantidadeDePessoasMaioresDe21);
		

		entrada.close();
	}
}
