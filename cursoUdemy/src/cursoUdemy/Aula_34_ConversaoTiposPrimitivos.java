package cursoUdemy;

public class Aula_34_ConversaoTiposPrimitivos {
public static void main(String[] args) {
	
	//byte,short,int,long = Tipos primitivos inteiros
	//float, double = Tipos primitivos com ponto flutuante
	// boolean = Tipo primitivo boleano true false
	// char = Tipo primitivo caracter -> entre aspas simples
	// String = Classe --> Entre aspas duplas
	
	double a = 1; // Conversão Implícita
	int b = (int)1.1; // Conversão Explícita de double para int
	float c = 2.89f; //Casting Facilitado -> Transforma o literal double em um float / Conversão Explícita
	
	
	System.out.println(b);// Valor Com perda de decimal devido ao cast
	
	
}
}
