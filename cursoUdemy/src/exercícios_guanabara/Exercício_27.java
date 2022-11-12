package exerc�cios_guanabara;

import java.util.Scanner;

/*
 
 * 27) Crie um programa que leia duas notas de um aluno e calcule a sua m�dia,
mostrando uma mensagem no final, de acordo com a m�dia atingida:

- M�dia at� 4.9: REPROVADO
- M�dia entre 5.0 e 6.9: RECUPERA��O
- M�dia 7.0 ou superior: APROVADO

 */

public class Exerc�cio_27 {
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
			System.out.println("M�dia fora do Escopo.");
		}
		else if(mediaNota1E2<=4.9) {
			System.out.println("Aluno reprovado.");
		}
		
		else if(mediaNota1E2>=5 && mediaNota1E2<=6.9 ) {
			System.out.println("Aluno em recupera��o.");
		}
		else if(mediaNota1E2>=7) {
			System.out.println("Aluno aprovado.");
		}
		

		entrada.close();
	}
}
