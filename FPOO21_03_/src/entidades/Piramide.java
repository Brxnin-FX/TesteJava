package entidades;

public class Piramide {

	private double lado;
	private double altura;
	
	
	//Construtor//
	
	public Piramide(int lado) {
		this.lado = lado;
	}
	
	public double CalcAreaPiramide(double lado, double altura) {
		double area,base;
		base=lado*lado;
		
		area=(lado*lado)+(4*((base*altura)/2));
		
		
		return area;
	}
	public double CalcVolPiramide(double lado, double altura) {
		double volume,base;
		base=lado*lado;
		
		volume=((base*altura)/3);
		
		return volume;
	}
	
	      //Getters and Setters//
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
}
