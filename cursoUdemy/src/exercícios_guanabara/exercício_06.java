package exercícios_guanabara;

import java.util.Scanner;

/*
 * 6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
 */

public class exercício_06 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
        double numero = entrada.nextDouble();
        
        System.out.printf("O sucesso do número %.0f é: %.0f.\n", numero, numero+1);
        System.out.printf("O antecessor do número %.0f é: %.0f.", numero, numero-1);
        
		entrada.close();
	}
}
