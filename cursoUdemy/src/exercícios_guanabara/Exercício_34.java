package exercícios_guanabara;

import javax.swing.JOptionPane;

/*
 * 34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
indivíduo dentro de certas faixas.

- abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25: Peso ideal
- entre 25 e 30: Sobrepeso
- entre 30 e 40: Obesidade
- acima de 40: Obseidade mórbida
 */

public class Exercício_34 {
	public static void main(String[] args) {

		String pesoString = JOptionPane.showInputDialog("Digite o valor do seu peso em quilogramas: \"exe.: 68,5\".")
				.trim().replace(",", ".");
		double peso = Double.parseDouble(pesoString);

		String alturaString = JOptionPane.showInputDialog("Digite o valor da sua altura em metros: \"exe.: 1,68\".")
				.trim().replace(",", ".");
		double altura = Double.parseDouble(alturaString);

		double imc = peso / Math.pow(altura, 2);

		
		if (imc <= 18.5) {
			System.out.println("Abaixo do peso."); 
           System.out.printf("IMC: %.2f.\n",imc); 
		} 
		else if(imc>18.5 && imc<=25) {
			System.out.println("Ideal."); 
			System.out.printf("IMC: %.2f.\n",imc); 
		}		
		else if(imc>25 && imc<=30) {
			System.out.println("Sobrepeso."); 
			System.out.printf("IMC: %.2f.\n",imc); 
		}
		else if(imc>30 && imc<=40) {
			System.out.println("Obesidade."); 
			System.out.printf("IMC: %.2f.\n",imc); 
		}
		else if(imc>40) {
			System.out.println("Obesidade morbida."); 
			System.out.printf("IMC: %.2f.\n",imc); 
		}
						
	}
}
