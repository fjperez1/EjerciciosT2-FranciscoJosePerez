package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int dni;
		String letra ="";
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca su número de DNI
		
		System.out.println("Introduce tu número de DNI");
		dni = lectura.nextInt();
		
		//Calculamos el módulo 23 del DNI 
		
		dni%=23;
		
		//Realizamos los cálculos necesarios
		
		switch (dni) {
		
		case 0:
		
			letra="A";
			break;
		
		case 1:
			
			letra="R";
			break;
			
		case 2:
			
			letra="W";
			break;
			
		case 3:
			
			letra="A";
			break;
			
		case 4:
			
			letra="g";
			break;
		
		case 5:
			
			letra="M";
			break;
			
		case 6:
			
			letra="Y";
			break;
			
		case 7:
			
			letra="F";
			break;
			
		case 8:
			
			letra="P";
			break;
		
		case 9:
			
			letra="D";
			break;
			
		case 10:
			
			letra="X";
			break;
			
		case 11:
			
			letra="B";
			break;
			
		case 12:
			
			letra="N";
			break;
		
		case 13:
			
			letra="J";
			break;
			
		case 14:
			
			letra="Z";
			break;
			
		case 15:
			
			letra="S";
			break;
			
		case 16:
			
			letra="Q";
			break;
		
		case 17:
			
			letra="V";
			break;
			
		case 18:
			
			letra="H";
			break;
			
		case 19:
			
			letra="L";
			break;
			
		case 20:
			
			letra="C";
			break;
		
		case 21:
			
			letra="K";
			break;
			
		case 22:
			
			letra="E";
			break;
		
		}
		
		System.out.println(letra);
		
	}

}
