package cursoUdemy;

public class Aula_35_Conversão_NúmeroParaString {
public static void main(String[] args) {
	
	Double numero = 123.23;
	String numeroConvertido = Double.toString(numero);//Conversão de Double para String
	String numeroConvertida = numero.toString(numero);//Conversão de Double para String
	int we = 22345;
	
	System.out.println(numero.toString()); //Transformando Double para String diretamente
	System.out.println(numeroConvertida);
	System.out.println(Integer.toString(we).length()); //Transformando primitivo em String;
}
}
