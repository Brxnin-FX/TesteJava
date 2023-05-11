package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Pessoa> lista = new ArrayList<>();
		
		Pessoa pessoa1 = new Pessoa("Jose",10);
		Pessoa pessoa2 = new Pessoa("Pedro",23);
		Pessoa pessoa3 = new Pessoa("Carlos",19);
		Pessoa pessoa4 = new Pessoa("Paulo",42);
		
		
		
		
		lista.add(pessoa1);
		lista.add(pessoa2);
		lista.add(pessoa3);
		lista.add(pessoa4);
		
		Collections.sort(lista, new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa pessoa1, Pessoa pessoa2) {
				
				return pessoa1.getNome().compareTo(pessoa2.getNome());
			}
		});
		
		
		lista.forEach(p -> System.out.println(p.getNome()));
		
		System.out.println();
		
		Collections.sort(lista, Comparator.comparing(Pessoa::getIdade));
	    
	    lista.forEach(p -> System.out.println(p.getNome() + " - " + p.getIdade()));
		
		
	
	}

}
