package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_not {
	public static void main(String[] args) {
		String Chang = JOptionPane.showInputDialog("Give me a number.");
		int Cedric = Integer.parseInt(Chang);
		for (int i = 2; i < Cedric; i++) {
			if (Cedric % i == 0) {
				JOptionPane.showMessageDialog(null, "The number is not prime.");
				System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, "The number is prime.");
	}
}
