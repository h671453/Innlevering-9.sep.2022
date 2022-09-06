package Oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {

	public static void main(String[] args) {

		String intekt = showInputDialog("Skriv inn din intekt: ");
		int lonn = parseInt(intekt);
		double[] sats = { 0, 0.093, 0.241, 0.1152, 0.1452 };

		if (lonn < 164100) {
			showMessageDialog(null, "utbetaling av sats: " + sats[0]*lonn + "kr din trinnskatt er: 1");
		} else if (lonn > 164100 && lonn <= 230950) {
			showMessageDialog(null, "utbetaling av sats: " + sats[1]*lonn + "kr din trinnskatt er: 2");
		} else if (lonn > 230950 && lonn <= 580650) {
			showMessageDialog(null, "utbetaling av sats: " + sats[2]*lonn + "kr din trinnskatt er: 3");
		} else if (lonn > 580650 && lonn <= 934050) {
			showMessageDialog(null, "utbetaling av sats: " + sats[3]*lonn + "kr din trinnskatt er: 4");
		} else if (lonn > 934050) {
			showMessageDialog(null, "utbetaling av sats: " + sats[4]*lonn + "kr din trinnskatt er: 5");

		}

	}

}
