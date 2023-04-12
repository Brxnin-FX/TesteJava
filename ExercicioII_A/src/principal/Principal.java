package principal;

import java.util.Scanner;

import entidades.Aluno;
import entidades.Pessoa;

public class Principal {

	public static void main(String[] args) {
		String nome="",curso="";
		int idade=0,escolha=0;
		
		
		
		Scanner entrada = new Scanner(System.in);

		
		System.out.println("1 para Pessoa e 2 para aluno");
		escolha=entrada.nextInt();
		if (escolha == 1) {

			System.out.println("Informe o nome da Pessoa");
			nome=entrada.next();
			System.out.println("Informe a idade da pessoa");
			idade=entrada.nextInt();
			Pessoa pessoa = new Pessoa(nome,idade);
			pessoa.MostrarDados();
		}
		
		
		if(escolha == 2) {
			
			System.out.println("Informe o nome da Pessoa");
			nome=entrada.next();
			System.out.println("Informe a idade da pessoa");
			idade=entrada.nextInt();
			System.out.println("Informe o curso do Aluno");
			curso=entrada.next();
			Aluno aluno = new Aluno(nome,idade,curso);
			aluno.MostrarDados();
		}
		else {
			System.out.println("Informaçao invalida");
		}
		entrada.close();
		

	}

}
