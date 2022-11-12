package exercícios_guanabara;

import java.util.Scanner;

/*
 * 18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.
 */
public class Exercício_17 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o ano do seu nascimento:");
	Double anoNascimento = entrada.nextDouble();
	
	Double idadeAtualAno2022 = 2022-anoNascimento;
	
	
	if(idadeAtualAno2022>=16) {
	System.out.printf("Sua idade atual é %.0f anos e você pode votar.",idadeAtualAno2022);
	}
	if(idadeAtualAno2022<16) {
		System.out.printf("Sua idade atual é %.0f anos e você não pode votar.",idadeAtualAno2022);
		}
	
	
	
	
	entrada.close();
}
}
