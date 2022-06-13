package ExercicioDeRepeticao;

import java.util.Scanner;

public class ExercicioVetores2 {

	/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	*/
	
	public static void main(String[] args) {
		
		float[] vetor;
		float maior;
		
		while(true) {
			vetor = new float[5];
			maior = 0;
			
			for(int i = 0; i < vetor.length; i++) {
				System.out.println("Digite o " + (i + 1) + "º valor: ");
				vetor[i] = new Scanner(System.in).nextFloat();
				
				if (vetor[i] > maior) {
					maior = vetor[i];
				}
		}

		System.out.println("O maior valor é: " + maior);
		System.out.println("");
	}
}
}

