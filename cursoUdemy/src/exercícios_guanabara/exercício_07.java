package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 7) Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a
sua ter�a parte.
Ex:
Digite um n�mero: 3.5
O dobro de 3.5 � 7.0
A ter�a parte de 3.5 � 1.16666
 */

public class exerc�cio_07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero real:");
		double numero = entrada.nextDouble();
		
		System.out.printf("O dobro do n�mero: %.2f � %.2f.%n",numero,numero*2);
		System.out.printf("A ter�a parte do n�mero: %.2f � %.2f.",numero,numero/3.0);

		entrada.close();
	}
}
