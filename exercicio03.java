package ExercicioDeRepeticao;

import java.util.Scanner;

public class exercicio03 {

	public  static  void  main (String [] args){
        Scanner  ent = new  Scanner (System.in);
        int  num , Par = 0 , Impar = 0 ;
        
        for (int  i = 1 ; i <= 5 ; i ++){
        	System.out.println("Digite o " + i + "� n�mero");
            num = ent.nextInt ();
            
            if ( num % 2 == 0 ){
                Par++;
            }  else {
                	Impar++;
            }
        System.out.println("Foram digitados " + Par + " n�meros pares \n" + "Foram digitados " + Impar + "n�meros impares \n");     
    } 
        
        }
  }
