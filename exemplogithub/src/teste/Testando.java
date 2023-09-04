package teste;
import java.util.Scanner;
public class Testando {

	

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int numero1, numero2, soma;
		System.out.print("Informe o 1° número: ");
		numero1 = input.nextInt();
		System.out.print("Informe o 2° número: ");
		numero2 = input.nextInt();
		soma = numero1 + numero2;
		System.out.println("A soma é: " + soma);
	}
}
