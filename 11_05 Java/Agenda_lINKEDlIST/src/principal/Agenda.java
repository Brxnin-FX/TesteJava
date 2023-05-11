package principal;

import java.util.LinkedList;

public class Agenda {
	LinkedList<Contato> Agenda;
	
	public Agenda() {
		Agenda = new LinkedList<>();
	}
	
	public void adicionarContato(Contato contato) {
		Agenda.add(contato);
	}
	
	public void removerContato(Contato contato) {
		Agenda.remove(contato);
	}
	
	public void listarContatos(Contato contato) {
		
		for(Contato contato1 : Agenda) {
			contato1.exibirContato();
			System.out.println("");
		}
	}
		
		
		
	public void buscarContatos(Contato contato) {
		
		if(Agenda.contains(contato)) {
			System.out.println("Esse contato já existe");
		}
		else {
			System.out.println("Esse contato nao existe");
		}
	}

}
