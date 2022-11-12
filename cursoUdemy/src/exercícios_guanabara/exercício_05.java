package exercícios_guanabara;

import java.util.Scanner;

/*
 * 5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
 */
public class exercício_05{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = entrada.nextDouble(); 
		System.out.println("Digite a segunda nota:");
		double nota2 = entrada.nextDouble(); 
		
		System.out.printf("A média entre %.0f e %.0f é %.2f.",nota1,nota2,(nota1+nota2)/2.0);
		
		
		
		
		entrada.close();
	}
}