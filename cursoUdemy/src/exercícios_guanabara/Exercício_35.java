package exercícios_guanabara;

import javax.swing.JOptionPane;

/*
 * 35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
carro de luxo.

 Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
tabela a seguir:

- Carros populares (aluguel de R$90 por dia)
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km

- Carros de luxo (aluguel de R$150 por dia)
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por Km
 */

public class Exercício_35 {
	public static void main(String[] args) {
       System.out.println("****************************");
       System.out.println("Empresa de Aluguel de Carros");
       System.out.println("*****************************");
       
       System.out.println("Digite qual carro foi alugado:");
       System.out.println("Digite a letra \"P\" para carro Popular:");
       System.out.println("Digite a letra \"L\" para carro de Luxo:");
       String tipoDeCarro = JOptionPane.showInputDialog("Letra \"L\" ou \"P\".").toLowerCase();
            
       String diasAlugadosString = JOptionPane.showInputDialog("Por quantos dias o carro foi alugado:").trim().replace(",", ".");
       double diasAlugados = Double.parseDouble(diasAlugadosString);
       
       String kmPercorridosString = JOptionPane.showInputDialog("Quantos quilômetros foram percorridos:").trim().replace(",", ".");
       double kmPercorridos = Double.parseDouble(kmPercorridosString);
       
       if(tipoDeCarro.equalsIgnoreCase("p") && kmPercorridos<=100) {
    	   System.out.printf("Dias alugados X Valor diário = %.0f dia(s) x R$ %.2f = Total (R$ %.2f).\n",diasAlugados,90.0,diasAlugados*90);
    	   System.out.printf("Quilômetros percorridos X Valor do Quilômetro = %.2f km x R$ %.2f = Total ( R$ %.2f).\n",kmPercorridos,0.20,kmPercorridos*0.20);
    	   System.out.printf("Valor Total: R$ %.2f.",(diasAlugados*90)+(kmPercorridos*0.20));
       }
       else if(tipoDeCarro.equalsIgnoreCase("p") && kmPercorridos>100) {
    	   System.out.printf("Dias alugados X Valor diário = %.0f dia(s) x R$ %.2f = Total (R$ %.2f).\n",diasAlugados,90.0,diasAlugados*90);
    	   System.out.printf("Quilômetros percorridos X Valor do Quilômetro = %.2f km x R$ %.2f = Total ( R$ %.2f).\n",kmPercorridos,0.10,kmPercorridos*0.10);
    	   System.out.printf("Valor Total: R$ %.2f.",(diasAlugados*90)+(kmPercorridos*0.10));
       }
       else if(tipoDeCarro.equalsIgnoreCase("l") && kmPercorridos<=200) {
    	   System.out.printf("Dias alugados X Valor diário = %.0f dia(s) x R$ %.2f = Total (R$ %.2f).\n",diasAlugados,150.0,diasAlugados*150);
    	   System.out.printf("Quilômetros percorridos X Valor do Quilômetro = %.2f km x R$ %.2f = Total ( R$ %.2f).\n",kmPercorridos,0.30,kmPercorridos*0.30);
    	   System.out.printf("Valor Total: R$ %.2f.",(diasAlugados*150)+(kmPercorridos*0.30));
       }
       else if(tipoDeCarro.equalsIgnoreCase("l") && kmPercorridos>200) {
    	   System.out.printf("Dias alugados X Valor diário = %.0f dia(s) x R$ %.2f = Total (R$ %.2f).\n",diasAlugados,150.0,diasAlugados*150);
    	   System.out.printf("Quilômetros percorridos X Valor do Quilômetro = %.2f km x R$ %.2f = Total ( R$ %.2f).\n",kmPercorridos,0.25,kmPercorridos*0.25);
    	   System.out.printf("Valor Total: R$ %.2f.",(diasAlugados*150)+(kmPercorridos*0.25));
       }
	}
}
