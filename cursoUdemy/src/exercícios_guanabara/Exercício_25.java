package exerc�cios_guanabara;
import java.util.Scanner;

/*
 * 25) [DESAFIO] Crie um programa que leia o tamanho de tr�s segmentos de reta.
Analise seus comprimentos e diga se � poss�vel formar um tri�ngulo com essas
retas. Matematicamente, para tr�s segmentos formarem um tri�ngulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois.
 */

public class Exerc�cio_25 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro seguimento de reta: ");
		String seg1String = entrada.next().trim().replace(",", ".");
		Double seg1 = Double.parseDouble(seg1String);
		
		System.out.println("Digite o valor do segundo seguimento de reta: ");
		String seg2String = entrada.next().trim().replace(",", ".");
		Double seg2 = Double.parseDouble(seg2String);
		
		System.out.println("Digite o valor do terceiro seguimento de reta: ");
		String seg3String = entrada.next().trim().replace(",", ".");
		Double seg3 = Double.parseDouble(seg3String);
		
		System.out.println(seg1<seg2);
	
		
		if(seg1<(seg2+seg3) &&  seg2<(seg1+seg3)  && seg3<(seg2+seg1)) {
			System.out.println("Os Seguimentos de reta formam um tri�ngulo.");
		}
		if(seg1>=(seg2+seg3) ||  seg2>=(seg1+seg3)  || seg3>=(seg2+seg1)) {
			System.out.println("Os Seguimentos de reta n�o formam um tri�ngulo.");
		}
		entrada.close();
	}
}
