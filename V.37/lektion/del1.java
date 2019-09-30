package lektion;

import java.util.Scanner;

public class del1 {

	public static void main(String[] args) {

		boolean again = true;
		int age = 1;
		int age1 = 0;

		Scanner input = new Scanner(System.in);

		if (again) {

			System.out.println("Hur gammal är du?");
			age = input.nextInt();

			if (age >= 18) {
				System.out.println("Du är gammal nog att köra bil! Grattis din lilla lömska gamla grek.");
				System.out.println("Bara så du vet, du kan även åka moppe :D");
			}

			else if (age > 14 && age < 18) {
				System.out.println("Du är för ung för att köra bil, men du kan köra moped.");
			}

			else {
				System.out.println("Tyvär, du får inte köra bil");

			}
		}
	}
}


