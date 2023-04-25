package entidades;

public class Se_Aprovado {
float nota1,nota2;
	
	//Construtor
	public Se_Aprovado (float nota1, float nota2) {
		this.nota1=nota1;
		this.nota2=nota2;
	}
	

	//Metodo
	public void Calc_Aprovacao(float nota1, float nota2) {
	
		float media;
		media=(nota1+nota2)/2;
		
		if(media > 5) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
		
	}
	
	
	//Getters and Setters

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

}
