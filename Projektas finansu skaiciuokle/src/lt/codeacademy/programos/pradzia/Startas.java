package lt.codeacademy.programos.pradzia;

import lt.codeacademy.programos.logika.Meniu;
import lt.codeacademy.programos.logika.Pasirinkimai;

public class Startas {
	int pinigaiIn;
	int pinigaiOut;
	int balansas;
	int pasirinkimas;

	public static void main(String[] args) {
		Meniu meniu = new Meniu();
		Pasirinkimai pasirinkimai = new Pasirinkimai();
		
		int pinigaiIn = 0;
		int pinigaiOut = 0;
		int balansas = pinigaiIn - pinigaiOut;
		int pasirinkimas = 0;

		Pasisveikinimas.pasisveikinimas();

		meniu.pagrindinisMeniu();
		pasirinkimai.pagrindinisMeniu();
		
		
		
		System.out.println("0");

	}

}
