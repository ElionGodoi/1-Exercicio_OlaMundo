package exerc�cios_guanabara;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 28) Fa�a um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua �rea em m�. O programa tamb�m
devemostrar a classifica��o desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m� = TERRENO POPULAR
- Entre 100m� e 500m� = TERRENO MASTER
- Acima de 500m� = TERRENO VIP
 */

public class Exerc�cio_28 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String larguraString = JOptionPane.showInputDialog("Digite a largura do terreno:").replace(",", ".").trim();
		double largura = Double.parseDouble(larguraString); 
		
		String comprimentoString = JOptionPane.showInputDialog("Digite o comprimento do terreno:").replace(",", ".").trim();
		double comprimento = Double.parseDouble(comprimentoString); 
		
		double areaTerreno = largura*comprimento;
		
		if(areaTerreno<=0) {
			System.out.println("�rea fora do escopo.");
		}
		else if (areaTerreno>0 && areaTerreno<=100) {
			System.out.printf("O terreno de �rea %.2f m� � Popular.",areaTerreno);			
		}
		else if (areaTerreno>100 && areaTerreno<=500) {
			System.out.printf("O terreno de �rea %.2f m� � Master.",areaTerreno);			
		}
		else if (areaTerreno>500) {
			System.out.printf("O terreno de �rea %.2f m� � VIP.",areaTerreno);			
		}
		
		

		entrada.close();
	}
}
