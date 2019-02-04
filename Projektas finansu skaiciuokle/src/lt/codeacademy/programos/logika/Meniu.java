package lt.codeacademy.programos.logika;

public class Meniu {
	int pinigaiIn;
	int pinigaiOut;
	int balansas;

	public void pagrindinisMeniu() {

		System.out.println("		PAGRINDINIS MENIU ");
		System.out.println("Pasirinkite veiksma ir spauskite ENTER ");
		System.out.println("Pajamos          ----> 1		" + "PAJAMOS:  " + pinigaiIn);
		System.out.println("Islaidos         ----> 2		" + "ISLAIDOS: " + pinigaiOut);
		System.out.println("Balansas         ----> 3		" + "BALANSAS: " + balansas);
		System.out.println("Doumenu ivedimas ----> 4		");
		System.out.println("Baigti darba     ----> 5		");
	}

	public void pajamosMeniu() {

		System.out.println("			PAJAMOS ");
		System.out.println("Pasirinkite veiksma ir spauskite ENTER ");
		System.out.println("Ivesti pajamas            ----> 1		" + "PAJAMOS:   " + pinigaiIn);
		System.out.println("Perziureti pajamas        ----> 2		" + "ISLAIDOS:  " + pinigaiOut);
		System.out.println("Balansas                  ----> 3		" + "BALANSAS:  " + balansas);
		System.out.println("Gryzti i pagrindini meniu ----> 4		");
		System.out.println("Baigti darba              ----> 5		");
	}

}
