package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int num, cap = 0, duno, ddos, dtres, dcuatro;
		/*
		 * num: en esta variable vamos a guardar el número que introduzca el usuario
		 * cap: en esta variable vamos a guardar si el número introducido es capicúa (valor 1) o si no lo es (valor 0); le asignamos por defecto el valor 0
		 * duno: en esta variable vamos a guardar las unidades
		 * ddos: en esta varible vamos a guardar las decenas
		 * dtres: en esta variable vamos a guardar las centenas
		 * dcuatro: en esta variable vamos a guardar los millares
		 * 
		 */
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca el número comprendido entre el 1 y el 9999
		
		System.out.println("Introduce un número comprendido entre el 1 y el 9999 para saber si es capicúa");
		num = lectura.nextInt(); //Guardamos el valor introducido en la variable "num"
		
		//Realizamos los cálculos necesarios
		
		duno = num % 10; //Calculamos el módulo 10 del número para saber el valor de las unidades
		ddos = (num / 10) % 10; //Calculamos la división entre 10 del número y el módulo 10 del resultado para conocer el valor de las decenas
		dtres = (num / 100) % 10; //Calculamos la división entre 100 del número y el módulo 10 del resultado para conocer el valor de las centenas
		dcuatro = num / 1000; //Calculamos la división entre 1000 del número y el módulo 10 del resultado para conocer el valor de los millares
		
		if (num<10) { //Si el número está comprendido entre 1 y 9, entonces es capicúa
			
			cap = 1; //Asignamos el valor 1 a la variable "cap" para indicar que el número introducido es capicúa
			
		} else if (num<100) { //Si el número introducido es menor que 100 (está comprendido entre 10 y 99), entonces pasamos a comprobar...
		
			if (duno==ddos) { //comprobamos si la cifra de las unidades y la cifra de las decenas son iguales
				
				cap = 1; //Asignamos el valor 1 a la variable "cap" para indicar que el número introducido es capicúa
		}
				
		} else if (num<1000) { //Si el número introducido es menor que 1000 (está comprendido entre 100 y 999), entonces pasamos a comprobar...
			
			if (duno==dtres) { //comprobamos si la cifra de las unidades y la cifra de las centenas son iguales
				
				cap = 1; //Asignamos el valor 1 a la variable "cap" para indicar que el número introducido es capicúa
		}
			
		} else if (num<10000) { //Si el número introducido es menor que 10000 (está comprendido entre 1000 y 9999), entonces pasamos a comprobar...
			
			if (duno==dcuatro && ddos==dtres) { //comprobamos si la cifra de las unidades y la cifra de los millares son iguales, y también si la cifra de las decenas y la cifra de las centenas son iguales
				
				cap = 1; //Asignamos el valor 1 a la variable "cap" para indicar que el número introducido es capicúa
				
			}
			
		}
		
		switch (cap) { //Abrimos un switch para mostrar un resultado al usuario en función del valor de la variable "cap"
		
		case 1->
		System.out.println("El número introducido es capicúa"); //Si la variable cap tiene un valor de 1, entonces el número es capicúa y mostramos este mensaje
		case 0->
		System.out.println("El número introducido no es capicúa"); //Si la variable cap tiene un valor de 0, entonces el número no es capicúa y mostramos este mensaje
		
		}
		
		//Cerramos el scanner
		
		lectura.close();
			
	}

}
