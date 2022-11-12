package cursoUdemy;

import javax.swing.JOptionPane;

public class Aula_36_ConversaoDeStringParaNumero {
	public static void main(String[] args) {

		String ar = "123.23";
		
		double mi = Double.parseDouble(ar);
		
		System.out.println(mi);
		
		String nome = JOptionPane.showInputDialog("Qual seu  nome:");
	}
}
