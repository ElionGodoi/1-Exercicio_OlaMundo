package exercícios_guanabara;

import java.util.Scanner;

/*
 * 7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666
 */

public class exercício_07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número real:");
		double numero = entrada.nextDouble();
		
		System.out.printf("O dobro do número: %.2f é %.2f.%n",numero,numero*2);
		System.out.printf("A terça parte do número: %.2f é %.2f.",numero,numero/3.0);

		entrada.close();
	}
}
