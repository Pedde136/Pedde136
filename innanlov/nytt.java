import java.util.Scanner;

public class nytt {

	public static void main(String[] args) {

		twoNumbers();

		int tal1;
		int tal2;

		Scanner input = new Scanner(System.in);

		System.out.println("Vänligen skriv in två heltal");

		tal1 = input.nextInt(); 
		tal2 = input.nextInt();

		System.out.println(minstaTal(tal1, tal2));

	}

	/**
	 * skriver två heltal och skickar vidare dem
	 */
	public static void twoNumbers() {

	}

	public static String minstaTal(int tal1, int tal2) {

		if (tal1 <= tal2) {
			System.out.println("Minsta talet är: " + tal1);
		} else {
			System.out.println("Minsta talet är: " + tal2);
		}

		String hej = "Metoden är klar";
		return hej;

	}
}