package entidades;

public class Quadrado {
	private int lado;

	//Construtor
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	public int calcularAreaQuadrado(int lado) {
		return lado*lado;
	}
	
	public int calcularPerimetro(int lado) {
		return (4*lado);
	}
	
	//Getter and Setters
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
}