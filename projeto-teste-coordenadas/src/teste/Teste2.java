package teste;

import java.util.Scanner;

public class Teste2 {

	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int var = 0, linha = 0, coluna = 0;
		int linhaAntiga = 0, colunaAntiga = 0;
		do {
			int[][] vetor = new int[5][5];
			vetor[linha][coluna] = 1;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (vetor[i][j] == 1) {
						System.out.print("[o]");
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
			System.out.print("\n");
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
}
