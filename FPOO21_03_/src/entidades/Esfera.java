package entidades;

public class Esfera {
	private double raio;
	
	//Construtor//
	
	
	public Esfera(double raio) {
		this.raio = raio;
	}
	
	public double calcularVolume(double raio) {
		double volume;
		
		volume = (4*Math.PI*(raio*raio*raio))/3;
		return volume;
	}
	
	public double calcularArea(double raio) {
		double area;
		
		area = (4*Math.PI*(raio*raio));
		return area;
	}

	//Getters and Setters
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}

	
	
	
	