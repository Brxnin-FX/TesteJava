package entidades;

import java.util.Scanner;

import principal.Agenda;
import principal.Contato;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		Contato contato1 = new Contato("Bruno",1699808313,"Bruno@gmail.com");
		Contato contato2 = new Contato("Paulo",1699738358,"Paulo@gmail.com");
		Contato contato3 = new Contato("Felipe",1699329371,"Felipe@gmail.com");
		Contato contato4 = new Contato("Gabriel",169972619,"Gabriel@gmail.com");
		Contato contato5 = new Contato("Natan",1699816381,"Natan@gmail.com");
		
		Agenda agenda = new Agenda();
		
		
		agenda.adicionarContato(contato1);
		agenda.adicionarContato(contato2);
		agenda.adicionarContato(contato3);
		agenda.adicionarContato(contato4);
		agenda.adicionarContato(contato5);
		
		
		agenda.buscarContatos(contato1);
		agenda.buscarContatos(contato4);

		System.out.println("");
		
		agenda.listarContatos(contato1);
		
		
		
		
		for(int i=0; i<10;i++) {
			System.out.println("");
		}
		
		agenda.removerContato(contato4);
		
		System.out.println("Lista de contatos apos a remoção: ");
		agenda.listarContatos(contato1);
		
		
		

	}

}
