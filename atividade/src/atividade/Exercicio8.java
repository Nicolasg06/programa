package atividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, peso1, peso2;

		System.out.print("Informe o seu peso: ");
		num1 = input.nextInt();
		
		peso1 = num1 * 15 / 100 + num1;
		peso2 = num1 * 20  / 100 - num1;
		
		System.out.println("O seu peso caso engorde 15% é: " + peso1+ "KG" );
		System.out.println("O seu peso caso emagreça 20% é: " + peso2+ "KG" );
		
		String entrada;

		entrada = JOptionPane.showInputDialog("Informe o seu peso: ");
		num1 = Double.parseDouble(entrada);

		JOptionPane.showMessageDialog(null, "O seu peso caso engorde 15% é: " + peso1 + "KG" );
		JOptionPane.showMessageDialog(null, "O seu peso caso emagreça 20% é: " + peso2 + "KG" );
		System.exit(0);
	}

}
