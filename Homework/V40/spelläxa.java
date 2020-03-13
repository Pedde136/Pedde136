package V40;

import java.util.Scanner;
import java.util.Random;

public class spell�xa {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			meny();
		}
	}

	
	//Denna metod inneh�ller spelmenyn och val inom intervall samt sv�rhetsgrad.
	public static void meny() {
		int maxIntervall = 0; //Skapar en variabel som �r maxgr�nsen f�r intervallet.

		do {
			//Detta �r hur spelmenyn ser ut fr�n spelarens perspektiv.
			System.out.println("Tryck p� n�gon av alternativen nedan f�r att b�rja :D \n");
			System.out.println("(1) - Starta Spel");
			System.out.println("(2) - Instruktioner");
			System.out.println("(3) - Credits");
			System.out.println("(4) - Avsluta Spel");
			
			
			String game;
			int mainChoice = getValidInput(); //S�tter in trycatch metoden ist�llet f�r "input.nextInt();".

			switch (mainChoice) { //G�r en Switch-case f�r menyn 

			case 1: //Den f�rsta delen inneh�ller intervall-val d� man ska v�lja ett intervall.

				do {
					System.out.println("Laddar, v�lj ett intervall");
					System.out.println("(1) 0-10");
					System.out.println("(2) 0-25");
					System.out.println("(3) 0-50");
					System.out.println("(4) 0-75");
					System.out.println("(5) 0-100");

					int intervall = getValidInput(); //Skapar en intervall variabel, och s�tter in trycatch metoden ist�llet f�r "input.nextInt();".

					if (intervall == 1) { //Om man trycker p� "1" s� kommer man v�lja intervall 1-10.
						System.out.println("Du valde intervallet 0-10,");
						maxIntervall = 10;
						break;
					}

					else if (intervall == 2) { //Om man trycker p� "2" s� kommer man v�lja intervall 1-25.
						System.out.println("Du valde intervalelt 0-25,");
						maxIntervall = 25;
						break;
					}

					else if (intervall == 3) { //Om man trycker p� "3" s� kommer man v�lja intervall 1-50.
						System.out.println("Du valde intervallet 0-50,");
						maxIntervall = 50;
						break;
					}

					else if (intervall == 4) { //Om man trycker p� "4" s� kommer man v�lja intervall 1-75.
						System.out.println("Du valde intervallet 0-75,");
						maxIntervall = 75;
						break;
					}

					else if (intervall == 5) { //Om man trycker p� "5" s� kommer man v�lja intervall 1-100.
						System.out.println("Du valde intervallet 0-100,");
						maxIntervall = 100;
						break;
					
					} else {
						System.out.println("fel tal, v�lj ett mellan 1 och 5!");

					}
				} while (true); // Skapar en do-while loop som f�ngar upp tal som inte finns inom valen s� att programmet inte kraschar, och anv�nderen kan �ven v�lja igen.

				System.out.println("\nV�lj sv�rhetsgrad:"); //Efter att man har valt intervall s� ska man v�lja sv�rhetsgrad.

				
				//H�r v�ljer man sv�rhetsgrad.
				do {
					//Man f�r v�lja mellan 3 sv�rhetsgrader.
					System.out.println(" (1) Easy - 10 gissningar");
					System.out.println(" (2) Medium - 5 gissningar");
					System.out.println(" (3) Hard - 3 gissningar");

					int choice = getValidInput(); //Skapar en "choice" variabel, och s�tter in trycatch metoden ist�llet f�r "input.nextInt();".

					if (choice == 1) { 
						System.out.println("Du valde Easy");
						g�md(10, maxIntervall);// Om man trycker "1" f�r man Easy och har d�rmed 10 f�rs�k p� sig.
						break;
					}

					if (choice == 2) {
						System.out.println("Du valde Medium");
						g�md(5, maxIntervall); // Om man trycker "2" f�r man Easy och har d�rmed 5 f�rs�k p� sig.
						break;
					}

					if (choice == 3) {
						System.out.println("Du valde Hard");
						g�md(3, maxIntervall); // Om man trycker "3" f�r man Easy och har d�rmed 3 f�rs�k p� sig.
						break;
					}

					System.out.println("V�lj mellan 1-3!");

				} while (true); // Skapar en do-while loop som f�ngar upp tal som inte finns inom valen s� att programmet inte kraschar, och anv�nderen kan �ven v�lja igen.

				break;

			case 2:
				//Spelets instruktioner
				game = "Instruktioner";
				System.out.println("Du valde att se " + game + ":\n");
				System.out.println("(1) F�rst startar du programmet");
				System.out.println("(2) Sedan v�ljer du vilket intervall du vill ha");
				System.out.println(
						"(3) V�lj sedan sv�rhetsgrad (Easy, Medium och Hard) vilket �r antalet g�gner du kan gissa fel");
				System.out.println("(4) Tryck p� ''Play''");
				System.out.println("(5) Skriv in en siffra inom ditt intervall");
				System.out.println(
						"(6) Om det st�r ''Lower'' ska du gissa l�gre, st�r det ''Higher'' ska du gissa h�gre");
				System.out.println("(7) Gissar du r�tt �r spelet klart, men gissar du fel f�r du b�rja om");
				System.out.println();
				System.out.println("**Tryck p� 0 f�r att �terv�nda till menyn**");
				
				do {
					int GoBack = getValidInput(); // Skapar en variabel och en if-sats som g�r att om man trycker p� "0" s� �terv�nder man till main menyn.
					if (GoBack == 0) {
						break;
					}
				} while (true); //G�r en do-while s� att man skall kunna �terv�nda till menyn oavsett om man spammar andra siffror.

				break;
			
			case 3: //Credits

				game = "Credits";
				System.out.println("Du valde att se " + game + ":\n");
				System.out.println("Skapare: Pedram Khanzaden");
				System.out.println("Medverkare: Donald Trump, Albert Einstein, Tom Cruise");
				System.out.println();
				System.out.println("**Tryck p� 0 f�r att �terv�nda till menyn**");
				
				do {
					int GoBack = getValidInput(); // Skapar en variabel och en if-sats som g�r att om man trycker p� "0" s� �terv�nder man till main menyn.
					if (GoBack == 0) {
						break;
					}
				} while (true);//G�r en do-while s� att man skall kunna �terv�nda till menyn oavsett om man spammar andra siffror.

				break;

			case 4:
				//H�r f�r man valet att kunna avsluta spelet.
				game = "Avsluta Spel";
				System.out.println("Du valde att " + game + "\n     �r du s�ker?");
				System.out.println();
				System.out.println("  Ja:1         Nej:0");

				do {
					//Om man trycker p� "1" avslutas spelet, och om man trycker p� "0" s� skickas man tillbaka till menyn.
					int GoBack = getValidInput();
					if (GoBack == 1) {
						System.out.println("Spelet �r avlutat.");
						input.close();
						System.exit(0);
					}
					if (GoBack == 0) {
						
						break;
					}
				} while (true);//G�r en do-while s� att programmet inte ska bugga om man trycker p� ett annat tal �n 0 och 1. Om man trycker p� r�tt tal kommer man ur loopen och programmet fungerar som vanligt.

				break;
			default:
				System.out.println("G�r ett val mellan 1-4");// Detta skrivs om man skriver n�got annat �n 1,2,3 och 4.
				break;

			}

		} while (true);

	}

	/**Denna metod �r en trycatch som identiferar fel input och informerar spelaren om att den skall skriva ett giltligt tal.
	 * 
	 * @return trycatch
	 */
	private static int getValidInput() {
		int trycatch;
		while (true) {    
			try {
				trycatch = input.nextInt(); // H�r byter jag ut "input.nextInt();" till trycatch f�r att testa om det �r en siffra.
				input.nextLine();
				return trycatch;
			} catch (Exception e) {   //Om man skriver in en bokstav s� ber den spelaren att v�ja ett giltligt tal.
				System.out.println("V�lj ett giltligt tal!");
				input.nextLine();
			}
		}

	}

	/**Denna metod inneh�ller sj�lva spelet
	 * 
	 * @param gissningar
	 * @param intervall
	 * @return 
	 */
	public static int g�md(int gissningar, int intervall) {

		Random random = new Random(); 
		Scanner input = new Scanner(System.in);

		long nummer = (long) Math.round(Math.random() * intervall); //G�r ett radom tal och multiplicerar det med det valda intervallet.

		if (nummer == 0) { 
			nummer++;
		}

		int G�mtnummer = random.nextInt(intervall) + 1; //H�r �r variabeln "G�mtnummer" som �r ett slumpm�ssigt tal inom det valda intervallet.

		System.out.println("Gissa nummret mellan 1 - " + intervall);

		int gissa = 0; 
		for (int i = 0; i < gissningar; i++) {

			gissa = getValidInput(); //L�gger in min trycatch metod ist�llet f�r "input.nextInt();" f�r att den skall f�nga fel input.

			if (gissa == G�mtnummer) { // denna if sats inneb�r om spelarens gissning �r r�tt tal skall programmet svara att man gissade r�tt.
				System.out.println("Grattis! Du svarade r�tt!");
				break;

			}

			else if (gissa < G�mtnummer) { 
				if (i == gissningar - 1) { 

				} else { //Om spelarens gissning �r f�r l�g s� skriver programmet att man ska gissa h�gre.
					System.out.println("F�r l�gt, gissa h�gre");
				}
			}

			else if (gissa > G�mtnummer) {
				if (i == gissningar - 1) {

				} else { //Om spelarens gissning �r f�r h�g s� skriver programmet att man ska gissa h�gre.
					System.out.println("F�r h�gt, gissa l�gre");
				}
			}

		}

		System.out.println();
		if (gissa == G�mtnummer) {

		} else { //Om man inte gissar r�tt skriver programmet ut det r�tta svaret och man kan inte gissa l�ngre. 
			System.out.println("Du gissade fel, " + G�mtnummer + " �r det r�tta svaret!");
		}
		System.out.println("(1) Spela igen");
		System.out.println("(2) Avsluta spel");

		do {
			int end = getValidInput();

			switch (end) { //G�r en till swich-case f�r att ge spelaren alternativet att b�rja om eller st�nga av spelet.

			case 1: //Trycker man "1" s� kopplas man till meny-metoden och kommer tillbaka till b�rjan av koden.
				meny(); 

				break;

			case 2: //Trycker man "2" s� avslutas spelet.

				System.out.println("Spelet �r avslutat, tack f�r att du har spelat :D");
				System.exit(0);

			}
		} while (true);

	}
}