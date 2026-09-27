package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {
	
	private double catetoA;
	private double catetoB;
	private double hipotenusa;
	
	public TrianguloRectangulo(String nombre, String color, double catetoA, double catetoB) {
	    super(nombre, color);
	    this.catetoA = catetoA;
	    this.catetoB = catetoB;
	    this.hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
	}
	
	@Override
	public int calcularPerimetro() {
	    return (int) (catetoA + catetoB + hipotenusa);
	}
	
	@Override
	public double calcularArea() {
	    return (catetoA * catetoB) / 2;
	}

}
