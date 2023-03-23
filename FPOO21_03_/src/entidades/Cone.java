package entidades;

public class Cone {

	private double raio;
	private double altura;
	


	public Cone(double raio2) {
		// TODO Auto-generated constructor stub
	}

	public double CalcAreaCone(double raio, double altura) {
		double area;
		
		area=(Math.PI*(raio*raio))+(Math.PI*(raio*altura));
		
		return area;
	}
	
	 public double CalcVolCone(double raio, double altura) {
		double volume;
		 
		volume=((Math.PI*(altura*(raio*raio)))/3);
		 
		 return volume;
	}
	
	
	//Getters and Setters//
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
