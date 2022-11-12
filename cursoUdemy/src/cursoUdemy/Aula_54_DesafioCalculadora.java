package cursoUdemy;

import java.util.Scanner;

public class Aula_54_DesafioCalculadora {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o primeiro número:");
	double num1 = entrada.nextDouble();
	System.out.println("Digite o segundo número:");
	double num2 = entrada.nextDouble();
	System.out.println("Digite qual operação deseja realizar");
	String operacao = entrada.next();
	
	Double resultado = operacao.equals("*") ? num1*num2:0;
	 resultado = operacao.equals("+") ? num1+num2:resultado;
	 resultado = operacao.equals("-") ? num1-num2:resultado;
	 resultado = operacao.equals("/") ? num1/num2:resultado;
	 resultado = operacao.equals("%") ? num1%num2:resultado;
	 
	 
	System.out.println("Resultado da operação: "+resultado);
	
	
	entrada.close();
}
}
