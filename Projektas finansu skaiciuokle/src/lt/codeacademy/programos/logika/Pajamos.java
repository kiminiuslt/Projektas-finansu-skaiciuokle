package lt.codeacademy.programos.logika;

import java.util.Scanner;

public class Pajamos {
	static int pinigaiIn;

	public int pajamuIvedimas() {

		Pasirinkimai pasirinkimai = new Pasirinkimai();

		System.out.println("Iveskite pajamas");
		Scanner skan = new Scanner(System.in);
		int ivedimas = skan.nextInt();

		pinigaiIn = pinigaiIn + ivedimas;

		System.out.println(pinigaiIn);

		return pinigaiIn;

	}

	public void pajamuPerziurejimas() {

//pajamu perziurejimas		
	}

}
