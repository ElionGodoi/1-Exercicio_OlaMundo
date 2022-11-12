package exercícios_guanabara;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
de triângulo será formado:
- EQUILÁTERO: todos os lados iguais
- ISÓSCELES: dois lados iguais
- ESCALENO: todos os lados diferentes
 */
 
public class Exercício_30 {
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
    		   System.out.println("Triângulo Equilátero.");
    	   }
    	   else if ( seg1==seg2 ||seg2==seg3 || seg3==seg1 ) {
    		   System.out.println("O triângulo formado é isósceles.");
    	   }
    	   else if( seg1!=seg2 && seg2!=seg3 && seg3 !=seg1) {
    		   System.out.println("O triângulo formado é Escaleno.");
    	   }
       } else {
    	   System.out.println("Os seguimentos de reta informado não podem formar um triângulo.");
       }
       
       
       
       
       entrada.close();
	}
}
