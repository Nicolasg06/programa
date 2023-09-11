package atividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double D, d, area;

		System.out.print("Digite a diagonal maior: ");
		D = input.nextDouble();
		System.out.print("Digite a diagonal menor: ");
		d = input.nextDouble();

		area = (D * d) / 2;

		System.out.format("Área: %.0f", area);
		
		String entrada;
		

		entrada = JOptionPane.showInputDialog("Digite a diagonal maior: ");
		D = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Digite a diagonal menor: ");
		d = Integer.parseInt(entrada);

		JOptionPane.showMessageDialog(null, "Área: " + area);
		System.exit(0);

	}

}
