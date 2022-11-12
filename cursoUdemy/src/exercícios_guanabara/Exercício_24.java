package exercícios_guanabara;
import java.util.Scanner;
/*
 * 24) Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.
 */
public class Exercício_24 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a distância que deseja percorrer em km: ");
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
