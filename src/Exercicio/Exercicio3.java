
package Exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Digite o valor de  Celsius: ");

		int c = s.nextInt();

		int conversaoc = (c * 9 / 5) + 32;

		System.out.println("valor convertido de celsius para Fahrenheit" + " " + conversaoc + "F");
		
		
		
		

		System.out.println("Digite o valor de  Fahrenheit: ");

		float f = s.nextFloat();

		float conversaof = (f - 32) * 5 / 9;

		System.out.println("valor convertido de celsius para Fahrenheit" + " " + conversaof + "C");
		
		
		
		

	}

}
