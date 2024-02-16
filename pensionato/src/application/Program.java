package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Pensionato;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pensionato[] vet = new Pensionato[10];
		
		
		System.out.println("Quantidade de alunos que desejam alugar quartos?");
		int n = sc.nextInt();
		sc.nextLine(); 
		
		for(int i=0; i<n ; i++) {
			System.out.println("Aluguel #:" + (i + 1) );
			System.out.print("Nome:");
			String aluno = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Quarto:");
			int quarto = sc.nextInt();
			sc.nextLine();
			
			Pensionato pensionato = new Pensionato(aluno, email, quarto );
			vet[i] = pensionato;
			
			
		}
		 System.out.println("\nAlunos no pensionato:");
	        for (int i = 0; i < n; i++) {
	            if (vet[i] != null) {
	                System.out.println("Aluguel #" + (i + 1) + ": " + vet[i]);
	            }
	        }
		
		
		sc.close();

	}

}
