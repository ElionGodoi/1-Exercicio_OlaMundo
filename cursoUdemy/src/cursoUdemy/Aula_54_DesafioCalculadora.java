package cursoUdemy;

import java.util.Scanner;

public class Aula_54_DesafioCalculadora {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o primeiro n�mero:");
	double num1 = entrada.nextDouble();
	System.out.println("Digite o segundo n�mero:");
	double num2 = entrada.nextDouble();
	System.out.println("Digite qual opera��o deseja realizar");
	String operacao = entrada.next();
	
	Double resultado = operacao.equals("*") ? num1*num2:0;
	 resultado = operacao.equals("+") ? num1+num2:resultado;
	 resultado = operacao.equals("-") ? num1-num2:resultado;
	 resultado = operacao.equals("/") ? num1/num2:resultado;
	 resultado = operacao.equals("%") ? num1%num2:resultado;
	 
	 
	System.out.println("Resultado da opera��o: "+resultado);
	
	
	entrada.close();
}
}
