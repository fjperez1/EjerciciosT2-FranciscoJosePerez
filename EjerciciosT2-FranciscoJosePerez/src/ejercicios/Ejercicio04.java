package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {		
		//Declaramos las variables que vamos a utilizar
		
		int numero, pcifra, scifra;
		String numeroCadena="";
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca un número entero
		
		System.out.println("Introduce un número entero comprendido entre el 1 y el 99");
		numero = lectura.nextInt();
		
		//Primera cifra y segunda cifra
		
		if (numero>9) {
			pcifra = numero/10;
			scifra = numero%10;
		} else {
			pcifra = numero;
			scifra = numero;
		}
		if (numero>15 || numero ==10) {
			
			switch (pcifra) {
			case 1:
				if (scifra == 0) {
					numeroCadena+="diez";
					break;

				} else {
					numeroCadena+="dieci";
					break;
				}
			case 2:
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
					numeroCadena+="cuarenta y";
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
					numeroCadena+="sesenta y";
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
			switch (scifra) {			
			case 1 ->
				numeroCadena+="uno";
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
		} else  if (numero>0 && numero<10){
			
			switch (pcifra) {
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
		switch (numero) {	
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
		System.out.println(numeroCadena);
		}
	}