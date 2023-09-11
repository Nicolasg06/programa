package atividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double raio, area, volume, comprimento;
		System.out.print("Digite o raio do círculo: ");
		raio = input.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
		comprimento = 2 * Math.PI * raio;
		System.out.format("Comprimento: %.2f \n", comprimento);
		System.out.format("Área: %.2f \n", area);
		System.out.format("Volume: %.2f \n", volume);

		String entrada;

		entrada = JOptionPane.showInputDialog("Digite o raio da esfera: ");
		raio = Integer.parseInt(entrada);

		JOptionPane.showMessageDialog(null, "O comprimento da esfera é: " + comprimento);
		JOptionPane.showMessageDialog(null, "Área é: " + area);
		JOptionPane.showMessageDialog(null, "O volume é: " + volume);

		System.exit(0);
	}
}