package exerc�cios_guanabara;
import java.util.Scanner;

/*
 * 8) Desenvolva um programa que leia uma dist�ncia em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma dist�ncia em metros: 185.72
A dist�ncia de 85.7m corresponde a:
 */

public class exerc�cio_08 {
	public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Digite uma dist�ncia em metros:");
        String distanciaMetros = entrada.next().replace(",", ".");
        
        Double distMetros = Double.parseDouble(distanciaMetros);
       
       
       System.out.printf("Dist�ncia em km: %.3f.\n", distMetros/1000);
       System.out.printf("Dist�ncia em hm: %.2f.\n", distMetros/100);
       System.out.printf("Dist�ncia em dam: %.2f.\n", distMetros/10);
       System.out.printf("Dist�ncia em m: %.2f.\n", distMetros);
       System.out.printf("Dist�ncia em dc: %.2f.\n", distMetros*10);
       System.out.printf("Dist�ncia em cm: %.2f.\n", distMetros*100);
       System.out.printf("Dist�ncia em mm: %.2f.\n", distMetros*1000);
       
       entrada.close();
       
	}
}
