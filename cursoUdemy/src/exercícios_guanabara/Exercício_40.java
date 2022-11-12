package exercícios_guanabara;

/*
 * 40) Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
 */
public class Exercício_40 {
	public static void main(String[] args) {

		int contagem = 0;

		while (contagem <= 18) {
			System.out.println(contagem);

			contagem += 3;
		}
		
		System.out.println("Acabou!");

	}
}