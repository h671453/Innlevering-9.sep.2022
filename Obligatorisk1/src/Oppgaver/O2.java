package Oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {

			String poengsum = showInputDialog("skriv in din poengsum: ");
			int poeng = parseInt(poengsum);

			if (poeng < 0 || poeng > 100) {
				showMessageDialog(null, "ugyldig poengsum prøv på nytt: ");
				i--;
			} else {

				if (poeng <= 100 && poeng >= 90) {
					showMessageDialog(null, "din karakter er A");
				} else if (poeng <= 89 && poeng >= 80) {
					showMessageDialog(null, "din karakter er B");
				} else if (poeng <= 79 && poeng >= 60) {
					showMessageDialog(null, "din karakter er C");
				} else if (poeng <= 59 && poeng >= 50) {
					showMessageDialog(null, "din karakter er D");
				} else if (poeng <= 49 && poeng >= 40) {
					showMessageDialog(null, "din karakter er E");
				} else if (poeng <= 39 && poeng >= 0) {
					showMessageDialog(null, "din karakter er F");

				}
			}
		}
	}
}
