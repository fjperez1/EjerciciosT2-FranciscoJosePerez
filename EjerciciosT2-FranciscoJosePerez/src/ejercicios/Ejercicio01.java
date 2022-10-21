package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int num, cap = 0, duno, ddos, dtres, dcuatro;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca el número comprendido entre el 1 y el 9999
		
		System.out.println("Introduce un número comprendido entre el 1 y el 9999 para saber si es capicúa");
		num = lectura.nextInt();
		
		//Realizamos los cálculos necesarios
		
		duno = num % 10;
		ddos = (num / 10) % 10;
		dtres = (num / 100) % 10;
		dcuatro = num / 1000;
		
		if (num<10) {
			
			cap = 1;
			
		} else if (num<100) { 
		
			if (duno==ddos) {
				
				cap = 1;
		}
				
		} else if (num<1000) {
			
			if (duno==dtres) {
				
				cap = 1;
		}
			
		} else if (num<10000) {
			
			if (duno==dcuatro && ddos==dtres) {
				
				cap = 1;
				
			}
			
		}
		
		switch (cap) {
		
		case 1->
		System.out.println("El número introducido es capicúa");
		case 0->
		System.out.println("El número introducido no es capicúa");
		
		}
			
	}

}
