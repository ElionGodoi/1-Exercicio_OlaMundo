package exerc�cios_guanabara;

/*
 * 65) Desenvolva um programa usando a estrutura �para� que mostre na tela a
seguinte contagem:
100 90 80 70 60 50 40 30 20 10 0 Acabou!
 */
public class Exerc�cio_65 {
	public static void main(String[] args) {

		for (int i = 100; i >= 0; i -= 10) {
			System.out.println(i);

		}
		System.out.println("Acabou");
	}
}
