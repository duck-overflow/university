package StauspielMitTasks;

import Automobilität.Fahrzeug;

import java.util.ArrayList;

public class Spielfahrzeug extends Fahrzeug {
	// neu fuer unser Stauspiel
	private ArrayList<String> blockierteAbschnitte;

	public Spielfahrzeug(int fin, int anzahlPersonen, int maxZuladung, boolean ahk) {
		super(fin, anzahlPersonen, maxZuladung, ahk);
	}

	// neu fuer unser Stauspiel
	public void setBlockierteAbschnitte(ArrayList<String> ort) {
		//TASK 8: weisen Sie den von der Hilfsklasse ermittelten
		//und übergebenen Pannenfahrzeugort der passenden Instanzvariable des Objektes zu
		//...
		blockierteAbschnitte = ort;
	}

	public String testeDichSelbst(String testFeld) {
		String result = "freier Abschnitt";
		int index = blockierteAbschnitte.indexOf(testFeld);
		if (index >= 0) {
			blockierteAbschnitte.remove(index);
			if (blockierteAbschnitte.isEmpty()) {
				result = "Pannenfahrzeug komplett gefunden";
			} else {
				result = "blockierter Abschnitt gefunden";
			}
		}
		return result;

	}
}
