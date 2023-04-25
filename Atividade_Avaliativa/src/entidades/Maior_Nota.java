package entidades;

public class Maior_Nota {
	

	float nota1,nota2;
	
	//Construtor
	public Maior_Nota(float nota1, float nota2) {
		this.nota1=nota1;
		this.nota2=nota2;
	}
	

	//Metodo
	
	public float Verificar_Maior(float nota1, float nota2) {
		float maior;
		
		if(nota1 > nota2 ) {
			maior=nota1;
		}
		else {
			maior=nota2;
		}
		
		
		return maior;
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
