package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 6) Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um n�mero: 9
O antecessor de 9 � 8
O sucessor de 9 � 10
 */

public class exerc�cio_06 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
        double numero = entrada.nextDouble();
        
        System.out.printf("O sucesso do n�mero %.0f �: %.0f.\n", numero, numero+1);
        System.out.printf("O antecessor do n�mero %.0f �: %.0f.", numero, numero-1);
        
		entrada.close();
	}
}
