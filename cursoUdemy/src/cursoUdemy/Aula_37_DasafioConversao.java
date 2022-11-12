package cursoUdemy;
import java.util.Scanner;

public class Aula_37_DasafioConversao {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
             
        System.out.println("Digite o valor do primeiro salário:");
        String salario1 = entrada.next();
  
        System.out.println("Digite o valor do segundo salário:");
        String salario2 = entrada.next();
        
        System.out.println("Digite o valor do terceiro salário:");
        String salario3 = entrada.next();
        
        double salario11 = Double.parseDouble(salario1);
        double salario22 = Double.parseDouble(salario2);
        double salario33 = Double.parseDouble(salario3);
                        
        System.out.println("Valor da média Salarial:"+((salario11+salario22+salario33)/3));
        
        entrada.close();
        
        
        
	}

}
