package V40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class betterHangman {

	public static ArrayList<String> _easySwe = new ArrayList<String>(Arrays.asList(new String[] { "hej", "tja", "gook" }));
	public static ArrayList<String> _mediumSwe = new ArrayList<String>(Arrays.asList(new String[] { "hejsan", "tjena", "gooken" }));
	public static ArrayList<String> _hardSwe = new ArrayList<String>(Arrays.asList(new String[] { "hejsvejs", "tjenare", "gookarnas" }));
	public static ArrayList<String> _easyEng = new ArrayList<String>(Arrays.asList(new String[] { "hey", "yo", "gooc" }));
	public static ArrayList<String> _mediumEng = new ArrayList<String>(Arrays.asList(new String[] { "hello", "waddup", "goocc" }));
	public static ArrayList<String> _hardEng = new ArrayList<String>(Arrays.asList(new String[] { "howdey", "wassaaaap", "gooccc", "#metoo" }));
	public static ArrayList<String> swedishOuts = getSwedishStrings();
	public static ArrayList<String> englishOuts = getEnglishStrings();
	public static ArrayList<String> _outputStrings = new ArrayList<>();
	static boolean swedish = true;
	static Scanner input = new Scanner(System.in);
	static int difficulty;
	static int totalGuesses;
	static String blankword = "";
	static int language = 1;
	private static ArrayList<String> _wordList = new ArrayList<String>();

	public static void main(String[] args) {
		while (true) {
			_outputStrings = swedishOuts;
			meny();
		}
	}

	/**
	 * Är själva menyn
	 */
	public static void meny() {
		do {
			_wordList.clear();
			blankword = "";
			menuAlternatives();

			int mainChoice = GetValidInput();

			switch (mainChoice) {

			case 1:

				DifficultyAndGuesses();
				Game();

				break;

			case 2:

				instructions();

				toMenu();

				break;

			case 3:

				seeTheWordlist();

				toMenu();
				break;

			case 4:

				selectLanguage();

				toMenu();

				break;

			case 5:

				credits();

				toMenu();
				break;

			case 6: // klar

				quitGame();

			}

		} while (true);
	}

	/**
	 * Denna metod innehåller val av svårhetsgrad och antal gissningar
	 */
	public static void DifficultyAndGuesses() {

		System.out.println(_outputStrings.get(25));
		do {

			System.out.println();

			System.out.println(_outputStrings.get(26));
			System.out.println(_outputStrings.get(27));
			System.out.println(_outputStrings.get(28));

			difficulty = GetValidInput();

			setUpWordList();
			if (difficulty == 1) {

				System.out.println(_outputStrings.get(29));

				break;
			}

			else if (difficulty == 2) {
				System.out.println(_outputStrings.get(30));

				break;
			}

			else if (difficulty == 3) {
				System.out.println(_outputStrings.get(31));

				break;
			}

			System.out.println(_outputStrings.get(32));

		} while (true);

		System.out.println();

		System.out.println(_outputStrings.get(33));
		do {

			System.out.println();
			System.out.println(_outputStrings.get(34));
			System.out.println(_outputStrings.get(35));
			System.out.println(_outputStrings.get(36));

			totalGuesses = GetValidInput();

			if (totalGuesses == 1) {
				System.out.println(_outputStrings.get(37));
				totalGuesses = 15;
				break;
			}

			if (totalGuesses == 2) {
				System.out.println(_outputStrings.get(38));
				totalGuesses = 10;
				break;
			}

			if (totalGuesses == 3) {
				System.out.println(_outputStrings.get(39));
				totalGuesses = 8;
				break;
			}

			System.out.println(_outputStrings.get(32));

		} while (true);

	}

	/**
	 * Denna metod väljer srpåkets orlista
	 */
	private static void setUpWordList() {

		switch (difficulty) {

		case 1:
			_wordList = language == 1 ? _easySwe : _easyEng; // Om language är 1 så ska den välja ordlistan _easyswe
																// (enkla svenska listan, annrs ska den välja den
																// engelska.
			break;

		case 2:
			_wordList = language == 1 ? _mediumSwe : _mediumEng; // Om language är 1 så ska den välja ordlistan
																	// _mediumswe (mellan svåra svenska listan), annrs
																	// ska den välja den engelska.
			break;

		case 3:
			_wordList = language == 1 ? _hardSwe : _hardEng; // Om language är 1 så ska den välja ordlistan _hardswe
																// (svåra svenska listan), annrs ska den välja den
																// engelska.
			break;

		}

	}

	/**
	 * Denna metod är själva spelet
	 */
	public static void Game() {

		ArrayList<String> saveguesses = new ArrayList<String>(); // Denna array kommer innehålla alla gissningar
																	// användaren gör.

		ArrayList<String> wrongguesses = new ArrayList<String>(); // Denna array kommer innehålla alla fel gissningar
																	// användaren gör.

		int winOrLoose = 0; // Gör en variabel som hanterar meny valet i slutet.

		String hiddenAnswer = "";

		Random random = new Random(); // Här skapar jag en random funktion
		int index = random.nextInt(_wordList.size()); // Här väljer den ett random index i arrayen
		hiddenAnswer = _wordList.get(index).toUpperCase(); // Här tar den det ordet och gör om den till "hiddenAnswer"

		setUpBlankword(hiddenAnswer.length()); // Hidden answer görs om till "_" och ersätter längden av ordet.

		saveguesses.clear(); // Här cleras dina gissningar eftersom att man vill förhindra att de ska sparas
								// om spelet körs igen.
		wrongguesses.clear();// Här cleras dina fel gissningar eftersom att man vill förhindra att de ska
								// sparas om spelet körs igen.

		for (int tries = 1; tries <= totalGuesses; tries++) { // Hela for-loopen gör att dina försök blir lika mycket
																// som dina totala gissningar.
			String guess = input.nextLine().toUpperCase();

			if (guess.length() != 1) { // Om din gissning är längre än ett ord så kommer det ett felmeddelande.
				System.out.println(_outputStrings.get(40));

				tries--; // Om gissningen är mer än en bokstav så tar den inte bort ett en gissning

				continue;

			}

			if (saveguesses.contains(guess)) { // Om saveguesses inehåller gissningen du redan gjort, så tar den inte
												// bort liv.
				tries--;

			}

			if (hiddenAnswer.contains(guess)) { // // Om det gömda ordet innehåller din gissning, så tar den inte bort
												// liv.

				tries--;

			}

			// Gissat rätt!
			findCharInWord(hiddenAnswer, guess.toCharArray()[0], hiddenAnswer.length(), saveguesses, wrongguesses,
					tries);
			System.out.println(_outputStrings.get(41) + (totalGuesses - tries)); // Visar hur många gissningar du har
																					// kvar
			saveguesses.add(guess); // Här läggs dina gissningar in i saveguesses
			System.out.println(blankword);
			if (blankword.equals(hiddenAnswer)) { // Om blankword innehåller det fullständiga gömda ordet så vinner du.
				winOrLoose = 1;
				break;
			}

			else {
				winOrLoose = 2;
			}

		}

		playAgain(winOrLoose);

	}

	/**
	 * Visar hur långt ordet är
	 * 
	 * @param amountOfLetters
	 */
	private static void setUpBlankword(int amountOfLetters) {
		for (int i = 0; i < amountOfLetters; i++) { // Ersätter ordets längd med blankwords
			blankword += "_";

		}
	}

	/**
	 * Sätter in gissningen i ordet
	 * 
	 * @param word
	 * @param guess
	 * @param amountOfLetters
	 */
	private static void findCharInWord(String word, char guess, int amountOfLetters, ArrayList<String> saveguesses,
			ArrayList<String> wrongguesses, int tries) {

		char[] blankwordlist = blankword.toCharArray();

		int onetime = 1;

		for (int i = 0; i < word.toCharArray().length; i++) { // For loopen körs så många gånger som det finns bokstäver
																// i ordet.
			if (word.charAt(i) == guess) { // Om gissningen finns i ordet så kollar den om den redan är gissad och
											// händer det inget, men om den inte finns där redan så läggs den till.
				if (!saveguesses.contains(Character.toString(guess))) {

					blankwordlist[i] = guess;

				}

			} else if (!wrongguesses.contains(Character.toString(guess))) { // Om dina fel gissninngar inte innehåller
																			// din gissning så lägger den till det i
																			// wrongguesses.

				wrongguesses.add(Character.toString(guess));

			}

			if (onetime == 1) { // Denna if satsen gör att en animaiton visas per fel gissning.

				if (word.charAt(i) != guess) { // Om gissningen inte finns i ordet så visas "case 1"

					hangManAnimation(tries);

					onetime = 2;

				}

			}

		}

		blankword = String.copyValueOf(blankwordlist); // Blankword får samma värde av blankwordlist
		System.out.println(_outputStrings.get(43) + wrongguesses); // visar dina gissningar

	}

	/**
	 * Fångar upp fel inputs
	 * 
	 * @return
	 */
	private static int GetValidInput() {
		int trycatch;
		while (true) {
			try {
				trycatch = input.nextInt();
				input.nextLine();
				return trycatch;
			} catch (Exception e) {
				System.out.println(_outputStrings.get(42));
				input.nextLine();
			}
		}

	}

	/**
	 * De tre olika animationerna till hangman
	 * 
	 * @param tries
	 */
	private static void hangManAnimation(int tries) {

		if (totalGuesses == 15) {

			switch (totalGuesses - tries) {

			case 14:
				System.out.println("=========");
				break;
			case 13:
				System.out.println("      +\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 12:
				System.out.println("     -+\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 11:
				System.out.println("    --+\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 10:
				System.out.println("   ---+\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 9:
				System.out.println("  +---+\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 8:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 7:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 6:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 5:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 4:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 3:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " / \\  |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 2:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /'\\  |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 1:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /|\\  |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 0:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /|\\  |\r\n"
						+ "  !   |\r\n" + "=========");
				break;
			}

		}

		else if (totalGuesses == 10) {

			switch (totalGuesses - tries) {

			case 9:
				System.out.println("=========");
				break;
			case 8:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 7:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 6:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 5:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 4:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 3:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 2:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /'\\  |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 1:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /!\\  |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 0:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /|\\  |\r\n"
						+ "  !   |\r\n" + "=========");
				break;
			}

		}

		else if (totalGuesses == 8) {

			switch (totalGuesses - tries) {

			case 7:
				System.out.println("=========");
				break;
			case 6:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 5:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 4:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 3:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 2:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 1:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n"
						+ "      |\r\n" + "=========");
				break;
			case 0:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /'\\  |\r\n"
						+ "      |\r\n" + "=========");
				break;
			}

		}
	}

	/**
	 * Innehåller de svenska dialogerna
	 * 
	 * @return
	 */
	private static ArrayList<String> getSwedishStrings() {
		ArrayList<String> out = new ArrayList<String>();

		out.add("Tryck på någon av alternativen nedan för att börja :D");

		out.add("(1) - Starta Spel");

		out.add("(2) - Instruktioner");

		out.add("(3) - Ordlista");

		out.add("(4) - Språk");

		out.add("(5) - Credits");

		out.add("(6) - Avsluta Spel");

		out.add("Du valde att se instruktioner");

		out.add("SinglePlayer: ");

		out.add("(1) Tryck 'Play'");

		out.add("(2) Välj svårhetsgrad (påverkar längden av ord samt antal försök)");

		out.add("(3) Gissa på en bokstav");

		out.add("(4) Om fel, så får gubben en kroppsdel"); // 12

		out.add("(5) Om rätt, så skrivs den rätta bokstaven in i ordet");

		out.add("(6) Alla bokstäver som har gissats antecknas bredivd");

		out.add("(7) Om dina gissningar tar slut blir gubben fullständig och du förlorar");

		out.add("(8) Om du gissar rätt på ordet innan gissningarna tar slut så vinner du");

		out.add("(9) Därefter får du alternativet att börja om eller avsluta spelet");

		out.add("Du valde att se 'Credits' \n");

		out.add("Skapare: Pedram ''THE CHAMP'' Khanzaden");

		out.add("Medverkare: Ashkabani, Klashko, Nill Kiggerson, Floyd Mayweather");

		out.add("Du valde att 'Avsluta Spel' \n     Är du säker?");

		out.add("  Ja:1         Nej:0");

		out.add("Spelet är avlutat.");

		out.add("                                       **Tryck på 0 för att återvända till menyn** \n");

		out.add("Välj Svårhetsgrad:");

		out.add(" (1) Easy   - Normala Enkla Ord -");

		out.add(" (2) Medium - Kortare Sällan Använda Ord -");

		out.add(" (3) Hard   - Mycket Svåra Samt Sällan Använda Ord -");

		out.add("Du valde 'Easy'.");

		out.add("Du valde 'Medium'.");

		out.add("Du valde 'Hard'.");

		out.add("Välj mellan 1-3!");

		out.add("Välj Antal Gissningar:");

		out.add(" (1) Easy   - 15 Gissningar -");

		out.add(" (2) Medium - 10 Gissningar -");

		out.add(" (3) Hard   - 8 Gissningar -");

		out.add("Du valde 15 Gissningar");

		out.add("Du valde 10 Gissningar");

		out.add("Du valde 8 Gissningar");

		out.add("Du kan bara gissa på en bokstav!");

		out.add("Gissningar kvar: ");

		out.add("Välj ett giltligt tal!");

		out.add("Totala Gissningar: ");

		out.add("Ogiltligt tal!");

		out.add("Alla väljbara ord:");

		out.add("Enkla ord: ");

		out.add("Mellansvåra ord: ");

		out.add("Svåra ord: ");

		out.add("              Välj Språk:");

		out.add("     (1)Svenska         (2)Engelska");

		out.add("                       Du vann!");

		out.add("                      Du förlorade");

		out.add("(1) Återvänd till menyn          (2) Avsluta spel \n \n \n");

		return out;

	}

	/**
	 * Innehåller de engelska dialogerna
	 * 
	 * @return
	 */
	private static ArrayList<String> getEnglishStrings() {
		ArrayList<String> out = new ArrayList<String>();

		out.add("Choose one of the options below to start :D");

		out.add("(1) - Start Game");

		out.add("(2) - Instructions");

		out.add("(3) - Wordlist");

		out.add("(4) - Language");

		out.add("(5) - Credits");

		out.add("(6) - Quit Game");

		out.add("You chose to see instructions");

		out.add("SinglePlayer:");

		out.add("(1) Press 'Play'");

		out.add("(2) Select difficulty (affects the length of words and number of attempts)"); // 10

		out.add("(3) Guess a letter");

		out.add("(4) If wrong, the hang man gets a body part");

		out.add("(5) If correct, the right letter is placed is in the word");

		out.add("(6) Every guessed letter is displayed beside");

		out.add("(7) If you run out of guesses the hangman will be complete which will make you loose");

		out.add("(8) If you guess the word before your guesses runs out you win");

		out.add("(9) After that you get the alternative to re-start the game or to quit");

		out.add("You choose to see 'Credits' \n");

		out.add("Creator: Pedram ''THE CHAMP'' Khanzaden");

		out.add("Co-creator: Ashkabani, Klashko, Zwallt, Nill Kiggerson, Floyd Mayweather");

		out.add("You chose to 'Quit Game' \n     Are you sure?");

		out.add("  Yes:1         No:0");

		out.add("Game has quit.");

		out.add("                                       **Press 0 to return to the main menu** \n");

		out.add("Choose Difficulty:");

		out.add(" (1) Easy   - Normal Easy words -");

		out.add(" (2) Medium - Harder not usually used words -");

		out.add(" (3) Hard   - Very hard and unusual words -");

		out.add("You chose 'Easy'.");

		out.add("You chose 'Medium'.");

		out.add("You chose 'Hard'.");

		out.add("Choose between 1-3!");

		out.add("Choose ammount of Guesses:");

		out.add(" (1) Easy   - 15 Guesses -");

		out.add(" (2) Medium - 10 Guesses -");

		out.add(" (3) Hard   - 8 Guesses -");

		out.add("You chose 15 Guesses");

		out.add("You chose 10 Guesses");

		out.add("You chose 8 Guesses");

		out.add("You can only guess one letter!");

		out.add("Guesses left: ");

		out.add("Choose a valid in Integer!");

		out.add("Total Guesses: ");

		out.add("Invalid integer!");

		out.add("Choosible words");

		out.add("Easy words: ");

		out.add("Medium words: ");

		out.add("Hard words: ");

		out.add("            Choose Language:");

		out.add("     (1)Swedish         (2)English");

		out.add("                   You Won!");

		out.add("                   You Lost!");

		out.add("(1) Return to menu          (2) Quit Game \n \n \n");

		return out;
	}

	/**
	 * Innehåller instruktionerna
	 */
	public static void instructions() {

		System.out.println(_outputStrings.get(7));
		System.out.println(_outputStrings.get(8));
		System.out.println(_outputStrings.get(9));
		System.out.println(_outputStrings.get(10));
		System.out.println(_outputStrings.get(11));
		System.out.println(_outputStrings.get(12));
		System.out.println(_outputStrings.get(13));
		System.out.println(_outputStrings.get(14));
		System.out.println(_outputStrings.get(15));
		System.out.println(_outputStrings.get(16));
		System.out.println(_outputStrings.get(17));
		System.out.println();

	}

	/**
	 * Gör att man kan återvända till menyn
	 */
	public static void toMenu() {

		System.out.println(_outputStrings.get(24));

		do {
			int GoBack = GetValidInput();
			if (GoBack == 0) {
				break;
			} else {
				System.out.println(_outputStrings.get(44));
			}
		} while (true);

	}

	/**
	 * Gör så att man kan se ordlistan
	 */
	public static void seeTheWordlist() {

		if (language == 1) {

			System.out.println(_outputStrings.get(45));
			System.out.println();

			System.out.println(_outputStrings.get(46) + _easySwe.toString());
			System.out.println(_outputStrings.get(47) + _mediumSwe.toString());
			System.out.println(_outputStrings.get(48) + _hardSwe.toString());
		}

		else if (language == 2) {

			System.out.println(_outputStrings.get(45));
			System.out.println();

			System.out.println(_outputStrings.get(46) + _easyEng.toString());
			System.out.println(_outputStrings.get(47) + _mediumEng.toString());
			System.out.println(_outputStrings.get(48) + _hardEng.toString());

		}
		System.out.println();
	}

	/**
	 * dialog där det står vad för språk som finns
	 */
	public static void selectLanguage() {

		System.out.println(_outputStrings.get(49));
		System.out.println();
		System.out.println(_outputStrings.get(50));

		do {
			language = GetValidInput();

			if (language == 1) {
				System.out.println("Du valde Svenska");
				_outputStrings = swedishOuts;
				break;

			} else if (language == 2) {
				System.out.println("You chose English");
				_outputStrings = englishOuts;
				break;
			}
		} while (true);

	}

	/**
	 * dialog där det står vilka som bidrog till spelet.
	 */
	public static void credits() {

		System.out.println(_outputStrings.get(18));
		System.out.println(_outputStrings.get(19));
		System.out.println(_outputStrings.get(20));
		System.out.println();
	}

	/**
	 * Gör så att man kan spela igen eller avsluta spelet
	 * 
	 * @param winOrLoose
	 */
	public static void playAgain(int winOrLoose) {

		System.out.println();

		switch (winOrLoose) { // Gör en switchcase som visar om du vann eller inte

		case 1:
			System.out.println(_outputStrings.get(51));

			break;

		case 2:
			System.out.println(_outputStrings.get(52));

			break;
		}
		System.out.println();
		System.out.println(_outputStrings.get(53));

		do { // Gör en do-while som fångar upp svar som är något annat än 1 och 2.

			switch (GetValidInput()) { // Här väljer du om du vill spela igen eller inte.

			case 1:
				meny();

				break;

			case 2:
				System.out.println(_outputStrings.get(23));
				System.exit(0);

			}
		} while (true);

	}

	public static void menuAlternatives() {

		System.out.println(_outputStrings.get(0));
		System.out.println();
		System.out.println(_outputStrings.get(1));
		System.out.println(_outputStrings.get(2));
		System.out.println(_outputStrings.get(3));
		System.out.println(_outputStrings.get(4));
		System.out.println(_outputStrings.get(5));
		System.out.println(_outputStrings.get(6));
	}

	public static void quitGame() {

		System.out.println(_outputStrings.get(21));
		System.out.println();
		System.out.println(_outputStrings.get(22));

		do {
			int GoBack = GetValidInput();
			if (GoBack == 1) {
				System.out.println(_outputStrings.get(23));
				input.close();
				System.exit(0);
			}
			if (GoBack == 0) {

				break;
			} else {
				System.out.println(_outputStrings.get(44));
			}
		} while (true);
	}
}