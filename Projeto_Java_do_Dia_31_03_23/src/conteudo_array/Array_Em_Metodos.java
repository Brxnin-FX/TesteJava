package conteudo_array;
import java.util.Scanner;


public class Array_Em_Metodos {

	
	public static void multiplicadorTabuada(int[] array,int nmrTabuada) {
		for(int i=0; i < array.length; i++) {
			array[i] *=nmrTabuada;
		}
	}
	
	public static void main(String[] args) {
		final int tamanhoArray=10;
		int nmrTabuada;
		
		Scanner entrada = new Scanner(System.in);
		
		int [] array;
		
		
		
		System.out.println("Insira qual tabuada deseja fazer");
		nmrTabuada=entrada.nextInt();
		
		
		array = new int [tamanhoArray];
		
		
		for(int i = 0; i < tamanhoArray; i++) {
			System.out.printf("Informe a  posição[%d]: ",i);
			array[i] = entrada.nextInt();
			
		}
		
		multiplicadorTabuada(array,nmrTabuada);
		
		for(int i=0; i < array.length;i++) {
			System.out.println( array[i] + " ");
		}
		

	}

}
