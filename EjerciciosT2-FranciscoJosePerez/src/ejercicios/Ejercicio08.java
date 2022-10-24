package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pruebas realizadas: 
		 * distancia = 200, estancia = 6 --> El precio de tu billete es de 500.0 euros (correcto)
		 * distancia = 200, estancia = 8 --> El precio de tu billete es de 500.0 euros (correcto)
		 * distancia = 801, estancia = 6 --> El precio de tu billete es de 2002.5 euros (correcto)
		 * distancia = 801, estancia = 8 --> El precio de tu billete es de 1401.75 euros (correcto)
		 * distancia = -20, estancia = -15 --> ERROR, no puedes introducir valores negativos
		 * 
		 */
		
		//Declaramos las variables que vamos a utilizar
		
		double precio; //En esta variable vamos a guardar el precio del billete
		int distancia, estancia;
		/*
		 * distancia: en esta variable vamos a guardar la distancia a recorrer en km
		 * estancia: en esta variable vamos a guardar el número de días de estancia
		 * 
		 */
		final double precioKilometro = 2.5; //Guardamos el precio por kilómetro en una constante puesto que no va a variar en ningún momento
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario la información pertinente
		
		System.out.println("Introduce la distancia a recorrer (en km) para conocer el precio de tu billete");
		distancia = lectura.nextInt(); //Guardamos el valor introducido en la variable "distancia"
		
		System.out.println("Introduce el número de días de estancia para conocer el precio de tu billete");
		estancia = lectura.nextInt(); //Guardamos el valor introducido en la variable "estancia"
		
		//Realizamos los cálculos necesarios para conocer el precio del billete
		
		precio = (distancia * precioKilometro); //Para calcular el precio multiplicamos la distancia a recorrer por la constante "precioKilometro"
		
		if (estancia>0 && distancia > 0) { //Especificamos que la estancia y la distancia no pueden ser valores negativos
			
			if (estancia > 7 && distancia > 800) { //Si la estancia es superior a 7 dias, y los kilómetros recorridos son superiores a 800, entonces aplicamos el descuento
				
				precio*=0.70; //Multiplicamos el precio por 0.70 para aplicar el descuento del 30%
				
			}
			
			System.out.println("El precio de tu billete es de " + precio + " euros"); //Mostramos el precio calculado anteriormente al usuario
			
		} else
			
			System.out.println("ERROR, no puedes introducir valores negativos"); //Mostramos un mensaje en consola en caso de que los valores introducidos sean incorrectos
		
		//Cerramos el scanner
		
		lectura.close();

	}

}
