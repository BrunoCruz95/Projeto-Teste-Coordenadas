package teste;

import java.util.Scanner;

public class Teste1 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int var = 0, cont = 0;
		do {
			int[] vetor = new int[10];
			vetor[var] = 1;
			for (int i = 0; i < 10; i++) {
				if (vetor[i] == 1) {
					System.out.print("[o]");
					cont = i;
				}
				if(vetor[i] == 0) {
					System.out.print("[_]");
				}
			}
			System.out.print("\n");
			var = sc.nextInt();
			if (var == 4) {
				if (cont == 0) {
					var = 0;
				} else {
					var = cont - 1;
				}
			} else if (var == 6) {
				if (cont == 9) {
					var = 9;
				} else {
					var = cont + 1;
				}
			} else {
				var = cont;
			}
		} while (true);
	}
}
