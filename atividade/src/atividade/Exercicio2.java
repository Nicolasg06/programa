package atividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero1, numero2, numero3, atual, proxima;

		System.out.print("Informe seu ano de nascimento: ");
		numero1 = input.nextInt();
		System.out.print("Informe o ano atual: ");
		numero2 = input.nextInt();
		numero3 = 2050;
		atual = numero2 - numero1;
		proxima = numero3 - numero1;
		
		System.out.println(" Sua idade atual é: " + atual+ " anos.");
		System.out.println(" Sua idade em 2050 será: " + proxima + " anos.");
		
		String data, prox;
		
		data = JOptionPane.showInputDialog("Informe seu ano de nascimento: ");
		numero1 = Integer.parseInt(data);
		prox = JOptionPane.showInputDialog("Informe o ano atual: ");
		numero2 = Integer.parseInt(prox);
		numero3 = 2050;

		JOptionPane.showMessageDialog(null, "Sua idade atual é: " + atual + " anos.");
		JOptionPane.showMessageDialog(null, "Sua idade em 2050 será: " + proxima + " anos." );

		System.exit(0);	}

}
