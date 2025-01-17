package exerc�cios_guanabara;

import javax.swing.JOptionPane;

/*
 * 36) Um programa de vida saud�vel quer dar pontos atividades f�sicas que podem
ser trocados por dinheiro. O sistema funciona assim:

- Cada hora de atividade f�sica no m�s vale pontos
- at� 10h de atividade no m�s: ganha 2 pontos por hora
- de 10h at� 20h de atividade no m�s: ganha 5 pontos por hora
- acima de 20h de atividade no m�s: ganha 10 pontos por hora
- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)

Fa�a um programa que leia quantas horas de atividade uma pessoa teve por m�s,
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
 */

public class Exerc�cio_36 {
public static void main(String[] args) {
	
	String horasDeAtividadeString = JOptionPane.showInputDialog("Quantas horas de atividade voc� realizou no m�s: ").trim().replace(",", ".");
	double horasDeAtividade = Double.parseDouble(horasDeAtividadeString);
	
	if(horasDeAtividade<=10) {
		System.out.printf("Total de ponto(s): %.2f\n",horasDeAtividade*2);
		System.out.printf("Total do valor a receber: %.2f",(horasDeAtividade*2)*0.05);
		
	}
	else if(horasDeAtividade>10 && horasDeAtividade<=20) {
		System.out.printf("Total de ponto(s): %.2f\n",horasDeAtividade*5);
		System.out.printf("Total do valor a receber: %.2f",(horasDeAtividade*5)*0.05);
		
	}
	else if(horasDeAtividade>20) {
		System.out.printf("Total de ponto(s): %.2f\n",horasDeAtividade*10);
		System.out.printf("Total do valor a receber: %.2f",(horasDeAtividade*10)*0.05);
		
	}
	
}
}
