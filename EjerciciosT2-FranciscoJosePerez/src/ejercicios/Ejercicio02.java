package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Pruebas
		 * 
		 * pruebo el programa con mi propio DNI, debe dar como resultado una "W":
		 * 
		 * 		Input: 79285993
		 * 		resultado: W (satisfactorio)
		 * 
		 * ahora procedo a probar el programa con otro dni aleatorio generado en internet
		 * 
		 * 		Input: 17962800
		 * 		resultado: F (satisfactorio)
		 * 
		 */
		
		//Declaramos las variables que vamos a utilizar
		
		int dni; //En esta variable vamos a guardar el número de DNI introducido por el usuario
		String letra =""; //En esta variable vamos a guardar la letra correspondiente al número de DNI introducido por el usuario
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca su número de DNI
		
		System.out.println("Introduce tu número de DNI");
		dni = lectura.nextInt(); //Guardamos el valor introducido en la variable "dni"
		
		//Calculamos el módulo 23 del DNI 
		
		dni%=23; //Este valor lo vamos a utilizar luego para encontrar la letra correspondiente a ese número de DNI
		
		//Realizamos los cálculos necesarios
		
		switch (dni) { //En este switch contemplamos los 23 posibles casos, en función del resultado de dni%23 (es decir, en función de qué valor nos de el resto de la división del número de DNI introducido entre 23)
		
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
		
		System.out.println(letra); //Mostramos por pantalla la letra al usuario
		
		//Cerramos el scanner
		
		lectura.close();
		
	}

}
