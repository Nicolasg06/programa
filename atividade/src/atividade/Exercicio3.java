package atividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, reais;
		System.out.print("Informe a cotação do dolar: ");
		num1 = input.nextDouble();
		System.out.print("Informe o valor que possui: ");
		num2 = input.nextDouble();

		reais = num1 * num2;

		System.out.println("Seu saldo convertido é: R$" + reais);

		String cotação, dolar;

		cotação = JOptionPane.showInputDialog("Informe a cotação do dolar: ");
		num1 = Double.parseDouble(cotação);
		dolar = JOptionPane.showInputDialog("Informe o valor que possui: ");
		num2 = Double.parseDouble(dolar);

		JOptionPane.showMessageDialog(null, "Seu saldo convertido é: R$: " + reais);
		System.exit(0);
	}
}
