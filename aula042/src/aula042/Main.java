package aula042;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		int numero, dobro;
		
		System.out.print("Informe um numero: ");
		numero = input.nextInt();
	
		dobro = numero * 2;
		System.out.println("O dobro do número é: " + dobro);
	}
}