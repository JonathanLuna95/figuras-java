package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 20);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "naranja", 20, 10);
		
		System.out.println("El perimetro de " + cuadrado.getNombre() + " es igual a " + cuadrado.calcularPerimetro());
		System.out.println("El perimetro de " + rectangulo.getNombre() + " es igual a " + rectangulo.calcularPerimetro());
		

	}

}
