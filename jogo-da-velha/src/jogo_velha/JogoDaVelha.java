package jogo_velha;

import java.util.Scanner;

public class JogoDaVelha {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("\n     # JOGO DA VELHA #\n");

		int[][] matriz = new int[3][3];
		boolean vitoria = false;
		int coluna = 0, linha = 0, jogador = 2;

		do {
			
			Imprime(matriz);
			Coordenadas(jogador, linha, coluna, matriz, vitoria);
			jogador++;
			
		} while (Analise(matriz, vitoria) != true);
	}
	

	private static void Coordenadas(int jogador, int linha, int coluna, int[][] matriz, boolean vitoria) {

		// SE VAR = 9 TODOS OS CAMPOS OU É 1 OU É -1
		int cont = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matriz[i][j] != 0) {
					cont++;
					if (cont == 9) {
						System.out.print("\n\n---------- EMPATE ----------\n");
						System.exit(0);
					}
				}
			}
		}

		// SE VAR != 9 AINDA TEM ESPAÇO PRA PREENCHER
		if (cont != 9) {
			if (jogador % 2 == 0) {
				System.out.print("\n\n========= Jogador 1 =========");
			} else {
				System.out.print("\n\n========= Jogador 2 =========");
			}
			// PEGANDO COORDENADAS DOS JOGADOREES
			System.out.print("\n\nLinha: ");
			linha = sc.nextInt();
			System.out.print("Coluna: ");
			coluna = sc.nextInt();
			
			Erros(linha, coluna, matriz, jogador, vitoria);
		}
	}

	private static void Erros(int linha, int coluna, int[][] matriz, int jogador, boolean vitoria) {
		// CASOS DE ERROS
		if ((linha - 1) > 2 || (coluna - 1) > 2 || (linha - 1) < 0 || (coluna - 1) < 0) {
			System.out.print("\n---- ATENÇÃO MATRIZ 3x3 ----");
			Coordenadas(jogador, linha, coluna, matriz, vitoria);
		} else {
			if (matriz[linha - 1][coluna - 1] == 1 || matriz[linha - 1][coluna - 1] == -1) {
				System.out.print("\n---- LUGAR JÁ PREENCHIDO ----");
				Coordenadas(jogador, linha, coluna, matriz, vitoria);
			} else {
				// O 1º JOGADOR SEMPRE É PAR
				// X = 1 O = -1
				if (jogador % 2 == 0) {
					matriz[linha - 1][coluna - 1] = 1;
				} else {
					matriz[linha - 1][coluna - 1] = -1;
				}
			}
		}
	}

	private static void Imprime(int[][] matriz) {

		// MOSTRA O INICIO DO JOGO E O ESTADO ATUAL DELE
		System.out.print("           1  2  3");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					System.out.print("\n\t" + (i + 1) + " ");
				}
				if (matriz[i][j] == 0) {
					System.out.print("[_]");
				} else if (matriz[i][j] == 1) {
					System.out.print("[x]");
				} else if (matriz[i][j] == -1) {
					System.out.print("[o]");
				}
			}
		}
	}

	private static boolean Analise(int[][] matriz, boolean vitoria) {

		// CASOS DE VITORIA

		// LINHA 1
		if (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 1\nLINHA 1\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		if (matriz[0][0] == -1 && matriz[0][1] == -1 && matriz[0][2] == -1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 2\nLINHA 1\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		// LINHA 2
		if (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 1\nLINHA 2\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		if (matriz[1][0] == -1 && matriz[1][1] == -1 && matriz[1][2] == -1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 2\nLINHA 2\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		// LINHA 3
		if (matriz[2][0] == 1 && matriz[2][1] == 1 && matriz[2][2] == 1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 1\nLINHA 3\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		if (matriz[2][0] == -1 && matriz[2][1] == -1 && matriz[2][2] == -1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 2\nLINHA 3\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		// DIAGONAL PRINCIPAL
		if (matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 1\nDIAGONAL PRINCIPAL\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		if (matriz[0][0] == -1 && matriz[1][1] == -1 && matriz[2][2] == -1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 2\nDIAGONAL PRINCIPAL\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		// DIAGONAL SECUDARIA
		if (matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][0] == 1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 1\nDIAGONAL SECUNDARIA\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		if (matriz[0][2] == -1 && matriz[1][1] == -1 && matriz[2][0] == -1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 2\nDIAGONAL SECUNDARIA\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		// COLUNA 1
		if (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 1\nCOLUNA 1\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		if (matriz[0][0] == -1 && matriz[1][1] == -1 && matriz[2][0] == -1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 2\nCOLUNA 1\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		// COLUNA 2
		if (matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 1\n\tCOLUNA 2\n");
			Imprime(matriz);
			vitoria = true;
		}
		if (matriz[0][1] == -1 && matriz[1][1] == -1 && matriz[2][1] == -1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 2\nCOLUNA 2\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		// COLUNA 3
		if (matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 1\nCOLUNA 3\n\n");
			Imprime(matriz);
			vitoria = true;
		}
		if (matriz[0][2] == -1 && matriz[1][2] == -1 && matriz[2][2] == -1) {
			System.out.print("\nVENCEDOR JOGADOR NÚMERO 2\n\tCOLUNA 3\n");
			Imprime(matriz);
			vitoria = true;
		}
		return vitoria;
	}
}
