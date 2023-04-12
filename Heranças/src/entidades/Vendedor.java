package entidades;

public class Vendedor extends Funcionario{
	float comissao;
	
	
	//Construtor//
	public Vendedor(String nome, int RG, float salario,float comissao) {
		super(nome, RG, salario);
		
	}
	
	//Metodo//
	
	@Override

	public float CalcSalario(float salario,float comissao) {
		float holerite=0;
		
		holerite=salario+comissao;
		
		return holerite;
	}
	
	//Getters and Setters//
	public float getComissao() {
		return comissao;
	}


	public void setComissao(float comissao) {
		this.comissao = comissao;
	}


	

	
}
