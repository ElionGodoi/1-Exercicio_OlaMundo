package exerc�cios_guanabara;
import java.util.Scanner;
/*
 * 24) Fa�a um algoritmo que pergunte a dist�ncia que um passageiro deseja
percorrer em Km. Calcule o pre�o da passagem, cobrando R$0.50 por Km para
viagens at� 200Km e R$0.45 para viagens mais longas.
 */
public class Exerc�cio_24 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a dist�ncia que deseja percorrer em km: ");
	String distanciaPercorridaString = entrada.next().trim().replace(",", ".");
	Double distanciaPercorrida = Double.parseDouble(distanciaPercorridaString);
	
	if (distanciaPercorrida<=200) {
		System.out.printf("Valor da passagem: %.0f",(distanciaPercorrida*0.50) );
	}
	
	if (distanciaPercorrida>200) {
		System.out.printf("Valor da passagem: %.0f",(distanciaPercorrida*0.45) );
	}
	
	
	
	entrada.close();
}
}
