package exercícios_guanabara;

import java.util.Scanner;

/*
 * 31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura).
 */

public class Exercício_31 {
	public static void main(String[] args) {
       
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("****************************");
		System.out.println("Jogo Pedra, Papel, Tesoura:");
		System.out.println("****************************");
		
		System.out.println("Primeiro Jogador:");
		System.out.println("Digite o número (1) para - Pedra.");
		System.out.println("Digite o número (2) para - Papel.");
		System.out.println("Digite o número (3) para - tesoura.");
		int jogador1 = entrada.nextInt();
		
		System.out.println("Segundo Jogador:");
		System.out.println("Digite o número (1) para - Pedra.");
		System.out.println("Digite o número (2) para - Papel.");
		System.out.println("Digite o número (3) para - tesoura.");
		int jogador2 = entrada.nextInt();
		
		if (jogador1==jogador2) {
			System.out.println("Empate.");
		}
			else if(jogador1==1 && jogador2==2) {
				System.out.println("Primeiro= Pedra X Segundo= PaPel = Segundo jogador ganhou.");
			}
			else if(jogador1==1 && jogador2==3) {
				System.out.println("Primeiro= Pedra X Segundo= Tesoura = Primeiro jogador ganhou.");
			}
			else if(jogador1==2 && jogador2==1) {
				System.out.println("Primeiro= Papel X Segundo= pedra = Primeiro jogador ganhou.");
			}
			else if(jogador1==2 && jogador2==3) {
				System.out.println("Primeiro= Papel X Segundo= tesoura = Segundo jogador ganhou.");
			}
			else if(jogador1==3 && jogador2==1) {
				System.out.println("Primeiro= tesoura X Segundo= Pedra = Segundo jogador ganhou.");
			}
			else if(jogador1==3 && jogador2==2) {
				System.out.println("Primeiro= tesoura X Segundo= Papel = Primeiro jogador ganhou.");
			}
		
		entrada.close();
		
		}
	}

