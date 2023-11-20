package StauspielMitTasks;

import java.util.ArrayList;

public class StauAufloesen {
	private Spielhilfe helfer = new Spielhilfe();
	
	//TASK 1: hier fehlt noch die pannenFahrzeugListe
	//pannenFahrzeugeListe soll die Referenzvariable für eine private ArrayList für Spielfahrzeuge sein,
	//wobei diese Liste hier auch erzeugt werden soll, damit sie später gefüllt werden kann
	private int anzahlVersuche = 0;
	private ArrayList<Spielfahrzeug> pannenFahrzeugeListe = new ArrayList<Spielfahrzeug>();

	private void spielVorbereiten() {

		for (int i = 0; i < 3; i++) {
			//TASK 2: der pannenFahrzeugListe soll nun jeweils ein Spielfahrzeug hinzugefügt werden
			//...
			pannenFahrzeugeListe.add(new Spielfahrzeug(4, 5, 6, true));
		}

		System.out.println("Finden Sie im Raster A0, ..., G6 drei Fahrzeuge mit Pannen auf.");

		for (Spielfahrzeug pannenFahrzeug : pannenFahrzeugeListe) {
			ArrayList<String> pannenOrt = helfer.plaziereFahrzeug(3);
			pannenFahrzeug.setBlockierteAbschnitte(pannenOrt);
		}

		System.out.println("Versuchen Sie dies mit so wenig Suchversuchen wie möglich.");

	}

	private void spielStarten() {
		//TASK 2: die Zeilen bis TASK 3 sollen innerhalb einer While-Schleife ausgeführt werden,
		//wobei die Schleife laufen soll, solange die pannenFahrzeugListe noch nicht leer ist
		//WHILE Anfang
		//...
		while (pannenFahrzeugeListe.size() > 0) {
			String suchVersuch = helfer
					.erhalteBenutzerEingabe("Wo suchen Sie jetzt nach dem Pannenfahrzeug? A0, ..., G6 sind möglich. ");
			testeBenutzerEingabe(suchVersuch);
		}
		//TASK 3: WHILE Ende
		//...
		//TASK 4: alle Pannenfahrzeuge wurden abgeschleppt, die Methode zum Beenden des Spiels soll aufgerufen werden
		//...
		spielBeenden();
	}

	private void testeBenutzerEingabe(String versuch) {
		anzahlVersuche++;
		String ergebnis = "freier Abschnitt";

		for (Spielfahrzeug fahrzeugFuerTest : pannenFahrzeugeListe) {
			ergebnis = fahrzeugFuerTest.testeDichSelbst(versuch);
			if (ergebnis.equals("blockierter Abschnitt gefunden")) {
				break;
			}
			if (ergebnis.equals("Pannenfahrzeug komplett gefunden")) {
				//TASK 5: beim gefundenen Pannenfahrzeug soll das Vorderlicht angeschaltet werden
				//...
				fahrzeugFuerTest.vorderlichtAnschalten();
				System.out.println(
						"Wir haben jetzt das Licht angeschaltet, damit man das defekte Fahrzeug besser sieht.");
				pannenFahrzeugeListe.removeIf(e -> (e == fahrzeugFuerTest));
				break;
			}
		}
		System.out.println(ergebnis);
	}

	private void spielBeenden() {
		System.out.println("Alle defekten Fahrzeuge wurden gefunden!");
		if (anzahlVersuche <= 20) {
			System.out.println("Sie haben nur " + anzahlVersuche + " Versuche gebraucht.");
			System.out.println("So schnell kann das gehen.");
		} else {
			System.out.println("Hui, " + anzahlVersuche + " Suchversuche.");
			System.out.println(
					"Beim nächsten Mal müssen Sie noch Decken und Verpflegung für die Leute im Stau mitbringen.");
		}
	}

	public static void main(String[] args) {
		//TASK 6: es soll eine neue Instanz dieser Klasse mit Referenzvariable spiel erzeugt werden;
		//die Klasse hat zwar nicht explizit einen Konstruktor, sondern nur implizit, aber dieser reicht hier aus 
		//...
		StauAufloesen spiel = new StauAufloesen();
		spiel.spielVorbereiten();
		//TASK 7: nachdem alles vorbereitet ist, starten Sie bitte das Spiel
		//...
		spiel.spielStarten();
	}
}