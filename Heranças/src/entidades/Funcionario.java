package entidades;

public class Funcionario {

	protected String nome;
	protected int RG;
	protected float salario;
	
	
	//Construtor//
	
	public Funcionario (String nome,int RG,float salario) {
		this.nome=nome;
		this.RG=RG;
		this.salario=salario;
	}
	
	//Metodo//
	
	public float CalcSalario(float salario) {
		float holerite=0;
		
		holerite=salario+holerite;
		
		return holerite;
	}
	
	
	
	//Getters and Setters//
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getRG() {
		return RG;
	}
	public void setRG(int rG) {
		RG = rG;
	}
	
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float CalcSalario(float salario, float comissao) {
		
		return 0;
	}

	
	
	
	
	
	
	
	
}
