import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Slutuppgift {

	public static ArrayList<String> _easySwe = new ArrayList <String> (Arrays.asList(new String []{ "hej", "tja", "gook" }));  
	public static ArrayList<String> _mediumSwe = new ArrayList <String> (Arrays.asList(new String []{ "hejsan", "tjena", "gooken" }));  
	public static ArrayList<String> _hardSwe = new ArrayList <String> (Arrays.asList(new String []{ "hejsvejs", "tjenare", "gookarnas" })); 
	public static ArrayList<String> _easyEng = new ArrayList <String> (Arrays.asList(new String []{ "hey", "yo", "gooc" }));  
	public static ArrayList<String> _mediumEng = new ArrayList <String> (Arrays.asList(new String []{ "hello", "waddup", "goocc" }));  
	public static ArrayList<String> _hardEng = new ArrayList <String> (Arrays.asList(new String []{ "howdey", "wassaaaap", "gooccc" })); 
	public static ArrayList<String> swedishOuts = getSwedishStrings();
	public static ArrayList<String> englishOuts = getEnglishStrings();
	public static ArrayList<String> _outputStrings = new ArrayList<>();
	static boolean swedish = true;
	static Scanner input = new Scanner(System.in);
	static int difficulty;
	static int guesses;
	static String blankword = "";
	static int language = 1;
	private static ArrayList <String> _wordList = new ArrayList<String>();
	public static void main(String[] args) {
		while (true) {
			_outputStrings = swedishOuts;
			meny();
		}
	}

	
	public static void meny() {
		do {
			_wordList.clear();
			blankword = "";
			System.out.println(_outputStrings.get(0));
			System.out.println();
			System.out.println(_outputStrings.get(1));
			System.out.println(_outputStrings.get(2));
			System.out.println(_outputStrings.get(3));
			System.out.println(_outputStrings.get(4));
			System.out.println(_outputStrings.get(5));
			System.out.println(_outputStrings.get(6));

			int mainChoice = GetValidInput();

			switch (mainChoice) {

			case 1:

				DifficultyAndGuesses();
				Game();

				break;

			case 2: // klar

				System.out.println(_outputStrings.get(7));

				System.out.println(
						_outputStrings.get(8));
				System.out.println();
				System.out.println(
						_outputStrings.get(9));
				System.out.println(
						_outputStrings.get(10));
				System.out.println(_outputStrings.get(11)
						);
				System.out.println(
						);
				System.out.println(
						"(5) Om rätt, så skrivs den rätta bokstaven in i ordet                       (5) Om fel, så får gubben en kroppsdel");
				System.out.println(
						"(6) Alla bokstäver som har gissats antecknas bredivd                        (6)Om rätt, så skrivs den rätta bokstaven in i ordet");
				System.out.println(
						"(7) Om dina gissningar tar slut blir gubben fullständig och du förlorar     (7) Om dina gissningar tar slut blir gubben fullständig och spelare 2 vinner");
				System.out.println(
						"(8) Om du gissar rätt på ordet innan gissningarna tar slut så vinner du     (8) Om du gissar rätt på ordet innan gissningarna tar slut så vinner spelare 1");
				System.out.println(
						"(9) Därefter får du alternativet att börja om eller avsluta spelet          (9) Därefter får du alternativet att börja om eller avsluta spelet");

				System.out.println();

				System.out
						.println("                                       **Tryck på 0 för att återvända till menyn**");

				do {
					int GoBack = GetValidInput();
					if (GoBack == 0) {
						break;
					} else {
						System.out.println("Ogiltligt tal!");
					}
				} while (true);
				break;

			case 3: // klar ish

				String[] SvenskaOrd = { "hej", "tja", };

				System.out.println("Alla väljbara ord:");
				System.out.println();
				System.out.println("Svesnak Ord:");
				for (int i = 0; i < SvenskaOrd.length; i++) {
					System.out.println(SvenskaOrd[i]);
				}
				System.out.println();
				System.out.println("**Tryck på 0 för att återvända till menyn**");

				do {
					int GoBack = GetValidInput();
					if (GoBack == 0) {
						break;
					} else {
						System.out.println("Ogiltligt tal!");
					}
				} while (true);
				break;

			case 4: // klar ish

				System.out.println("               Välj Språk:");
				System.out.println();
				System.out.println("     (1)Svenska         (2)Engelska");
				System.out.println();
				System.out.println("**Tryck på 0 för att återvända till menyn**");

				do {
					language = GetValidInput();

					if (language == 1) {
						System.out.println("Du valde Svenska");
						_outputStrings = swedishOuts;
					} else if (language == 2) {
						System.out.println("You chose English");
						_outputStrings = englishOuts;
					}

					int GoBack = GetValidInput();
					if (GoBack == 0) {
						break;
					} else {
						System.out.println("Ogiltligt tal!");
					}
				} while (true);
				break;

			case 5: // klar

				System.out.println("Du valde att se n");
				System.out.println("Skapare: Pedram ''THE CHAMP'' Khanzaden");
				System.out.println("Medverkare: Ashkabani, Klashko, Zwallt, Nill Kiggerson, Floyd Mayweather");
				System.out.println();
				System.out.println("**Tryck på 0 för att återvända till menyn**");

				do {
					int GoBack = GetValidInput();
					if (GoBack == 0) {
						break;
					} else {
						System.out.println("Ogiltligt tal!");
					}
				} while (true);
				break;

			case 6: // klar
				System.out.println("Du valde att Avsluta Spel \n     Är du säker?");
				System.out.println();
				System.out.println("  Ja:1         Nej:0");

				do {
					int GoBack = GetValidInput();
					if (GoBack == 1) {
						System.out.println("Spelet är avlutat.");
						input.close();
						System.exit(0);
					}
					if (GoBack == 0) {

						break;
					} else {
						System.out.println("Ogiltligt tal!");
					}
				} while (true);

			}

		} while (true);
	}

	public static void DifficultyAndGuesses() {

		System.out.println("Välj Svårhetsgrad:");
		do {

			System.out.println();

			System.out.println(" (1) Easy   - Normala Enkla Ord -");
			System.out.println(" (2) Medium - Kortare Sällan Använda Ord -");
			System.out.println(" (3) Hard   - Mycket Svåra Samt Sällan Använda Ord -");

			difficulty = GetValidInput();

			setUpWordList();			
			if (difficulty == 1) {
				
				System.out.println("Du valde Easy.");

				break;
			}

			else if (difficulty == 2) {
				System.out.println("Du valde Medium.");

				break;
			}

			else if (difficulty == 3) {
				System.out.println("Du valde Hard.");

				break;
			}

			System.out.println("Välj mellan 1-3!");

		} while (true);

		System.out.println();

		System.out.println("Välj Antal Gissningar:");
		do {

			System.out.println();
			System.out.println(" (1) Easy   - 15 Gissningar -");
			System.out.println(" (2) Medium - 10 Gissningar -");
			System.out.println(" (3) Hard   - 8 Gissningar -");

			guesses = GetValidInput();

			if (guesses == 1) {
				System.out.println("Du valde 15 Gissningar");
				guesses = 15;
				break;
			}

			if (guesses == 2) {
				System.out.println("Du valde 10 Gissningar");
				guesses = 10;
				break;
			}

			if (guesses == 3) {
				System.out.println("Du valde 8 Gissningar");
				guesses = 8;
				break;
			}

			System.out.println("Välj mellan 1-3!");

		} while (true);

	}

	private static void setUpWordList() {

		switch(difficulty) {
		
			case 1:
				_wordList  = language == 1 ? _easySwe : _easyEng;
				break;	
				
			case 2:
				_wordList  = language == 1 ? _mediumSwe : _mediumEng;
				break;
				
			case 3:
				_wordList  = language == 1 ? _hardSwe : _hardEng;
				break;
			
		}
		
	}

	public static void Game() {

		ArrayList<String> saveguesses = new ArrayList<String>();

		ArrayList<String> wrongguesses = new ArrayList<String>();

		
		String hiddenAnswer = "";
		
			Random slump = new Random();
			int index = slump.nextInt(_wordList.size());
			hiddenAnswer = _wordList.get(index).toUpperCase();



		System.out.println(hiddenAnswer);

		setUpBlankword(hiddenAnswer.length());

		saveguesses.clear();
		wrongguesses.clear();
		
		for (int tries = 0; tries < guesses; tries++) {
			String guess = input.nextLine().toUpperCase();

			if (guess.length() != 1) {
				System.out.println("You can only guess one letter!");
				
				tries--;
				
				continue;

			}

			// Gissat rätt!
			findCharInWord(hiddenAnswer, guess.toCharArray()[0], hiddenAnswer.length(), saveguesses, wrongguesses);
			System.out.println("Gissningar kavr: " + (guesses - tries));
			saveguesses.add(guess);
			System.out.println(blankword);
			if (blankword.equals(hiddenAnswer)) {

				System.out.println("Grattis du gissade rätt!");
				break;
			}
		}
	}

	/**
	 * Visar hur långt ordet är
	 * 
	 * @param amountOfLetters
	 */
	private static void setUpBlankword(int amountOfLetters) {
		for (int i = 0; i < amountOfLetters; i++) {
			blankword += "*";

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
			ArrayList<String> wrongguesses) {

		char[] blankwordlist = blankword.toCharArray();

		for (int i = 0; i < word.toCharArray().length; i++) {
			if (word.charAt(i) == guess) {
				if (!saveguesses.contains(Character.toString(guess))) {

					blankwordlist[i] = guess;

				}

			} else if (!wrongguesses.contains(Character.toString(guess))) {

				wrongguesses.add(Character.toString(guess));
			}
		}

		blankword = String.copyValueOf(blankwordlist);
		System.out.println("gissningar: " + wrongguesses );

	}

	private static int GetValidInput() {
		int trycatch;
		while (true) {
			try {
				trycatch = input.nextInt();
				input.nextLine();
				return trycatch;
			} catch (Exception e) {
				System.out.println("Välj ett giltligt tal!");
				input.nextLine();
			}
		}

	}

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

		out.add("SinglePlayer:                                                               Multiplayer:");

		out.add("(1) Tryck 'Play'                                                            (1) Tryck 'Play'");

		out.add("(2) Välj svårhetsgrad (påverkar längden av ord samt antal försök)           (2) Låt spelare 2 skriva in ett ord");

		out.add("(3) Gissa på en bokstav                                                     (3) Därefter blir ordet osebart");

		out.add("(4) Om fel, så får gubben en kroppsdel                                      (4) Spelare 1 kan nu gissa");
		
		out.add("");
		
		out.add("");
		
		out.add("");
		
		out.add("");
		
		out.add("");

		return out;

	}

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
		
		out.add("SinglePlayer:                                                               Multiplayer:");
		
		out.add("(1) Press 'Play'                                                            (1) Press 'Play'");
		
		out.add("(2) Select difficulty (affects the length of words and number of attempts)  (2) Let player 2 enter a word");
		
		out.add("(3) Guess a letter                                                          (3) Then the word becomes invisible");
		
		out.add("(4) If wrong, the old man gets a body part                                  (4) Player 1 can now guess");
		
		out.add("");
		
		out.add("");
		
		out.add("");
		
		out.add("");
		
		out.add("");

		return out;
	}

}