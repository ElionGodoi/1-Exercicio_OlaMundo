package exerc�cios_guanabara;
/*
 * 39) Fa�a um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!
 */

public class Exerc�cio_39 {
	public static void main(String[] args) {

		int contador = 10;

		while (contador >= 3) {
			System.out.println(contador);
			contador--;

		}

		System.out.println("Acabou!");

	}
}
