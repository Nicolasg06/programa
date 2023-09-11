package atividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double catetoOposto, catetoAdjacente, hipotenusa, cal;

		System.out.print("Digite o cateto oposto: ");
		catetoOposto = input.nextDouble();
		System.out.print("Digite o cateto adjacente: ");
		catetoAdjacente = input.nextDouble();

		cal = Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2);
		hipotenusa = Math.sqrt(cal);
		
		System.out.format("O valor da hipotenusa é: " + hipotenusa);

		String entrada;

		entrada = JOptionPane.showInputDialog("Digite o cateto oposto: ");
		catetoOposto = Double.parseDouble(entrada);

		entrada = JOptionPane.showInputDialog("Digite o cateto adjacente: ");
		catetoAdjacente = Double.parseDouble(entrada);

		JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa);
		System.exit(0);
	}

}
