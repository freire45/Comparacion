package br.com.erickfreire.comparacion;

import java.util.Scanner;

public class Comparacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Programa que compara dos valores: ");
		System.out.print("Introduzca el primer valor:");
		numero1 = entrada.nextInt();
		
		System.out.print("Introduzca el segundo valor:");
		numero2 = entrada.nextInt();
		
		if(numero1 == numero2)
			System.out.printf("El Numero %d == %d%n", numero1, numero2);
		
		if(numero1 != numero2)
			System.out.printf("El Numero %d != %d%n", numero1, numero2);
		
		if(numero1 > numero2)
			System.out.printf("El Numero %d > %d%n", numero1, numero2);
		
		if(numero1 < numero2)
			System.out.printf("El Numero %d < %d%n", numero1, numero2);
		
		if(numero1 >= numero2)
			System.out.printf("El Numero %d >= %d%n", numero1, numero2);
		
		if(numero1 <= numero2)
			System.out.printf("El Numero %d == %d%n", numero1, numero2);

	}

}
