package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pruebas realizadas:
		 * num = -5 --> "El valor absoluto del número es 5" --> correcto
		 * num = 0 --> "El valor absoluto del número es 0" --> correcto
		 * num = 6 --> "El valor absoluto del número es 6" --> correcto
		 * 
		 */
		
		//Declaramos las variables que vamos a utilizar
		
		double num; //En esta variable vamos a guardar el número introducido por el usuario
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca el número
		
		System.out.println("Introduce un número cualquiera para conocer su valor absoluto");
		num = lectura.nextDouble(); //Guardamos el número en la variable "num"
		
		System.out.println (num>=0 ? "El valor absoluto del número es " + num: "El valor absoluto del número es " + (num*-1)); 
		//Utilizamos un ternario para mostrar el resultado en pantalla. Si el número es mayor o igual a cero, entonces devuelve directamente el número sin realizar ningún cambio
		//Sin embargo, si el número es menor a cero, entonces lo multiplica por -1 para hallar su valor absoluto
		
		//Cerramos el scanner
		lectura.close();
		
	}

}
