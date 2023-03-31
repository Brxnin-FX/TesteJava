package conteudo_array;

import java.util.Scanner;

public class Array_MultiDimensionais {

	public static void main(String[] args) {
		int quantidadeLinha0=0,quantidadeLinha1=0,quantidadeLinha2=0;
		int num1,num2,num3,num4,num5;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Insira os numeros da linha 0");
		quantidadeLinha0 = entrada.nextInt();
		System.out.println("Insira os numeros da linha 1");
		quantidadeLinha1 = entrada.nextInt();
		System.out.println("Insira os numeros da linha 2");
		quantidadeLinha2 = entrada.nextInt();
		
		int [][] array2D =  { { 1, 2 }, { 3, 4, 5} };

		/*Essa é a linha 0; o valor dentro dela
        definira os valores dentro 
		da linha 1*/
		
		array2D[ 0 ] = new int[ quantidadeLinha0 ]; 
		
		
		// e assim por diante//
		array2D[ 1 ] = new int[ quantidadeLinha1 ];
		
		
		

		
		
		System.out.printf("\n%s%15s\n","indice","Coluna1","Coluna2","Coluna3");
		for(int i = 0; i < array2D.length; i++){
			System.out.printf("%s%15s\n",i,array2D[i]);
		}
		  
		 

	}

}
