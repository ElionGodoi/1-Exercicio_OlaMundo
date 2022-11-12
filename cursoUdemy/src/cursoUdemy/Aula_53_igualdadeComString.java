package cursoUdemy;

public class Aula_53_igualdadeComString {
	public static void main(String[] args) {

		String a = new String ("2  ");
		
		System.out.println("2".equals(a.trim()));
		
		
		double idade = 29;
		String idade1 = Double.toString(idade);
		
		
		
		String numero = "122.1";
		double numero1 = Double.parseDouble(numero);
		
	}
}
