package jogo_rostinho;

import java.util.Scanner;

public class JogoDoRostinho2 {

	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int var = 0, linha = 0, coluna = 0;
		int linhaAntiga = 0, colunaAntiga = 0;
		Menu();
		do {
			int[][] vetor = new int[5][5];
			vetor[4][4] = -1;
			vetor[3][4] = -2;
			vetor[2][2] = -3;
			vetor[4][3] = -4;
			vetor[linha][coluna] = 1;
			for (int i = 0; i < 5; i++) {
				System.out.print("\t    ");
				for (int j = 0; j < 5; j++) {
					if (vetor[i][j] == -1) {
						System.out.print("[□]");
					}
					if(vetor[i][j] == -2) {
						System.out.print("[○]");
					}
					if(vetor[i][j] == -3) {
						System.out.print("[○]");
					}
					if(vetor[i][j] == -4) {
						System.out.print("[○]");
					}
					
					if (vetor[i][j] == 1) {
						if (vetor[4][4] == 1) {
							System.out.print("[■]");
						}else if(vetor[4][3] == 1 || vetor[3][4] == 1 || vetor[2][2] == 1) {
							System.out.print("[×]");
						} else {	
							System.out.print("[□]");
						}
						linhaAntiga = i;
						colunaAntiga = j;
					}
					if (vetor[i][j] == 0) {
						System.out.print("[ ]");
					}

					if (j == 4) {
						System.out.print("\n");
					}
				}
			}
			if (vetor[4][4] == 1) {
				System.out.println("\n\t    PARABÉNS VOCÊ GANHOU");
				System.exit(0);
			}
			if (vetor[4][3] == 1 || vetor[3][4] == 1 || vetor[2][2] == 1) {
				System.out.println("\n\n\t     VOCÊ PERDEU");
				System.exit(0);
			}
			
			System.out.print("\n");
			System.out.print("Direção: ");
			var = sc.nextInt();

			if (var == 4) {
				if (colunaAntiga == 0) {
					coluna = colunaAntiga;
				} else {
					linha = linhaAntiga;
					coluna = colunaAntiga - 1;
				}
			} else if (var == 6) {
				if (colunaAntiga == 4) {
					coluna = colunaAntiga;
				} else {
					linha = linhaAntiga;
					coluna = colunaAntiga + 1;
				}
			} else if (var == 8) {
				if (linhaAntiga == 0) {
					linha = linhaAntiga;
				} else {
					linha = linhaAntiga - 1;
					coluna = colunaAntiga;
				}
			} else if (var == 2) {
				if (linhaAntiga == 4) {
					linha = linhaAntiga;
				} else {
					linha = linhaAntiga + 1;
					coluna = colunaAntiga;
				}
			} else if (var == 3) {
				if (linhaAntiga == 4 || colunaAntiga == 4) {
					linha = linhaAntiga;
				} else {
					linha = linhaAntiga + 1;
					coluna = colunaAntiga + 1;
				}
			} else if (var == 1) {
				if (linhaAntiga == 4 || colunaAntiga == 0) {
					linha = linhaAntiga;
				} else {
					linha = linhaAntiga + 1;
					coluna = colunaAntiga - 1;
				}
			} else if (var == 7) {
				if (linhaAntiga == 0 || colunaAntiga == 0) {
					linha = linhaAntiga;
				} else {
					linha = linhaAntiga - 1;
					coluna = colunaAntiga - 1;
				}
			} else if (var == 9) {
				if (linhaAntiga == 0 || colunaAntiga == 4) {
					linha = linhaAntiga;
				} else {
					linha = linhaAntiga - 1;
					coluna = colunaAntiga + 1;
				}
			} else {
				linha = linhaAntiga;
				coluna = colunaAntiga;
			}
		} while (true);
	}

	static void Menu() {
		System.out.println("------------------- MENU -------------------");
		System.out.println("SIGLAS:     								 ");
		System.out.println("            CIMA                      - CM");
		System.out.println("	    BAIXO                     - BX ");
		System.out.println("	    ESQUERDA                  - ES ");
		System.out.println("	    DIREITA                   - DI ");
		System.out.println("	    CIMA DIAGONAL PRINCIPAL   - CDP");
		System.out.println("	    BAIXO DIAGONAL PRINCIPAL  - BDP");
		System.out.println("	    CIMA DIAGONAL SECUNDARIA  - CDS");
		System.out.println("	    BAIXO DIAGONAL SECUNDARIA - BDP");
		System.out.println("                                          ");
		System.out.println("COMANDOS:");
		System.out.println("           7-CDP      8-CM    9-CDS       ");
		System.out.println("           4-ES               6-DI        ");
		System.out.println("           1-BDS      2-BX    3-BDP       ");
		System.out.println("                                          ");
		System.out.println("OBJETIVO:");
		System.out.println("           O (□)         ");
		System.out.println("           DEVE CHEGAR ATÉ (■) ");
		System.out.println("           CUIDADO COM (○)");
		System.out.println("--------------------------------------------");
	}
}
