package cursoUdemy;

public class Aula_47_operadoresLogicosDesafio {	
	public static void main(String[] args) {
		
		Boolean trabalhoNaTer�a = !true;
		Boolean trabalhoNaQuarta = !true;
		
		System.out.print("Comprar� televis�o de 50 polegadas: ");
		System.out.println(trabalhoNaTer�a && trabalhoNaQuarta);
		System.out.println("______________________________________");
		System.out.print("Comprar� televis�o de 25 polegadas: ");
		System.out.println(trabalhoNaTer�a ^ trabalhoNaQuarta);
		System.out.println("______________________________________");
		System.out.print("ir� ao shoping:");
		System.out.println(trabalhoNaTer�a||trabalhoNaQuarta);
		System.out.println("______________________________________");
		System.out.print("Tomar� sorvete:");
		System.out.println(trabalhoNaTer�a||trabalhoNaQuarta);
		System.out.println("______________________________________");
		System.out.print("Mais saud�vel porque n�o tomou sorvete: ");
		System.out.println(!trabalhoNaTer�a&&!trabalhoNaQuarta);
				
	}
}