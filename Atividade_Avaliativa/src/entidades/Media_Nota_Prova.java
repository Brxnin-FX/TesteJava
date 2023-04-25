package entidades;

public class Media_Nota_Prova {

	float nota1,nota2;
	
	//Construtor
	public Media_Nota_Prova(float nota1, float nota2) {
		this.nota1=nota1;
		this.nota2=nota2;
	}
	

	//Metodo
	public float Calc_Media(float nota1, float nota2) {
		float media;
		
		media=(nota1+nota2)/2;
		
		return media;
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
