package exercícios_guanabara;

import java.util.Scanner;

/*
 * 19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0).
 */
public class Exercício_18 {
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
			System.out.printf("O aluno %s teve média igual a %.2f pontos e teve um bom aproveiramento.",nome,media);
		}
		if(media<7 && media>=5) {
			System.out.printf("O aluno %s teve média igual a %.2f pontos e ficou em recuperação.",nome,media);
		}
		if(media<=4) {
			System.out.printf("O aluno %s teve média igual a %.2f pontos e foi reprovado.",nome,media);
		}
		
		
		
		

		entrada.close();
	}
}
