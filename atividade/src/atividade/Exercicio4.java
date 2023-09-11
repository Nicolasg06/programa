package atividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, soma;
		System.out.print("Informe o seu salário: R$");
		num1 = input.nextDouble();

		soma = num1 * 25 / 100 + num1;
		
		System.out.println("Seu salário atual sera de: R$" + soma);
		
		String entrada;
		
		entrada = JOptionPane.showInputDialog("Informe o seu salário: R$");
		num1 = Double.parseDouble(entrada);

		JOptionPane.showMessageDialog(null, "Seu salário atual sera de: R$" + soma);
		System.exit(0);
	}

}
