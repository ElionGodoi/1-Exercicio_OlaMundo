package exercícios_guanabara;
import java.util.Scanner;

/*
 * 11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.
 */

public class exercício_11{
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de 'A':");
		String a = entrada.next().replace(",", ".");
		
		System.out.println("Digite o valor de 'B':");
		String b = entrada.next().replace(",", ".");
		
		System.out.println("Digite o valor de 'C':");
		String c = entrada.next().replace(",", ".");
		
		Double A = Double.parseDouble(a);
		Double B = Double.parseDouble(b);
		Double C = Double.parseDouble(c);
		
		Double delta = (Math.pow(B, 2))-4*A*C;
		
		System.out.println("Valor do Delta:"+delta+".");
		
		entrada.close();
	}
}