package atividades_II;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
			int[] array;
			int temp1,temp2,temp3,tempMaior = 0,tempMenor;
		    final int tamanhoArray=1;
			Scanner entrada = new Scanner(System.in);
				
		      
		    System.out.println("insira as temperaturas");
			array = new int[tamanhoArray];
		
			
				System.out.println("Informe a temp de Manha");
				temp1=entrada.nextInt();
				System.out.println("Informe a temp de Tarde");
				temp2=entrada.nextInt();
				System.out.println("Informe a temp de Noite");
				temp3=entrada.nextInt();
				
				for(int i = 1; i < tamanhoArray; i++) {
					System.out.printf("Informe a  posição[%d]: ",i);
				}
				
				if(temp1>temp2 && temp1>temp3) {
					tempMaior = temp1;
				}
				if(temp2>temp1 && temp2>temp3) {
					tempMaior = temp2;
				}
				if(temp3>temp1 && temp3>temp2) {
					tempMaior = temp3;
				}
				
			

			
			for(int i = 1; i < tamanhoArray; i++){
				System.out.printf("%s%15s\n",i,array[i]);
			}
			System.out.printf("\n A maior temperatura eh:");
			System.out.println(tempMaior);
			entrada.close();

	}

}
