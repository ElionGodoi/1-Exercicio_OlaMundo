package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
m�dia e mostre na tela. No final, analise a m�dia e mostre se o aluno teve ou
n�o um bom aproveitamento (se ficou acima da m�dia 7.0).
 */
public class Exerc�cio_18 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua primeira nota:");
		String nota1String = entrada.next().replace(",", ".");
		Double nota1 = Double.parseDouble(nota1String);
		
		System.out.println("Digite sua segunda nota:");
		String nota2String = entrada.next().replace(",", ".");
		Double nota2 = Double.parseDouble(nota2String);
		
		
		Double media = (nota1+nota2)/2;
		
		if(media>=7) {
			System.out.printf("O aluno %s teve m�dia igual a %.2f pontos e teve um bom aproveiramento.",nome,media);
		}
		if(media<7 && media>=5) {
			System.out.printf("O aluno %s teve m�dia igual a %.2f pontos e ficou em recupera��o.",nome,media);
		}
		if(media<=4) {
			System.out.printf("O aluno %s teve m�dia igual a %.2f pontos e foi reprovado.",nome,media);
		}
		
		
		
		

		entrada.close();
	}
}
