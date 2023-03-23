package principal;

import java.util.Scanner;

import entidades.Cilindro;
import entidades.Cone;
import entidades.Esfera;
import entidades.Piramide;
import entidades.Quadrado;


public class Principal {

	public static void main(String[] args) {
		int caso,lado,areaQuadrado,perimetro;
		double areaCilindro,altura,volCilindro,raio,area,volume,
		areaCone,volCone,areaPiramide,volPiramide;
		
		
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("O que deseja fazer: ");
		System.out.println("1 - Calcular area e volume da Esfera");
		System.out.println("2 - Calcular area e perimetro do Quadrado");
		System.out.println("3 - Calcular area e volume do cilindro");
		System.out.println("4 - Calcular area e volume do Cone");
		System.out.println("5 - Calcular area e volume da Piramide Quadrangular");
		caso=entrada.nextInt();
		switch(caso) {
		
		
		
		//esfera//
		case 1:
		
		System.out.println("Informe o valor do raio em centimetros: ");
		raio = entrada.nextDouble();
		Esfera esfera = new Esfera(raio);

		volume=esfera.calcularVolume(raio);
		area=esfera.calcularArea(raio);
		
		System.out.printf("A area da esfera eh: %.2f", area );
		System.out.printf("cm²");
		System.out.println();
		System.out.printf("O volume da esfera eh: %.2f", volume);
		System.out.printf("cm³");
		
		break;
		
		case 2:
			//quadrado//
		
		System.out.println("Informe o valor do lado");
		lado = entrada.nextInt();
	    
		Quadrado quadrado = new Quadrado (lado);
		
		
		
		areaQuadrado=quadrado.calcularAreaQuadrado(lado);
	    perimetro=quadrado.calcularPerimetro(lado);
		
	    
	   System.out.println("A area do quadrado eh: "); 
	   System.out.println(areaQuadrado);
	   System.out.println("O perimetro do quadrado eh: ");
	   System.out.println(perimetro);
	   
	   
	   break;
	   
		case 3:
			
			System.out.println("Informe o valor do raio em centimetros: ");
			raio = entrada.nextDouble();
			System.out.println("Informe o valor da altura");
			altura=entrada.nextDouble();
			Cilindro cilindro = new Cilindro(raio);
			
			areaCilindro=cilindro.calcAreaCilindro(raio,altura);
			
			volCilindro=cilindro.calcVolumeCilindro(raio, altura);
			
			
			   System.out.printf("A area da esfera eh: %.2f", areaCilindro );
				System.out.printf("cm²");
				System.out.println();
				System.out.printf("O volume da esfera eh: %.2f", volCilindro);
				System.out.printf("cm³");
			
		break;
		case 4:
			System.out.println("Informe o valor do raio em centimetros: ");
			raio = entrada.nextDouble();
			System.out.println("Informe o valor da altura");
			altura=entrada.nextDouble();
			Cone cone=new Cone(raio);
			
			areaCone=cone.CalcAreaCone(raio, altura);
			volCone=cone.CalcVolCone(raio, altura);
			
			
			System.out.printf("A area do Cone eh: %.2f", areaCone );
			System.out.printf("cm²");
			System.out.println();
			System.out.printf("O volume do Cone eh: %.2f", volCone);
			System.out.printf("cm³");

			break;
			
		case 5:
			System.out.println("Informe o valor do lado");
			lado = entrada.nextInt();
			System.out.println("Informe o valor da altura");
			altura=entrada.nextDouble();
			Piramide piramide=new Piramide(lado);
			
			areaPiramide=piramide.CalcAreaPiramide(lado, altura);
			volPiramide=piramide.CalcVolPiramide(lado, altura);
			
			System.out.printf("A area do Cone eh: %.2f", areaPiramide );
			System.out.printf("cm²");
			System.out.println();
			System.out.printf("O volume do Cone eh: %.2f", volPiramide);
			System.out.printf("cm³");
				
		entrada.close();
		
		}

	}
	

}
