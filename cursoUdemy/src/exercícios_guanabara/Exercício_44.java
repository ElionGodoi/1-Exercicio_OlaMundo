package exercícios_guanabara;

import java.util.Scanner;

/*
 * 44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!
 */
public class Exercício_44 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o primeiro valor:");
	int primeiroValor = entrada.nextInt();
	
	System.out.println("Digite o último valor:");
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
