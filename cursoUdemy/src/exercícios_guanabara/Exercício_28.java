package exercícios_guanabara;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 28) Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP
 */

public class Exercício_28 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String larguraString = JOptionPane.showInputDialog("Digite a largura do terreno:").replace(",", ".").trim();
		double largura = Double.parseDouble(larguraString); 
		
		String comprimentoString = JOptionPane.showInputDialog("Digite o comprimento do terreno:").replace(",", ".").trim();
		double comprimento = Double.parseDouble(comprimentoString); 
		
		double areaTerreno = largura*comprimento;
		
		if(areaTerreno<=0) {
			System.out.println("Área fora do escopo.");
		}
		else if (areaTerreno>0 && areaTerreno<=100) {
			System.out.printf("O terreno de área %.2f m² é Popular.",areaTerreno);			
		}
		else if (areaTerreno>100 && areaTerreno<=500) {
			System.out.printf("O terreno de área %.2f m² é Master.",areaTerreno);			
		}
		else if (areaTerreno>500) {
			System.out.printf("O terreno de área %.2f m² é VIP.",areaTerreno);			
		}
		
		

		entrada.close();
	}
}
