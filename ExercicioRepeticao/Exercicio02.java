package ExercicioDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

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
		System.out.println("Total de pessoas com menos de 21 anos s�o: "+mvu);
		System.out.println("Total de pessoas com mais de 50 anos s�o: "+mdc);
	}
}
