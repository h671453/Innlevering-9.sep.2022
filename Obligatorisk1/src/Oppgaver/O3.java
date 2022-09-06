package Oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O3 {
	public static void main(String[] args) {
		
		String tallIn = showInputDialog("Skriv inn et gyldig tall: ");
		long tall = parseInt(tallIn);
		
		if (tall <= 0) {
			showMessageDialog(null, "Uyldig tall");
		}else {
			showMessageDialog(null, factorial(tall));
		}
	}
	public static long factorial(long n) {
		
		if (n == 1) {
			return 1;
		}else {
			return factorial(n - 1)*n;
		}
	}
}
