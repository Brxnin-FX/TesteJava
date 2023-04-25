package principal;

import java.util.Scanner;

import entidades.Maior_Nota;
import entidades.Media_Nota_Prova;
import entidades.Media_Nota_Trab;
import entidades.Menor_Nota;
import entidades.Se_Aprovado;

public class Principal {

	public static void main(String[] args) {
		float nota1,nota2,nota_maior,nota_menor,media_prov,media_trab;
		int escolha;
		
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Informe a nota1");
			System.err.println("Ela deve ser de 0 a 10");
			nota1=entrada.nextFloat();
			
			
		}while(nota1 >10 || nota1 < 0);
		do {
			System.out.println("\n\nInforme a nota2");
			System.err.println("Ela deve ser de 0 a 10");
			nota2=entrada.nextFloat();
			
			
		}while(nota2 >10 || nota2 < 0);
		
		
		
		
		
		
		do {
			System.out.println("O que deseja fazer ");
			escolha=entrada.nextInt();
			
			switch (escolha) {
			case 1:
				Maior_Nota maior = new Maior_Nota(nota1,nota2);
				nota_maior=maior.Verificar_Maior(nota1, nota2);
				System.out.println("A maior nota eh: " + nota_maior);
				break;
				
			case 2:
				Menor_Nota menor = new Menor_Nota(nota1,nota2);
				nota_menor=menor.Verificar_Menor(nota1, nota2);
				System.out.println("A menor nota eh: " + nota_menor);
				break;
				
			case 3:
				Media_Nota_Prova media_prova = new Media_Nota_Prova(nota1,nota2);
				media_prov = media_prova.Calc_Media(nota1, nota2);
				System.out.println("A media das provas do aluno eh: " + media_prov);
				break;
				
			case 4:
				Media_Nota_Trab media_trabalho = new Media_Nota_Trab(nota1,nota2);
				media_trab = media_trabalho.Calc_Media(nota1, nota2);
				System.out.println("A media dos trabalhos do aluno eh: " + media_trab);
				break;
				
			case 5:
				Se_Aprovado verificar = new Se_Aprovado(nota1,nota2);
				verificar.Calc_Aprovacao(nota1, nota2);

			}
				
				
			
		}while(escolha != 6);
		
		System.out.println("Programa finalizado...");
		

	}

}
