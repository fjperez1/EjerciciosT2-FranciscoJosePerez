package ejercicios;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int num1 = (int)(Math.random()*99)+1, num2 = (int)(Math.random()*99)+1, res;
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("¿Cuál es el resultado de sumar " + num1 + " + " + num2 + " ?");
		res = lectura.nextInt();
		
		if (res==(num1+num2)) {
			
			System.out.println("¡Resultado correcto!");
			
		} else
			
			System.out.println ("¡Resultado incorrecto!");
		
		
	}

}
