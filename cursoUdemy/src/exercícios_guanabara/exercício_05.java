package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 5) Fa�a um programa que leia as duas notas de um aluno em uma mat�ria e mostre
na tela a sua m�dia na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A m�dia entre 4.5 e 8.5 � igual a 6.5
 */
public class exerc�cio_05{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = entrada.nextDouble(); 
		System.out.println("Digite a segunda nota:");
		double nota2 = entrada.nextDouble(); 
		
		System.out.printf("A m�dia entre %.0f e %.0f � %.2f.",nota1,nota2,(nota1+nota2)/2.0);
		
		
		
		
		entrada.close();
	}
}