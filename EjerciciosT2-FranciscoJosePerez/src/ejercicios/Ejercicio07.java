package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Pruebas realizadas:
		 * 
		 * h = 18, m = 30, s = 59 --> Si añadimos un segundo a la hora que has introducido, son las 18:31:0 --> correcto
		 * h = 23, m = 59, s = 59 --> Si añadimos un segundo a la hora que has introducido, son las 0:0:0 --> correcto
		 * h = 20, m = 20, s = 40 --> Si añadimos un segundo a la hora que has introducido, son las 20:20:41 --> correcto
		 * h = 200, m = 120, s = 8 --> ERROR, la hora que has introducido es incorrecta
		 * 
		 */
		
		//Declaramos las variables que vamos a utilizar
		
		int h=0, m=0, s=0;
		/*
		 * h: en esta variable vamos a guardar la hora introducida por el usuario
		 * m: en esta variable vamos a guardar los minutos introducidos por el usuario
		 * s: en esta variable vamos a guardar los segundos introducidos por el usuario
		 * 
		 */
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que nos indique una hora
		
		System.out.println("Introduce las horas");
		h = lectura.nextInt(); //Guardamos el valor introducido en la variable "h"
		System.out.println("Introduce los minutos");
		m = lectura.nextInt(); //Guardamos el valor introducido en la variable "m"
		System.out.println("Introduce los segundos");
		s = lectura.nextInt(); //Guardamos el valor introducido en la variable "s"
		
		if (h>=0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) { //Establecemos unos requisitos para las distintas variables
		//Las horas deben estar entre 0 y 23, los minutos entre 0 y 59, los segundos entre 0 y 59
		
			s++; //Le sumamos un segundo a los introducidos por el usuario
			
			if (s==60) { //Comprobamos si los segundos son igual a 60, en ese caso le asignamos el valor 0 y sumamos 1 minuto
				
				s=0;
				m++;
				
				if (m==60) { //Comprobamos si los minutos son igual a 60, en ese caso le asignamos el valor 0 y sumamos 1 hora
					
					m=0;
					h++;
					
					if (h==24) { //Comprobamos si las horas son igual a 24, en ese caso le asignamos el valor 0
						
						h=0;
						
					}
					
				}
				
			}
			
			System.out.println("Si añadimos un segundo a la hora que has introducido, son las " + h + ":" + m + ":" + s); //Mostramos el resultado en pantalla
			
		} else
			
			System.out.println("ERROR, la hora que has introducido es incorrecta"); //Mostramos un mensaje de error en caso de que la hora introducida sea incorrecta
			//La hora será incorrecta si se sale del rango establecido (horas de 0 a 23, minutos y segundos de 0 a 59)
		
		//Cerramos el scanner
		
		lectura.close();
		
		
	}

}