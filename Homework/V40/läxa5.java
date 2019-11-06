package V40;

import java.util.Scanner;

public class läxa5 {

	public static void main(String[] args) {
		lol();
		System.out.println(max());
		count();
		System.out.println(kelvin());
		FahrenheitToCelsius();
		AgeControl();
		stairs();

	}

	public static void lol() {

		String hej = "HAHAHAHAH";
		System.out.println(hej);
	}

	public static int max() {

		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		if (number1 > number2) {
			return number1;

		} else {
			return number2;

		}

	}

	public static void count() {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}

	}

	public static double kelvin() {

		Scanner input = new Scanner(System.in);

		double c = input.nextDouble();
		double k = c -= 273.15;

		return k;
	}

	public static void FahrenheitToCelsius() {

		Scanner input = new Scanner(System.in);

		double f = input.nextDouble();
		double c = (f - 32) * 5 / 9;
		System.out.println(c + " grader celsius");
	}

	public static void AgeControl() {

		Scanner input = new Scanner(System.in);

		int age = input.nextInt();
		if (age >= 0 && age <= 5) {
			System.out.println("Småbarn får inte göra något");

		} else if (age >= 6 && age <= 12) {
			System.out.println("Du får spela Fortnite");
		} else if (age >= 13 && age <= 14) {
			System.out.println("Du är tonåring");

		} else if (age >= 15 && age <= 17) {

			System.out.println("Du får köra moppe");
		} else if (age >= 18 && age <= 20) {

			System.out.println("Du får köra bil");
		} else if (age >= 21 && age <= 64) {

			System.out.println("Du får vuxenstraff om du gör något dumt");
		} else if (age >= 65 && age <= 99) {

			System.out.println("Du är pensionär");
		} else if (age >= 100) {

			System.out.println("R.I.P?");
		}

	}

	public static void stairs() {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv hur många steg trappan ska ha");
		int x = input.nextInt();

		String out = "";

		for (int i = 0; i <= x; i++) {
			for (int n = 1; n <= x - i; n++) {

				out += " ";

			}

			for (int a = 1; a <= i; a++) {
				out += "X";
			}
			System.out.println(out);
			out = "";
		}

	}

}