package entidades;

public class Aluno extends Pessoa{

	String curso;
	public Aluno(String nome, int idade,String curso) {
		super(nome, idade);
		this.curso=curso;
	}
	
	
	@Override
	public void MostrarDados() {
		System.out.printf("Nome: "+ nome);
		System.out.printf(" | Idade: " + idade);
		System.out.printf(" | Curso: "+ curso);
	}
	
	
	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	
	

}
