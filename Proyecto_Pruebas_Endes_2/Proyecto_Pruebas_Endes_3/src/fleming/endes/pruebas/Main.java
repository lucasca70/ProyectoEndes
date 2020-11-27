/**
 * 
 */
package fleming.endes.pruebas;

import java.util.Scanner;

/**
* Ejercicio ENDES CURSO 20-21
* IES Dr.Fleming-Oviedo
* Programa que calcula la suma de los valores 
* comprendidos entre dos numero enteros positivos.
* Ej. la suma de los valores comprendidos entre 4 y 7 es 22
* 
* @author: Isabel Jardón
* Fecha: 30 oct. 2020
* version: 1.0
*
**/
public class Main {

	/**
	 * main
	 * Método que calcula la suma de los numeros comprendidos
	 * entre dos valores enteros positivos
	 * 
	 * Fecha Mod: 30 oct. 2020
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int e_inferior;
		int e_superior;
		int indice;
		int suma=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un valor (entero positivo), para el extremo inferior : ");		
		e_inferior=entrada.nextInt();
		
		System.out.println("Introduzca un valor (entero positivo), para el extremo superior : ");		
		e_superior=entrada.nextInt();
		
		indice = e_inferior;
		while (indice < e_superior) {
			suma+=indice;
			indice++;			
		}
		System.out.printf("La suma de los valores comprendidos entre %d y %d es %d",e_inferior,e_superior, suma);
	}

}
