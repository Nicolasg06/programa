package atividade;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, res;

		System.out.print("Informe a temperatura atual C°: ");
		num1 = input.nextInt();

		res = num1 * 1.8 + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + res);
		
		String entrada;
		

		entrada = JOptionPane.showInputDialog("Informe a temperatura atual C°: ");
		num1 = Double.parseDouble(entrada);

		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + res);
		System.exit(0);
	}

}
