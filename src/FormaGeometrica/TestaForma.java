package FormaGeometrica;

import FgInterface.FormaGeometrica;

public class TestaForma {

	public static void main(String[] args) {

		FormaGeometrica interfaceCirculo = new Circulo();
		Circulo circulo = new Circulo();
		circulo.setRaio(18);
		System.out.println("CIRCULO");
		System.out.println("Raia: " + circulo.getRaio());
		System.out.println("Cor " + interfaceCirculo.cor());
		
		System.out.println("Area do Circulo: " + interfaceCirculo.area(circulo.getRaio(), circulo.getPi()) + "\n");

		
		
		
		System.out.println("QUADRADO");
		FormaGeometrica interfaceQuadrado = new Quadrado();
		System.out.println("Cor: " + interfaceQuadrado.cor());
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(4);
		
		System.out.println("Lado " + quadrado.getLado());
		System.out.println("Cor: " + interfaceQuadrado.cor());
		System.out.println("Area Quadrado " + interfaceQuadrado.area(quadrado.getLado(), quadrado.getLado()) + "\n");
		
		
		
		System.out.println("RETANGULO");
		FormaGeometrica interfaceRetangulo = new Retangulo();
		System.out.println("Cor " + interfaceRetangulo.cor());
		Retangulo retangulo  = new Retangulo();
		retangulo.setAltura(5);
		retangulo.setBase(10);
		
		System.out.println("Lado " + quadrado.getLado());
		System.out.println("Cor: " + interfaceRetangulo.cor());
		System.out.println("Area Retangulo " + interfaceRetangulo.area(retangulo.getBase(), retangulo.getAltura()));
		
	}

}
