package exerc�cios_guanabara;

import javax.swing.JOptionPane;

/*
 * 42) Fa�a um algoritmo que pergunte ao usu�rio um n�mero inteiro e positivo
qualquer e mostre uma contagem at� esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
 */
public class Exerc�cio_42 {
	public static void main(String[] args) {

		String valorString = JOptionPane.showInputDialog("Digite um valor inteiro positivo para obter a contagem: ");
		double valor = Double.parseDouble(valorString);
		
		int contador = 0;
		
		while(contador<=valor) {
			System.out.println(contador);
			
			contador++;
		}
		
	}
}
