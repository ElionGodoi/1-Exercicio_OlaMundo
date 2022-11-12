package exercícios_guanabara;

/*
 * 46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100.
 */
public class Exercício_46 {
	public static void main(String[] args) {

		int contador = 6;
		int somador = 0;

		while (contador <= 100) {
			System.out.println(contador);
			somador += contador;
			contador += 2;
		}
		System.out.println("Resultado da soma:"+somador);
	}
}
