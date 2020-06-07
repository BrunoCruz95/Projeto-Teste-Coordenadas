package jogo_forca;

import java.util.Scanner;

public class JogoDaForca {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		String nome;
		String dica;
		char res;
		int jogadas = 0;
		int partida = 1;
		
		Menu();

		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Dica: ");
		dica = sc.next();
		
		for(int cont = 0; cont < 200; cont++) {
			System.out.println("");
		}
		
		char[] vetor = new char[nome.length()];
		
		do {
			int contVitoria = 1;
			System.out.print("\n========== Jogada "+partida+" ==========\n");
			int cont = nome.length();
			
			System.out.println("\n---- A Dica é " + dica+" "+nome.length()+" Letras ----");

			System.out.print("\nLetra: ");
			res = sc.next().charAt(0);
			System.out.print("\n");
			for (int i = 0; i < nome.length(); i++) {
				if (res == nome.charAt(i)) {
					System.out.print(" "+nome.charAt(i)+" ");
					vetor[i] = nome.charAt(i);
					cont--;
				}else if(vetor[i] == nome.charAt(i)){
					System.out.print(" "+nome.charAt(i)+" ");
				}else {
					System.out.print(" _ ");
				}
			}
			System.out.print("\n");
			if(cont == nome.length()) {
				jogadas++;
				if(jogadas == 1) {
					System.out.println(" ------");
					System.out.println("|     o");
					System.out.println("|      ");
					System.out.println("|      ");
					System.out.println("\n---------- Resta 5 vida ----------");
				}
				if(jogadas == 2) {
					System.out.println(" ------");
					System.out.println("|     o");
					System.out.println("|     |");
					System.out.println("|      ");
					System.out.println("\n---------- Resta 4 vida ----------");
				}
				if(jogadas == 3) {
					System.out.println(" ------");
					System.out.println("|     o");
					System.out.println("|    /|");
					System.out.println("|      ");
					System.out.println("\n---------- Resta 3 vida ----------");
				}
				if(jogadas == 4) {
					System.out.println(" ------");
					System.out.println("|     o");
					System.out.println("|    /|/");
					System.out.println("|      ");
					System.out.println("\n---------- Resta 2 vida ----------");
				}
				if(jogadas == 5) {
					System.out.println(" ------");
					System.out.println("|     o");
					System.out.println("|    /|/");
					System.out.println("|    /");
					System.out.println("\n---------- Resta 1 vida ----------");
				}
				if(jogadas == 6) {
					System.out.println(" ------");
					System.out.println("|     o");
					System.out.println("|    /|/");
					System.out.println("|    //");
					System.out.println("\n---------- Você Perdeu ----------");
				}
			}
			/*
			 *  MOMENTO VITÓRIA
			 */
			for(int i = 0; i < nome.length(); i++) {
				if(vetor[i] == nome.charAt(i)) {
					contVitoria++;
				}
			}
			if(contVitoria > nome.length()) {
				System.out.println("\n---------- Parabéns Você Acertou ----------");
				jogadas = 6;
			}
			partida++;
		} while (jogadas < 6 );
	}
	
	/*
	 * MÉTODO MENU
	 */
	private static void Menu() {
		System.out.println("===========================");
		System.out.println("\n       Jogo da Forca\n");
		System.out.println("========= Regras ==========");
		System.out.println("\n1. Você tem 6 vidas");
		System.out.println("2. Apenas 1 letra por vez");
		System.out.println("3. Maiúsculo é diferente de minúsculo\n");
	}
}
