package exerc�cios_guanabara;

import java.util.Scanner;

/*
 * 44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o �ltimo Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!
 */
public class Exerc�cio_44 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o primeiro valor:");
	int primeiroValor = entrada.nextInt();
	
	System.out.println("Digite o �ltimo valor:");
	int ultimoValor = entrada.nextInt();
	
	System.out.println("Digite o incremento:");
	int incremento = entrada.nextInt();
	
	int s = primeiroValor;	
	if(primeiroValor>ultimoValor) {
		primeiroValor = ultimoValor;
		ultimoValor = s;
	}
	while (primeiroValor<=ultimoValor) {
		System.out.println(primeiroValor);		
		primeiroValor+=incremento;
	}
	
	
	
	entrada.close();
}
}
