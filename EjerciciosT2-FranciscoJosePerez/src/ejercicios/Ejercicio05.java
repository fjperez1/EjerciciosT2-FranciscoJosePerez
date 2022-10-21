package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca el número
		
		System.out.println("Introduce un número cualquiera para conocer su valor absoluto");
		num = lectura.nextDouble();
		
		System.out.println (num>=0 ? "El valor absoluto del número es " + num: "El valor absoluto del número es " + (num*-1));
		
	}

}
