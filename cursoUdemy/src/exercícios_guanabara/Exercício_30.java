package exerc�cios_guanabara;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 30) [DESAFIO] Refa�a o algoritmo 25, acrescentando o recurso de mostrar que tipo
de tri�ngulo ser� formado:
- EQUIL�TERO: todos os lados iguais
- IS�SCELES: dois lados iguais
- ESCALENO: todos os lados diferentes
 */
 
public class Exerc�cio_30 {
	public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       
       String seg1String = JOptionPane.showInputDialog("Digite o valor do primeiro seguimento de reta:");
       double seg1 = Double.parseDouble(seg1String);
       
       String seg2String = JOptionPane.showInputDialog("Digite o valor do segundo seguimento de reta:");
       double seg2 = Double.parseDouble(seg2String);
       
       String seg3String = JOptionPane.showInputDialog("Digite o valor do terceiro seguimento de reta:");
       double seg3 = Double.parseDouble(seg3String);
       
       if (seg1<seg2+seg3 && seg2<seg1+seg3 && seg3<seg1+seg2) {
    	   if ( seg1==seg2 && seg2==seg3) {
    		   System.out.println("Tri�ngulo Equil�tero.");
    	   }
    	   else if ( seg1==seg2 ||seg2==seg3 || seg3==seg1 ) {
    		   System.out.println("O tri�ngulo formado � is�sceles.");
    	   }
    	   else if( seg1!=seg2 && seg2!=seg3 && seg3 !=seg1) {
    		   System.out.println("O tri�ngulo formado � Escaleno.");
    	   }
       } else {
    	   System.out.println("Os seguimentos de reta informado n�o podem formar um tri�ngulo.");
       }
       
       
       
       
       entrada.close();
	}
}
