package cursoUdemy;
import java.util.Scanner;

public class Aula_37_DasafioConversao {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
             
        System.out.println("Digite o valor do primeiro sal�rio:");
        String salario1 = entrada.next();
  
        System.out.println("Digite o valor do segundo sal�rio:");
        String salario2 = entrada.next();
        
        System.out.println("Digite o valor do terceiro sal�rio:");
        String salario3 = entrada.next();
        
        double salario11 = Double.parseDouble(salario1);
        double salario22 = Double.parseDouble(salario2);
        double salario33 = Double.parseDouble(salario3);
                        
        System.out.println("Valor da m�dia Salarial:"+((salario11+salario22+salario33)/3));
        
        entrada.close();
        
        
        
	}

}
