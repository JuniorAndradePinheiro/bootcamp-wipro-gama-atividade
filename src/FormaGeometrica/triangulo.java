package FormaGeometrica;

import FgInterface.FormaGeometrica;

public class triangulo implements FormaGeometrica{
	
	private String cor;
	double area;
	double base = 10;
	double altura = 3;
	
	public triangulo() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double d) {
		this.area = d;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public String cor() {
		this.setCor("Vermelho");
		return this.getCor();
	}
	@Override
	public String quantidadeDeLados() {
		return "3 Lados";
	}
	@Override
	public double area(double a, double b) {
		a = this.getBase();
		b = this.getAltura();
		
		this.setArea((a * b) / 2);
		return this.getArea();
	}
	
	
	
	
}
