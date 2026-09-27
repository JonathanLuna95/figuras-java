package com.krakedev.test;

import com.krakedev.figuras.*;

public class TestGestorFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GestorFiguras gestor = new GestorFiguras();
		
		gestor.agregarFigura(new Cuadrado("Cuadrado1","azil",4));
		gestor.agregarFigura(new TrianguloRectangulo("Triangulo1","rojo",4,3));
		gestor.agregarFigura(new Rectangulo("Rect1","amarillo",4,3));
		
		Figura encontrada = gestor.buscarFigura("Triangulo1");
		
		if (encontrada != null) {
			System.out.println("Figura encontrada: " + encontrada);
		} else {
			System.out.println("No se encontro la figura");
		}
		
		System.out.println("Listar Figuras");
		gestor.listarFiguras();
		
		System.out.println("Area total; " + gestor.calcularAreaTotal());

	}

}
