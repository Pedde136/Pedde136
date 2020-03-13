package V40;

import java.util.Scanner;
import java.util.Random;

public class spelläxa {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			meny();
		}
	}

	
	//Denna metod innehåller spelmenyn och val inom intervall samt svårhetsgrad.
	public static void meny() {
		int maxIntervall = 0; //Skapar en variabel som är maxgränsen för intervallet.

		do {
			//Detta är hur spelmenyn ser ut från spelarens perspektiv.
			System.out.println("Tryck på någon av alternativen nedan för att börja :D \n");
			System.out.println("(1) - Starta Spel");
			System.out.println("(2) - Instruktioner");
			System.out.println("(3) - Credits");
			System.out.println("(4) - Avsluta Spel");
			
			
			String game;
			int mainChoice = getValidInput(); //Sätter in trycatch metoden istället för "input.nextInt();".

			switch (mainChoice) { //Gör en Switch-case för menyn 

			case 1: //Den första delen innehåller intervall-val då man ska välja ett intervall.

				do {
					System.out.println("Laddar, välj ett intervall");
					System.out.println("(1) 0-10");
					System.out.println("(2) 0-25");
					System.out.println("(3) 0-50");
					System.out.println("(4) 0-75");
					System.out.println("(5) 0-100");

					int intervall = getValidInput(); //Skapar en intervall variabel, och sätter in trycatch metoden istället för "input.nextInt();".

					if (intervall == 1) { //Om man trycker på "1" så kommer man välja intervall 1-10.
						System.out.println("Du valde intervallet 0-10,");
						maxIntervall = 10;
						break;
					}

					else if (intervall == 2) { //Om man trycker på "2" så kommer man välja intervall 1-25.
						System.out.println("Du valde intervalelt 0-25,");
						maxIntervall = 25;
						break;
					}

					else if (intervall == 3) { //Om man trycker på "3" så kommer man välja intervall 1-50.
						System.out.println("Du valde intervallet 0-50,");
						maxIntervall = 50;
						break;
					}

					else if (intervall == 4) { //Om man trycker på "4" så kommer man välja intervall 1-75.
						System.out.println("Du valde intervallet 0-75,");
						maxIntervall = 75;
						break;
					}

					else if (intervall == 5) { //Om man trycker på "5" så kommer man välja intervall 1-100.
						System.out.println("Du valde intervallet 0-100,");
						maxIntervall = 100;
						break;
					
					} else {
						System.out.println("fel tal, välj ett mellan 1 och 5!");

					}
				} while (true); // Skapar en do-while loop som fångar upp tal som inte finns inom valen så att programmet inte kraschar, och använderen kan även välja igen.

				System.out.println("\nVälj svårhetsgrad:"); //Efter att man har valt intervall så ska man välja svårhetsgrad.

				
				//Här väljer man svårhetsgrad.
				do {
					//Man får välja mellan 3 svårhetsgrader.
					System.out.println(" (1) Easy - 10 gissningar");
					System.out.println(" (2) Medium - 5 gissningar");
					System.out.println(" (3) Hard - 3 gissningar");

					int choice = getValidInput(); //Skapar en "choice" variabel, och sätter in trycatch metoden istället för "input.nextInt();".

					if (choice == 1) { 
						System.out.println("Du valde Easy");
						gömd(10, maxIntervall);// Om man trycker "1" får man Easy och har därmed 10 försök på sig.
						break;
					}

					if (choice == 2) {
						System.out.println("Du valde Medium");
						gömd(5, maxIntervall); // Om man trycker "2" får man Easy och har därmed 5 försök på sig.
						break;
					}

					if (choice == 3) {
						System.out.println("Du valde Hard");
						gömd(3, maxIntervall); // Om man trycker "3" får man Easy och har därmed 3 försök på sig.
						break;
					}

					System.out.println("Välj mellan 1-3!");

				} while (true); // Skapar en do-while loop som fångar upp tal som inte finns inom valen så att programmet inte kraschar, och använderen kan även välja igen.

				break;

			case 2:
				//Spelets instruktioner
				game = "Instruktioner";
				System.out.println("Du valde att se " + game + ":\n");
				System.out.println("(1) Först startar du programmet");
				System.out.println("(2) Sedan väljer du vilket intervall du vill ha");
				System.out.println(
						"(3) Välj sedan svårhetsgrad (Easy, Medium och Hard) vilket är antalet gågner du kan gissa fel");
				System.out.println("(4) Tryck på ''Play''");
				System.out.println("(5) Skriv in en siffra inom ditt intervall");
				System.out.println(
						"(6) Om det står ''Lower'' ska du gissa lägre, står det ''Higher'' ska du gissa högre");
				System.out.println("(7) Gissar du rätt är spelet klart, men gissar du fel får du börja om");
				System.out.println();
				System.out.println("**Tryck på 0 för att återvända till menyn**");
				
				do {
					int GoBack = getValidInput(); // Skapar en variabel och en if-sats som gör att om man trycker på "0" så återvänder man till main menyn.
					if (GoBack == 0) {
						break;
					}
				} while (true); //Gör en do-while så att man skall kunna återvända till menyn oavsett om man spammar andra siffror.

				break;
			
			case 3: //Credits

				game = "Credits";
				System.out.println("Du valde att se " + game + ":\n");
				System.out.println("Skapare: Pedram Khanzaden");
				System.out.println("Medverkare: Donald Trump, Albert Einstein, Tom Cruise");
				System.out.println();
				System.out.println("**Tryck på 0 för att återvända till menyn**");
				
				do {
					int GoBack = getValidInput(); // Skapar en variabel och en if-sats som gör att om man trycker på "0" så återvänder man till main menyn.
					if (GoBack == 0) {
						break;
					}
				} while (true);//Gör en do-while så att man skall kunna återvända till menyn oavsett om man spammar andra siffror.

				break;

			case 4:
				//Här får man valet att kunna avsluta spelet.
				game = "Avsluta Spel";
				System.out.println("Du valde att " + game + "\n     Är du säker?");
				System.out.println();
				System.out.println("  Ja:1         Nej:0");

				do {
					//Om man trycker på "1" avslutas spelet, och om man trycker på "0" så skickas man tillbaka till menyn.
					int GoBack = getValidInput();
					if (GoBack == 1) {
						System.out.println("Spelet är avlutat.");
						input.close();
						System.exit(0);
					}
					if (GoBack == 0) {
						
						break;
					}
				} while (true);//Gör en do-while så att programmet inte ska bugga om man trycker på ett annat tal än 0 och 1. Om man trycker på rätt tal kommer man ur loopen och programmet fungerar som vanligt.

				break;
			default:
				System.out.println("Gör ett val mellan 1-4");// Detta skrivs om man skriver något annat än 1,2,3 och 4.
				break;

			}

		} while (true);

	}

	/**Denna metod är en trycatch som identiferar fel input och informerar spelaren om att den skall skriva ett giltligt tal.
	 * 
	 * @return trycatch
	 */
	private static int getValidInput() {
		int trycatch;
		while (true) {    
			try {
				trycatch = input.nextInt(); // Här byter jag ut "input.nextInt();" till trycatch för att testa om det är en siffra.
				input.nextLine();
				return trycatch;
			} catch (Exception e) {   //Om man skriver in en bokstav så ber den spelaren att väja ett giltligt tal.
				System.out.println("Välj ett giltligt tal!");
				input.nextLine();
			}
		}

	}

	/**Denna metod innehåller själva spelet
	 * 
	 * @param gissningar
	 * @param intervall
	 * @return 
	 */
	public static int gömd(int gissningar, int intervall) {

		Random random = new Random(); 
		Scanner input = new Scanner(System.in);

		long nummer = (long) Math.round(Math.random() * intervall); //Gör ett radom tal och multiplicerar det med det valda intervallet.

		if (nummer == 0) { 
			nummer++;
		}

		int Gömtnummer = random.nextInt(intervall) + 1; //Här är variabeln "Gömtnummer" som är ett slumpmässigt tal inom det valda intervallet.

		System.out.println("Gissa nummret mellan 1 - " + intervall);

		int gissa = 0; 
		for (int i = 0; i < gissningar; i++) {

			gissa = getValidInput(); //Lägger in min trycatch metod istället för "input.nextInt();" för att den skall fånga fel input.

			if (gissa == Gömtnummer) { // denna if sats innebär om spelarens gissning är rätt tal skall programmet svara att man gissade rätt.
				System.out.println("Grattis! Du svarade rätt!");
				break;

			}

			else if (gissa < Gömtnummer) { 
				if (i == gissningar - 1) { 

				} else { //Om spelarens gissning är för låg så skriver programmet att man ska gissa högre.
					System.out.println("För lågt, gissa högre");
				}
			}

			else if (gissa > Gömtnummer) {
				if (i == gissningar - 1) {

				} else { //Om spelarens gissning är för hög så skriver programmet att man ska gissa högre.
					System.out.println("För högt, gissa lägre");
				}
			}

		}

		System.out.println();
		if (gissa == Gömtnummer) {

		} else { //Om man inte gissar rätt skriver programmet ut det rätta svaret och man kan inte gissa längre. 
			System.out.println("Du gissade fel, " + Gömtnummer + " är det rätta svaret!");
		}
		System.out.println("(1) Spela igen");
		System.out.println("(2) Avsluta spel");

		do {
			int end = getValidInput();

			switch (end) { //Gör en till swich-case för att ge spelaren alternativet att börja om eller stänga av spelet.

			case 1: //Trycker man "1" så kopplas man till meny-metoden och kommer tillbaka till början av koden.
				meny(); 

				break;

			case 2: //Trycker man "2" så avslutas spelet.

				System.out.println("Spelet är avslutat, tack för att du har spelat :D");
				System.exit(0);

			}
		} while (true);

	}
}