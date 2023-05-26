package principal;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
	
	
	public static Double addNota() {
		Scanner entrada = new Scanner(System.in);
		Double nota;
		do {
			System.out.println("Insira a nota de 1 a 10: ");
			nota = entrada.nextDouble();
		}while(nota < 0 || nota >10);
		return nota;
	}
	
	public static int addIdade() {
		Scanner entrada = new Scanner(System.in);
		int idade;
		do {
			System.out.println("Insira a idade");
			idade = entrada.nextInt();
			if(idade < 0 ) {
				System.err.println("Idade negativa!!!");
			}
		}while(idade < 0);
		return idade;
	}
	
	public static void caso4(String nome,Integer idade,Double nota) {

    	boolean vf1 =false ,vf2 = false,vf3 = false;
    	if(!(nome == null)) {
    		System.out.println("Nome: " + nome);
    		 vf1 = true;
    	}
    	if(!(idade == null)) {
    		System.out.println("Idade: " + idade);
    		 vf2 = true;
    	}
    	if(!(nota == null)) {
    		System.out.println("Nota: " + nota);
    		 vf3 = true;
    	}
    	if(vf1 == false && vf2 == false && vf3 == false ) {
    		System.out.println("Nenhum dado inserido");
    	}
	}
	
	
	public static void listarOpcao() {
		System.out.println("Menu:");
        System.out.println("1  - Opção para Inserir nome ");
        System.out.println("2  - Opção para Inserir Idade");
        System.out.println("3  - Opção para Inserir Nota ");
        System.out.println("4  - Opção para exbir dados  ");
        System.out.println("5  - Opção para Inserir Sair ");
       
        System.out.print("Escolha uma opção: ");
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		boolean manterLoop = true;
		boolean opcao1=false,opcao2=false,opcao3=false;
		
		String nome=null;
		Double nota=null;
		Integer idade=null;
		
		
		int opcao=0;
		do {
		try {
			
				listarOpcao();
				opcao = entrada.nextInt();
				switch(opcao) {
				case 1:
			     try {
					 boolean manterLoopRegex = true;
					
	                Pattern pattern = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);
	                do {
	                System.out.println("Insira o nome: ");
	                nome=entrada.next();
	                Matcher matcher = pattern.matcher(nome);	
	                boolean matchFound = matcher.find();
	                
	                if(matchFound) {
	                	System.err.println("Insira apenas Letras...");
	                	
	                }
	                else {
	                	manterLoopRegex=false;
	                	
	                	
	                	
	                }
	                
	                
	                }while(manterLoopRegex);
			     }catch(InputMismatchException e) {
			    	 
			     }
	                
					
	                break;
	               
	            case 2:
	                  manterLoop = true;
	            	do {
	            	    try {
	            	        System.out.println("Insira uma idade: ");
	            	        idade = addIdade();
	            	        manterLoop = false;
	            	    } catch (InputMismatchException e) {
	            	        System.err.println("Exception encontrada!: " + e);
	            	        System.out.println("Insira um número, não uma letra...");
	            	        entrada.next();
	            	    }
	            	} while (manterLoop);
	            	opcao2 = true;
	            	break;
	               
	            case 3:
	            	manterLoop = true;
	            	do {
	            		try {
	                        
	                        nota = addNota();	
	                        
	                        
	                        manterLoop = false;
	                    	}
	                    	catch(InputMismatchException e) {
	                    		System.err.println("Exception encontrada!: " + e);
	                        	System.out.println("Insira um numero, não uma letra...");
	                        	entrada.next();
	                    	}
	            	}while(manterLoop);
	            	
	            	opcao3 = true;
	                break;
				
	                
	                
	            case 4: 
	            caso4(nome,idade,nota);
	            	break;
				case 5:
					System.out.println("\n\n\nAté mais...");
					break;
				}
				
			
		}catch(NullPointerException e) {
			System.err.println("Exception encontrada! " + e );
			System.out.println("Insira todos os dados");
			entrada.next();
		}
		catch(InputMismatchException e){
			System.out.println("Exception encontrada " + e);
			System.out.println("Insira apenas numeros do menu");
			entrada.next();
			
		}
		
		}while(opcao != 5);
		
 	}

}
