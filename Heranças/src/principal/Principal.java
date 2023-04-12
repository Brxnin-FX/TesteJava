package principal;

import java.util.Scanner;

import entidades.Vendedor;
import entidades.Administrativos;

public class Principal {

	public static void main(String[] args) {
		
		 String nome;
		 int RG,escolha;
		 float salario;
		 float hora_extra=0;
		 float comissao=0;
		 
		 
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Insira o nome do Funcionario");
		 nome=entrada.next();
		 System.out.println("Insira o RG do funcionario");
		 RG=entrada.nextInt();
		 System.out.println("Insira o salario do funcionario");
		 salario=entrada.nextFloat();
		
		
		Vendedor vendedor = new Vendedor(nome,RG,salario,comissao);
		Administrativos adm = new Administrativos(nome,RG,salario,hora_extra);
		
		System.out.println("O funcionario eh Administrativo ou Vendedor?"
				+"\n Vendedor --> 1"
				+"\n Administrativo --> 2");
		escolha=entrada.nextInt();
		if (escolha==1) {
			
			System.out.println("Insira a comissao do Funcionario");
			
			
			comissao=entrada.nextFloat();
			salario=vendedor.CalcSalario(salario, comissao);
			
			System.out.println("Nome: "+ nome + " | RG: " + RG + " | salario: " + salario  );
			
		}
		if (escolha == 2) {
			System.out.println("Insira a quantidade de horas extras do Funcionario");
			
			hora_extra=entrada.nextFloat();
			
			salario=adm.CalcSalario(salario, hora_extra);
			System.out.println("Nome: "+ nome + " | RG: " + RG + " | salario: " + salario  );
		}
		
		entrada.close();

	}

}
