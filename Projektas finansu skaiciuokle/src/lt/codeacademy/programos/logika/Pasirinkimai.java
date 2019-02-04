package lt.codeacademy.programos.logika;

import java.util.Scanner;

import lt.codeacademy.programos.pabaiga.ProgramosPabaiga;

public class Pasirinkimai {
	Meniu meniu = new Meniu();
	Pajamos pajamos = new Pajamos();

	public void pagrindinisMeniu() {

		Scanner skan = new Scanner(System.in);

		int pasirinkimas = skan.nextInt();

		switch (pasirinkimas) {

		case 1:
			meniu.pajamosMeniu();
			pajamosPasirinkimas();

			break;

		case 2:

		case 3:

		case 4:

		case 5:
			ProgramosPabaiga.programosPabaiga();
			break;

		}

	}

	public void pajamosPasirinkimas() {
		Scanner skan = new Scanner(System.in);

		int pasirinkimas = skan.nextInt();

		switch (pasirinkimas) {

		case 1:
			pajamos.pajamuIvedimas();

			break;

		case 2:
			pajamos.pajamuPerziurejimas();
			break;

		case 3:

		case 4:
			meniu.pagrindinisMeniu();
			pagrindinisMeniu();
			break;

		case 5:
			ProgramosPabaiga.programosPabaiga();
			break;

		}
	}
}
