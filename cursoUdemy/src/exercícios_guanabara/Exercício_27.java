package exercícios_guanabara;

import java.util.Scanner;

/*
 
 * 27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:

- Média até 4.9: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO

 */

public class Exercício_27 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		String nota1String = entrada.next().trim().replace(",", ".");
		double nota1 = Double.parseDouble(nota1String);
		
		System.out.println("Digite a primeira nota:");
		String nota2String = entrada.next().trim().replace(",", ".");
		double nota2 = Double.parseDouble(nota2String);
		
		double mediaNota1E2 = (nota1+nota2)/2;
		
		if(mediaNota1E2<0 && mediaNota1E2>10.1)  {
			System.out.println("Média fora do Escopo.");
		}
		else if(mediaNota1E2<=4.9) {
			System.out.println("Aluno reprovado.");
		}
		
		else if(mediaNota1E2>=5 && mediaNota1E2<=6.9 ) {
			System.out.println("Aluno em recuperação.");
		}
		else if(mediaNota1E2>=7) {
			System.out.println("Aluno aprovado.");
		}
		

		entrada.close();
	}
}
