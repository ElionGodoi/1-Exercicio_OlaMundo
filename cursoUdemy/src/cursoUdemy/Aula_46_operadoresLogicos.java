package cursoUdemy;

public class Aula_46_operadoresLogicos{
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3>7; //Opedador relacional
		
		System.out.println(condicao1&&condicao2); //Operador Lógico "e"
		System.out.println(condicao1||condicao2);//Operador Lógico "ou"
		System.out.println(condicao1^!condicao2);//Operador Lógico "ou" exclusivo
		System.out.println(!condicao1);// Operador Lógico "Negação"
		
		
		System.out.println("_______________________________________");
		System.out.println("Tabela Verdade do conectivo \"e\" (AND) .");
		
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		System.out.println("_______________________________________");
		
		System.out.println("_______________________________________");
		System.out.println("Tabela Verdade do conectivo \"ou\" (OR) .");
		
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		System.out.println("_______________________________________");
		System.out.println("_______________________________________");
		System.out.println("Tabela Verdade do conectivo \"ou exclusivo\" (XOR).");
		
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		
		System.out.println("_______________________________________");
		System.out.println("Tabela Verdade do conectivo de \"NEGAÇÃO\" (NOT).");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println("_______________________________________");
		
	}
}