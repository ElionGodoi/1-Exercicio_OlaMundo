package exercícios_guanabara;

import javax.swing.JOptionPane;

/*
 * 10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 */

public class exercício_10{
	public static void main (String[] args) {
		String alturaParede = JOptionPane.showInputDialog("Digite a altura da parede:").replace(",", ".");	
		String larguraParede = JOptionPane.showInputDialog("Digite a largura da parede:").replace(",", ".");
		
		double alturaParede1=Double.parseDouble(alturaParede);
		double larguraParede1=Double.parseDouble(larguraParede);
		
		System.out.printf("A parede possui %.2f m² e precisará de %.2f litros de tinta.", (alturaParede1*larguraParede1), (alturaParede1*larguraParede1)/2);
		
	}
}

