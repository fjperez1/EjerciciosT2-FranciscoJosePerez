package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {		
		
		/*
		 * Pruebas realizadas:
		 * 
		 * numero = 1 a 9 --> uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve
		 * numero = 13 --> trece
		 * numero = 10 --> diez
		 * numero = 21 --> veintiuno
		 * numero = 35 --> treinta y cinco
		 * numero = 99 --> noventa y nueve
		 * 
		 */
		
		//Declaramos las variables que vamos a utilizar
		
		int numero, pcifra, scifra;
		/*
		 * numero: en esta variable vamos a guardar el número introducido por el usuario
		 * pcifra: en esta variable vamos a guardar el valor de las decenas
		 * scifra: en esta variable vamos a guardar el valor de las unidades
		 * 
		 */
		String numeroCadena=""; //En esta variable vamos a almacenar el valor que luego se mostrará por pantalla (suma el texto a mostrar para representar las decenas, y el texto a mostrar para representar las unidades)
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca un número entero
		
		System.out.println("Introduce un número entero comprendido entre el 1 y el 99");
		numero = lectura.nextInt(); //Almacenamos el número introducido por el usuario en consola en la variable "numero"
		
		//Operaciones para hallar la cifra de las decenas y la cifra de las unidades
		
		if (numero>9) { //Si el número es mayor que 9 (de 10 en adelante) entonces calcula el valor de las decenas (el número entre 10) y el valor de las unidades (el resultado de calcular el módulo 10 del número)
			pcifra = numero/10;
			scifra = numero%10;
		} else { //Si el número es menor que diez, entonces la primera y la segunda cifra tienen el mismo valor
			pcifra = numero;
			scifra = numero;
		}
		if (numero>15 || numero ==10) { 
		/* Si el número es mayor que 15 (lo hago así para evitar "pisar" los números del 11 al 15, que tienen una estructura completamente distinta al resto), o es igual a 10, entonces...
		 * abrimos el switch para comprobar el valor de las decenas;
		 */
			switch (pcifra) {
			case 1:
				if (scifra == 0) { //Si la cifra de las decenas tiene un valor de 1, y la cifra de las unidades es igual a 0, entonces el número a representar es el diez.
					numeroCadena+="diez"; //Añadimos a la variable "numeroCadena" el valor diez
					break;

				} else { //Si la cifra de las unidades es distinta de 0, entonces el valor que añadimos a la variable "numeroCadena" es "dieci"; posteriormente vamos a completar el texto con el valor de las unidades.
					numeroCadena+="dieci";
					break;
				}
			case 2: //Volvemos a repetir lo mismo con todos los posibles valores que puede tener la cifra de las decenas (del 1 al 9)
				if (scifra == 0) {
					numeroCadena+="veinte";
					break;
					
				} else {
					numeroCadena+="veinti";
					break;
				}
			case 3:
				if (scifra == 0) {		
					numeroCadena+="treinta";
					break;
					
				} else {
					numeroCadena+="treinta y ";
					break;
				}
			case 4:
				if (scifra == 0) {
					numeroCadena+="cuarenta";
					break;
					
				} else {
					numeroCadena+="cuarenta y ";
					break;
				}	
			case 5:
				if (scifra == 0) {
					numeroCadena+="cincuenta";
					break;
					
				} else {
					numeroCadena+="cincuenta y ";
					break;
				}
			case 6:
				if (scifra == 0) {		
					numeroCadena+="sesenta";
					break;
				} else {
					numeroCadena+="sesenta y ";
					break;
				}
			case 7:
				if (scifra == 0) {		
					numeroCadena+="setenta";
					break;
				} else {
					numeroCadena+="setenta y ";
					break;
				}
			case 8:
				if (scifra == 0) {	
					numeroCadena+="ochenta";
					break;
				} else {
					numeroCadena+="ochenta y ";
					break;
				}
			case 9:	
				if (scifra == 0) {	
					numeroCadena+="noventa";
					break;
				} else {
					numeroCadena+="noventa y ";
					break;
				}
				}			
			switch (scifra) {	//Ahora abrimos un switch para comprobar el valor de la cifra de las unidades.	
			case 1 ->
				numeroCadena+="uno"; //El switch contiene las 9 posibilidades (del 1 al 9), y asigna a la variable "numeroCadena" el valor de la cifra de las unidades (para completar el texto generado anteriormente)
			case 2 ->
				numeroCadena+="dos";
			case 3 ->
				numeroCadena+="tres";
			case 4 ->
				numeroCadena+="cuatro";
			case 5 ->
				numeroCadena+="cinco";
			case 6 ->
				numeroCadena+="seis";
			case 7 ->
				numeroCadena+="siete";
			case 8 ->
				numeroCadena+="ocho";
			case 9 ->
				numeroCadena+="nueve";
			}
		} else  if (numero>0 && numero<10){ //Este switch es exactamente igual al anterior, pero está reservado únicamente a los números comprendidos entre el 1 y el 9
			
			switch (pcifra) { //Volvemos a repetirlo para no pisar los números comprendidos entre el 11 y el 15 (que tienen una estructura especial)
			case 1:
				numeroCadena+="uno";
				break;
			case 2:
				numeroCadena+="dos";
				break;
			case 3:
				numeroCadena+="tres";
				break;
			case 4:
				numeroCadena+="cuatro";
				break;
			case 5:
				numeroCadena+="cinco";
				break;
			case 6:
				numeroCadena+="seis";
				break;
			case 7:
				numeroCadena+="siete";
				break;
			case 8:
				numeroCadena+="ocho";
				break;
			case 9:
				numeroCadena+="nueve";
				break;
			}
		} 
		switch (numero) {	//En este switch contemplamos los números comprendidos entre el 11 y el 15 (que tienen una forma de representarse distinta a la del resto de números)
			case 11:
				numeroCadena="once";
				break;
			case 12:
				numeroCadena="doce";
				break;
			case 13:
				numeroCadena="trece";
				break;
			case 14:
				numeroCadena="catorce";
				break;
			case 15:
				numeroCadena+="quince";
				break;
			}
		System.out.println(numeroCadena); //Ahora mostramos la variable "numeroCadena", que está formado por 2 partes: el texto correspondiente a la decenas (si el número es mayor a 9) y el texto correspondiente a las unidades.
		
		//Cerramos el scanner
		lectura.close();
		
		}
	}