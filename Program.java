package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int e = sc.nextInt();
		sc.nextLine();
		int i = 0;
		String[] nome = new String[e];
		String[] aprovado = new String[e];
		double[] nota1 = new double[e];
		double[] nota2 = new double[e];
		
		
		for(i=0; i<e; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"ª aluno:");
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			
			sc.nextLine();
			
			
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(i=0; i<e; i++) {
			if((nota1[i]+nota2[i])/2>=6) {
				aprovado[i] = nome[i];
				System.out.println(aprovado[i] );
			}
		}
		
		
		sc.close();
	}

}
