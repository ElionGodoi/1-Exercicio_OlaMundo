package exercícios_guanabara;
import java.util.Scanner;

/*
 * 8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
 */

public class exercício_08 {
	public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Digite uma distância em metros:");
        String distanciaMetros = entrada.next().replace(",", ".");
        
        Double distMetros = Double.parseDouble(distanciaMetros);
       
       
       System.out.printf("Distância em km: %.3f.\n", distMetros/1000);
       System.out.printf("Distância em hm: %.2f.\n", distMetros/100);
       System.out.printf("Distância em dam: %.2f.\n", distMetros/10);
       System.out.printf("Distância em m: %.2f.\n", distMetros);
       System.out.printf("Distância em dc: %.2f.\n", distMetros*10);
       System.out.printf("Distância em cm: %.2f.\n", distMetros*100);
       System.out.printf("Distância em mm: %.2f.\n", distMetros*1000);
       
       entrada.close();
       
	}
}
