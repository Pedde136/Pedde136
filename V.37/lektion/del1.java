package lektion;

import java.util.Scanner;

public class del1 {

	public static void main(String[] args) {

		boolean again = true;
		int age = 1;
		int age1 = 0;

		Scanner input = new Scanner(System.in);

		if (again) {

			System.out.println("Hur gammal �r du?");
			age = input.nextInt();

			if (age >= 18) {
				System.out.println("Du �r gammal nog att k�ra bil! Grattis din lilla l�mska gamla grek.");
				System.out.println("Bara s� du vet, du kan �ven �ka moppe :D");
			}

			else if (age > 14 && age < 18) {
				System.out.println("Du �r f�r ung f�r att k�ra bil, men du kan k�ra moped.");
			}

			else {
				System.out.println("Tyv�r, du f�r inte k�ra bil");

			}
		}
	}
}


