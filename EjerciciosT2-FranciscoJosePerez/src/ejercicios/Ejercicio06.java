package ejercicios;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int num1 = (int)(Math.random()*99)+1, num2 = (int)(Math.random()*99)+1, res; //Usamos la función Matn.random para generar un número aleatorio, con el prefijo (int) cogemos únicamente la parte entera
		/*
		 * num1: en esta variable vamos a guardar el primer número aleatorio generado
		 * num2: en esta variale vamos a guardar el segundo número aleatorio generado
		 * res: en esta variable vamos a guardar el resultado de sumar el número 1 con el número 2 (el valor introducido por el usuario que juega)
		 * 
		 */
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("¿Cuál es el resultado de sumar " + num1 + " + " + num2 + " ?"); //Preguntamos al usuario cuál es el resultado de sumar los dos números
		res = lectura.nextInt(); //Guardamos el valor introducido por el usuario en la variable "res"
		
		if (res==(num1+num2)) { //Comparamos el resultado introducido por el usuario con el resultado de sumar el número 1 + el número 2
			
			System.out.println("¡Resultado correcto!"); //Mostramos un mensaje por pantalla en caso de que la respuesta sea correcta
			
		} else
			
			System.out.println ("¡Resultado incorrecto!"); //Mostramos otro mensaje distinto en caso de que la respuesta sea incorrecta
		
		//Cerramos el scanner
		lectura.close();
		
		
	}

}
