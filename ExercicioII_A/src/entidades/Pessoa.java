package entidades;

public class Pessoa {

	protected String nome;
	protected int idade;
	
	
	//Construtor//
	public Pessoa(String nome,int idade) {
		this.nome=nome;
		this.idade=idade;
	}
	
	//Metodos//
	
	public void MostrarDados() {
		System.out.printf("Nome: "+ nome);
		System.out.printf(" | Idade: " + idade);
	}
	
	
	//Getters and Setters//
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
