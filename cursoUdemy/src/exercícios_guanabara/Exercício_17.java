package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 18) Fa�a um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou n�o votar.
 */
public class Exerc�cio_17 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o ano do seu nascimento:");
	Double anoNascimento = entrada.nextDouble();
	
	Double idadeAtualAno2022 = 2022-anoNascimento;
	
	
	if(idadeAtualAno2022>=16) {
	System.out.printf("Sua idade atual � %.0f anos e voc� pode votar.",idadeAtualAno2022);
	}
	if(idadeAtualAno2022<16) {
		System.out.printf("Sua idade atual � %.0f anos e voc� n�o pode votar.",idadeAtualAno2022);
		}
	
	
	
	
	entrada.close();
}
}
