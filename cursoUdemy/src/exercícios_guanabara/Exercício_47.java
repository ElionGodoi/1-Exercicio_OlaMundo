package exerc�cios_guanabara;

/*
 * 47) Desenvolva um aplicativo que mostre na tela o resultado da express�o 500 +
450 + 400 + 350 + 300 + ... + 50 + 0
 */
public class Exerc�cio_47 {
	public static void main(String[] args) {

		int contador = 500;
		int somador = 0;

		while (contador >= 0) {
			System.out.println(contador);
			somador += contador;

			contador -= 50;
		}

		System.out.println("Soma total: "+somador);
		
	}
}
