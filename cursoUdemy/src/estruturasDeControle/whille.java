package estruturasDeControle;

import java.util.Scanner;

public class whille {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota;
		double quantidadeNotasValidas=0;
		double somaTotalNotas=0;
	
		do {
			
			System.out.println("Digite sua nota: ");
			nota = entrada.nextDouble();
			
			if(nota>=0 && nota<=10) {
				somaTotalNotas += nota;
				quantidadeNotasValidas++;	
			}
			else {
				System.out.println("Nota inv�lida.");
			}
			
		} while(nota != -1);
		
		System.out.printf("M�dia das notas v�lidas: %.2f.\n",somaTotalNotas/quantidadeNotasValidas);
		System.out.printf("Quantidade de notas v�lidas: %.0f.\n",quantidadeNotasValidas);
		System.out.printf("Soma das notas v�lidas: %.2f.\n",somaTotalNotas);
		
		entrada.close();

	}
}
