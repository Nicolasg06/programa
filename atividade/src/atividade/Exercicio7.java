package atividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, res;

		System.out.print("Informe o atual salário mínimo: R$ ");
		num1 = input.nextInt();
		System.out.print("Informe o seu salário mínimo: R$ ");
		num2 = input.nextInt();

		res = num2 / num1;

		System.out.println("O funcionario recebe " + res + " salários mínimos.");
		
		String entrada;

		entrada = JOptionPane.showInputDialog("Informe o atual salário mínimo: R$");
		num1 = Double.parseDouble(entrada);

		entrada = JOptionPane.showInputDialog("Informe o seu salário: R$");
		num2 = Double.parseDouble(entrada);

		JOptionPane.showMessageDialog(null, "O funcionario recebe " + res + " salários mínimos.");

		System.exit(0);
	}

}
