package exercícios_guanabara;

import javax.swing.JOptionPane;

/*
 * 67) Faça um programa usando a estrutura “para” que leia um número inteiro
positivo e mostre na tela uma contagem de 0 até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
 */
public class Exercício_67 {
	public static void main(String[] args) {
		
		String numeroDigitadoString = JOptionPane.showInputDialog("Digite um número inteiro: ");
		int numeroDigitado = Integer.parseInt(numeroDigitadoString);
		
System.out.print("Contagem: ");
		for(int i = 0 ;i<=numeroDigitado;i++) {
			System.out.print(i+", ");
		}
		System.out.println("FIM!");
		
		
	}
}
