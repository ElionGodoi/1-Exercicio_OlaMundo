package cursoUdemy;

public class Aula_47_operadoresLogicosDesafio {	
	public static void main(String[] args) {
		
		Boolean trabalhoNaTerça = !true;
		Boolean trabalhoNaQuarta = !true;
		
		System.out.print("Comprará televisão de 50 polegadas: ");
		System.out.println(trabalhoNaTerça && trabalhoNaQuarta);
		System.out.println("______________________________________");
		System.out.print("Comprará televisão de 25 polegadas: ");
		System.out.println(trabalhoNaTerça ^ trabalhoNaQuarta);
		System.out.println("______________________________________");
		System.out.print("irá ao shoping:");
		System.out.println(trabalhoNaTerça||trabalhoNaQuarta);
		System.out.println("______________________________________");
		System.out.print("Tomará sorvete:");
		System.out.println(trabalhoNaTerça||trabalhoNaQuarta);
		System.out.println("______________________________________");
		System.out.print("Mais saudável porque não tomou sorvete: ");
		System.out.println(!trabalhoNaTerça&&!trabalhoNaQuarta);
				
	}
}