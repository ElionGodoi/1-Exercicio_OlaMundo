package exerc�cios_guanabara;
/*
 * 43) Desenvolva um algoritmo que mostre uma contagem regressiva de 30 at� 1,
marcando os n�meros que forem divis�veis por 4, exatamente como mostrado abaixo:
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
 */
public class Exerc�cio_43 {
	public static void main(String[] args) {
		
		int contador =30;
		
	while (contador>=0) {
		
		if (contador%4==0)
			System.out.printf("[%d] ",contador);
		else
			System.out.printf("%d ",contador);
		
		contador--;
	}
		
		
		
	}
}
