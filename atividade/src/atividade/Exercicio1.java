package atividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero1, numero2, numero3, soma, media;

		System.out.print("Informe o 1° número: ");
		numero1 = input.nextInt();
		System.out.print("Informe o 2° número: ");
		numero2 = input.nextInt();
		System.out.print("Informe o 3° número: ");
		numero3 = input.nextInt();

		soma = numero1 + numero2 + numero3;
		media = (soma) / 3;
		System.out.println("A media é: " + media);
		
		String entrada;
		

		entrada = JOptionPane.showInputDialog("Digite o número: ");
		numero1 = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Digite o número: ");
		numero2 = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Digite o número: ");
		numero3 = Integer.parseInt(entrada);

		JOptionPane.showMessageDialog(null, "A media é: " + media);
		System.exit(0);
	}

}
