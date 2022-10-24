package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pruebas realizadas:
		 * 
		 * animales = 0, comidaComprada = 200, consumo= 200 --> mensaje de error
		 * comidaComprada = 0, animales = 10, consumo = 200 --> mensaje de error
		 * consumo = 0 (error), animales = 10, comidaComprada = 200 --> mensaje de error
		 * 
		 * comidaComprada= 200, consumo=200, animales = 10 (resultado exitoso, muestra la línea 50, cada animal tendrá una ración de 20kg)
		 * comidaComprada=200, consumo=250 (comida insuficiente, muestra la línea 55, cada animal tendrá una ración de 20 kg)
		 * 
		 */
		
		//Declaramos las variables que vamos a utilizar
		
		int animales; //En esta variable vamos a guardar el número de animales que tiene el usuario
		double comidaComprada, consumo, racion;
		//comidaComprada: en esta variable vamos a guardar la cantidad de comida comprada por el usuario en kg
		//consumo: en esta variable vamos a guardar la cantidad de comida que consumen todos los animales
		//racion: en esta variable vamos a guardar la cantidad de comida que le corresponde a cada animal
		Scanner lectura = new Scanner (System.in); 
		
		//Solicitamos al usuario que introduzca los valores correspondientes
		
		System.out.println("Introduce el número de animales"); //Solicitamos al usuario que nos indique la cantidad de animales
		animales = lectura.nextInt(); //Guardamos el valor introducido en la variable "animales"
		
		System.out.println("Introduce la cantidad de comida comprada en kg"); //Solicitamos al usuario que nos indique la cantidad de comida comprada en kg
		comidaComprada = lectura.nextDouble(); //Guardamos el valor introducido en la variable "comidaComprada"
		
		System.out.println("Introduce los kg de comida que consumen todos los animales en kg"); //Solicitamos al usuario que nos indique la cantidad de comida que consumen todos los animales
		consumo = lectura.nextDouble(); //Guardamos el valor introducido en la variable "consumo"
		
		//Realizamos las operaciones necesarias
		
		if (animales>0) { //Comprobamos que la cantidad de animales sea mayor a 0 (para evitar divisiones por cero)
			
			if (comidaComprada>0) { //Comprobamos que la cantidad de comida comprada sea mayor a 0 (para evitar divisiones por cero)
				
				if (consumo>0) { //Comprobamos que la cantidad de comida consumida por los animales sea mayor a 0 (para evitar divisiones por cero)
					
					if (comidaComprada>=consumo) {
						
						System.out.println("La cantidad de comida comprada es suficiente para abastecer la granja, a cada animal le corresponde una ración de " + (comidaComprada/animales) + " kilos");
						//Mostramos un mensaje informando de que la cantidad de comida comprada es suficiente, y indicamos la ración que le corresponde a cada animal
					} else
						
						System.out.println("La cantidad de comida comprada es insuficiente para abastecer la granja, a cada animal le corresponde una ración de " + (comidaComprada/animales) + " kilos");
						//Mostramos un mensaje informando de que la cantidad de comida comprada es insuficiente, y indicamos la ración que le corresponde a cada animal
				} else
					
					System.out.println("Error, la cantidad de comida consumida por los animales debe ser superior a 0"); //Mostramos un mensaje de error en caso de que sea igual a 0
				
			} else
				
				System.out.println("Error, la cantidad de comida comprada debe ser superior a 0"); //Mostramos un mensaje de error en caso de que sea igual a 0
			
		} else 
			
			System.out.println("Error, el número de animales debe ser superior a 0"); //Mostramos un mensaje de error en caso de que sea igual a 0
		
		
		//Cerramos el scanner
		lectura.close();
	}

}
