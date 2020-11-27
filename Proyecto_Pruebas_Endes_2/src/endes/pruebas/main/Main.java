/**
 * 
 */
package endes.pruebas.main;

import java.util.Scanner;

/**
 * @author Tardes
 * Fecha: 26/10/2020
 *@version
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int numero1, numero2;
		System.out.println("Itroduzca un número: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Introduzca un número: ");
		numero2 = teclado.nextInt();
		
		System.out.println(numero1 +"-" +numero2+"=" +(numero1-numero2));
	}

}
