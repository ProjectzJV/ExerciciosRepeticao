package ExercicioDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

		int i=0, mvu=0, mdc=0;
		
		Scanner in = new Scanner(System.in);
		
		while(i != -99) {
			
			System.out.println("Digite sua idade: ");
			
			i = in.nextInt();	
			if(i < mvu && i > 0) {
				mvu++;
				
			}
			
			if(i > mdc) {
				mdc++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos são: "+mvu);
		System.out.println("Total de pessoas com mais de 50 anos são: "+mdc);
	}
}
