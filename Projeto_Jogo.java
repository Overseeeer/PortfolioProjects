package prova_bruno;

import java.util.Scanner;

public class questao2 {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("\n=== JOGO DO LOBO, OVELHA E REPOLHO ===\n\n");
		
		System.out.printf("Itens do lado esquerdo do rio: ");
		System.out.printf("\n1- Lobo\n2- Ovelha\n3- Repolho\n");
		
		System.out.printf("\n\nEscolha um item para transportar para o lado direito do rio: ");
		int jogada = scan.nextInt();
		
		int volta;
		char escolha;
		
		if(jogada == 1) {
			System.out.printf("\nVocê perdeu, a ovelha ficou sozinha com o repolho!");
			
		}else if(jogada == 3){
			System.out.printf("\nVocê perdeu, o lobo ficou sozinho com a ovelha!");
			
		}else if(jogada == 2) {
			System.out.printf("\nItens do lado esquerdo do rio: ");
			System.out.printf("\n1- Lobo\n3- Repolho");
			System.out.printf("\n\nItens do lado direito do rio: ");
			System.out.printf("\n2- Ovelha");
			
			System.out.printf("\n\nDeseja levar algo de volta para o lado esquerdo? (s/n) ");
			escolha = scan.next().charAt(0);
			
			if(escolha == 's') {
				System.out.printf("\nVocê perdeu, pois voltou à jogada anterior!");
				
			}else if(escolha == 'n') {
				System.out.printf("\n\nEscolha um item para transportar para o lado direito do rio: ");
				jogada = scan.nextInt();
				
				if(jogada == 1) {
					System.out.printf("\nItens do lado esquerdo do rio: ");
					System.out.printf("\n3- Repolho");
					System.out.printf("\n\nItens do lado direito do rio: ");
					System.out.printf("\n1- Lobo\n2- Ovelha");
					
					System.out.printf("\n\nDeseja levar algo de volta para o lado esquerdo? (s/n) ");
					escolha = scan.next().charAt(0);
					
					if(escolha == 'n') {
						System.out.printf("\nVocê perdeu, o lobo devorou a ovelha!");
						
					}else if(escolha == 's') {
						System.out.printf("\n\nEscolha um item para transportar para o lado esquerdo do rio: ");
						volta = scan.nextInt();
						
						if(volta == 2) {
							System.out.printf("\nItens do lado esquerdo do rio: ");
							System.out.printf("\n2- Ovelha\n3- Repolho");
							System.out.printf("\n\nItens do lado direito do rio: ");
							System.out.printf("\n1- Lobo");
							
							System.out.printf("\n\nEscolha um item para transportar para o lado direito do rio: ");
							jogada = scan.nextInt();
							
							if(jogada == 3) {
								System.out.printf("\nItens do lado esquerdo do rio: ");
								System.out.printf("\n2- Ovelha");
								System.out.printf("\n\nItens do lado direito do rio: ");
								System.out.printf("\n1- Lobo\n2- Repolho");
								
								System.out.printf("\n\nDeseja levar algo de volta para o lado esquerdo? (s/n) ");
								escolha = scan.next().charAt(0);
								
								if(escolha == 's') {
									System.out.printf("\n\nEscolha um item para transportar para o lado esquerdo do rio: ");
									volta = scan.nextInt();
									
									if(volta == 1) {
										System.out.printf("\nVocê perdeu, o lobo comeu a ovelha!");
										
									}
									if(volta == 2) {
										System.out.printf("\nVocê perdeu, a ovelha comeu o repolho!");
										
									}
									
								}
								if(escolha == 'n') {
									System.out.printf("\nItens do lado esquerdo do rio: ");
									System.out.printf("\n2- Ovelha");
									System.out.printf("\n\nItens do lado direito do rio: ");
									System.out.printf("\n1- Lobo\n2- Repolho");
									
									System.out.printf("\n\nEscolha um item para transportar para o lado direito do rio: ");
									jogada = scan.nextInt();
									
									if(jogada == 2) {
										System.out.printf("\n\nItens do lado esquerdo do rio: ");
										System.out.printf("\nNenhum!");
										System.out.printf("\n\nItens do lado direito do rio: ");
										System.out.printf("\n1- Lobo\n2- Repolho\n3- Ovelha");
										
										System.out.printf("\n\nVocê venceu!");
										
									}
								}
								
							}else if(jogada == 2) {
								System.out.printf("Você perdeu, pois voltou à jogada anterior!");
							}
						}else if(volta == 1) {
							System.out.printf("\nVocê perdeu, pois voltou à jogada anterior!");
						}
					}
				}else if(jogada == 3) {
					System.out.printf("\nItens do lado esquerdo do rio: ");
					System.out.printf("\n1- Lobo");
					System.out.printf("\n\nItens do lado direito do rio: ");
					System.out.printf("\n2- Ovelha\n3- Repolho");
					
					System.out.printf("\n\nDeseja levar algo de volta para o lado esquerdo? (s/n) ");
					escolha = scan.next().charAt(0);
					
					if(escolha == 's') {
						System.out.printf("\n\nEscolha um item para transportar para o lado esquerdo do rio: ");
						volta = scan.nextInt();
						
						if(volta == 3) {
							System.out.printf("\nVocê perdeu, pois voltou à jogada anterior!");
							
						}else if(volta == 2) {
							System.out.printf("\nItens do lado esquerdo do rio: ");
							System.out.printf("\n1- Lobo\n2- Ovelha");
							System.out.printf("\n\nItens do lado direito do rio: ");
							System.out.printf("\n3- Repolho");
							
							System.out.printf("\n\nEscolha um item para transportar para o lado direito do rio: ");
							jogada = scan.nextInt();
							
							if(jogada == 1) {
								System.out.printf("\nItens do lado esquerdo do rio: ");
								System.out.printf("\n2- Ovelha");
								System.out.printf("\n\nItens do lado direito do rio: ");
								System.out.printf("\n1- Lobo\n3- Repolho");
								
								System.out.printf("\n\nDeseja levar algo de volta para o lado esquerdo? (s/n) ");
								escolha = scan.next().charAt(0);
								
								if(escolha == 's') {
									System.out.printf("\n\nEscolha um item para transportar para o lado esquerdo do rio: ");
									volta = scan.nextInt();
									
									if(volta == 1) {
										System.out.printf("\nVocê perdeu, o lobo comeu a ovelha!");
										
									}
									if(volta == 3) {
										System.out.printf("\nVocê perdeu, a ovelha comeu o repolho!");
										
									}
									
								}else if(escolha == 'n') {
									System.out.printf("\nItens do lado esquerdo do rio: ");
									System.out.printf("\n2- Ovelha");
									System.out.printf("\n\nItens do lado direito do rio: ");
									System.out.printf("\n1- Lobo\n3- Repolho");
									
									System.out.printf("\n\nEscolha um item para transportar para o lado direito do rio: ");
									jogada = scan.nextInt();
									
									if(jogada == 2) {
										System.out.printf("\n\nItens do lado esquerdo do rio: ");
										System.out.printf("\nNenhum!");
										System.out.printf("\n\nItens do lado direito do rio: ");
										System.out.printf("\n1- Lobo\n2- Repolho\n3- Ovelha");
										
										System.out.printf("\n\nVocê venceu!");
										
									}else {
										System.out.printf("\nVocê perdeu, pois voltou à rodada anterior");
										
									}
								}
							}
						}
					}else if(escolha == 'n') {
						System.out.printf("Você perdeu, a ovelha devorou o repolho!");
						
					}
					
				}
			}
			
			
		}
		scan.close();
	}
}
