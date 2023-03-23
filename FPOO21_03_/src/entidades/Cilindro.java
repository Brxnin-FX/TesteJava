package entidades;

public class Cilindro {

	private double raio;
	
	
	    //construtor//
	
	public Cilindro(double raio) {
		this.raio = raio;
	}
	
	
	public double calcAreaCilindro(double raio,double altura) {
		
		double area;
		area = (2*(Math.PI*(raio*altura))); 
		
		return area;
	}
	public double calcVolumeCilindro(double raio,double altura) {
		
		double volume;
		
		volume = (Math.PI*(altura*(raio*raio)));
		
		return volume;
	}
	
	
}
