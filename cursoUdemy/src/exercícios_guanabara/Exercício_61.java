package exercícios_guanabara;

/*
 * 61) Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
“faça enquanto”
0 3 6 9 12 15 18 21 24 27 30 Acabou!
 */
public class Exercício_61 {
	public static void main(String[] args) {

		int contador = 0;
		
		do {
			System.out.println(contador);
			contador += 3;
		} while (contador <= 30);
		
System.out.println("Acabou!");
	}
}
