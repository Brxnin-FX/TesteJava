package entidades;

public class Administrativos extends Funcionario{

	
	public float hora_extra;
	
	

	public Administrativos(String nome, int RG, float salario,float hora_extra) {
		super(nome, RG, salario);
		
	}
	
	//Metodo
	
	@Override
	public float CalcSalario(float salario,float hora_extra) {
		float holerite=0;
		
		holerite=salario+hora_extra;
		
		return holerite;
	}
	
	//Getters and Setters//

	public float getHora_extra() {
		return hora_extra;
	}

	public void setHora_extra(float hora_extra) {
		this.hora_extra = hora_extra;
	}
	
}
