package principal;
import java.util.Scanner;
import java.util.regex.*;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
	
		Pattern pattern = Pattern.compile("[0-9]");
        
        System.out.println("Insira o nome: ");
        nome=entrada.next();
        
        Matcher matcher = pattern.matcher(nome);	
        boolean matchFound = matcher.find();
        if(matchFound) {
        	System.err.println("Insira apenas Letras...");
        

	}
	}

}
