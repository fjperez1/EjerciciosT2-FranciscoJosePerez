package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int animales;
		double comidaComprada, comida;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca los valores correspondientes
		
		System.out.println("Introduce la cantidad de comida comprada");
		animales = lectura.nextInt();
		
		System.out.println("Introduce el número de animales");
		comidaComprada = lectura.nextDouble();
		
		System.out.println("Introduce los kilos que consume cada animal");
		comida = lectura.nextDouble();
		
		//Realizamos los cálculos necesarios
		
		if (animales <= 0) {
			
			System.out.println("No hay animales en la granja");
			
		} else {
			
			comidaComprada /= animales;
			comida /= animales;
			
		}
		
		if (comidaComprada <= comida) {
			
			System.out.println ("Se dispone de comida suficiente, cada animal tendrá una ración de " + comida + " kilos");
			
		} else {
			
			System.out.println ("No se dispone de comida suficiente");			
			
		}

	}

}
