package jogo_cruzadinha;

import java.util.Scanner;

public class JogoDaCruzadinha {
	static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		String nome1 = "abacate";
		String[] vetor1 = new String[nome1.length()];
		String nome2 = "banana";
		String[] vetor2 = new String[nome2.length()];
		int numero = 0;
		String letra;
		int cont = 1;
		int coluna = 0;

		do {

			if (cont == 1) {
				System.out.print("\t        2");
				System.out.print("\n\t");
				System.out.print("1 - ");
				for (int a = 0; a < nome1.length(); a++) {
					System.out.print("[" + nome1.charAt(a) + "]");
					if (a == nome1.length() - 1) {
						System.out.print("\n");
						for (int b = 1; b < nome2.length(); b++) {
							System.out.print("\t       ");
							System.out.print("[" + nome2.charAt(b) + "]");
							System.out.print("\n");
						}
					}
				}
				System.out.println("\n---------PALAVRA CRUZADA---------");
				System.out.println("--------------FRUTA--------------\n");
				System.out.print("\t        2");
				System.out.print("\n\t");
				System.out.print("1 - ");
				for (int a = 0; a < nome1.length(); a++) {
					System.out.print("[ ]");
					if (a == nome1.length() - 1) {
						System.out.print("\n");
						for (int b = 1; b < nome2.length(); b++) {
							System.out.print("\t       ");
							System.out.print("[ ]");
							System.out.print("\n");
						}
					}
				}
			}
			cont = 2;
			System.out.print("Número: ");
			numero = input.nextInt();
			if (numero == 1) {
				System.out.print("Coluna: ");
				coluna = input.nextInt();
			}
			if (numero == 2) {
				System.out.print("Linha: ");
				coluna = input.nextInt();
			}

			System.out.print("Letra: ");
			letra = input.next();

			System.out.print("\t        2");
			System.out.print("\n\t");
			System.out.print("1 - ");
			for (int a = 0; a < nome1.length(); a++) {
				if (a == coluna && numero == 1) {
					System.out.print("[" + letra + "]");
					vetor1[a] = letra;
				} else if (vetor1[a] != null) {
					System.out.print("[" + vetor1[a] + "]");
				} else {
					System.out.print("[ ]");
				}

				if (a == nome1.length() - 1) {

					System.out.print("\n");
					for (int b = 1; b < nome2.length(); b++) {
						System.out.print("\t       ");
						if (b == coluna && numero == 2) {
							System.out.print("[" + letra + "]");
							vetor2[b] = letra;
						} else if (vetor2[b] != null) {
							System.out.print("[" + vetor2[b] + "]");
						} else {
							System.out.print("[ ]");
						}
						System.out.print("\n");
					}

				}
			}
		} while (true);
	}
}
