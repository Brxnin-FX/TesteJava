package principal;

public class Contato {

	private String nome;
	private String email;
	private int telefone;
	
	
	public Contato(String nome,int telefone,String email) {
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
	}
	
	public void exibirContato() {
		System.out.println("Nome do contato: "+ nome);
		System.out.println("Telefone do contato: "+telefone);
		System.out.println("Email do contato: " + email);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
