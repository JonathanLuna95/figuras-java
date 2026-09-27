package com.krakedev.test;

import com.krakedev.figuras.*;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graficador graficador = new Graficador();
		

		Cuadrado cuadrado = new Cuadrado("Cuadrado", "Amarillo", 20);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "Rojo", 20, 10);
		TrianguloRectangulo triangulo = new TrianguloRectangulo("Triangulo Rectangulo", "Azul", 3, 4);
		Hexagono hexagono = new Hexagono("Hexagono", "Verde", 10);
		
		
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
		graficador.graficar(triangulo);
		graficador.graficar(hexagono);

	}

}
