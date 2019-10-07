package V40;

import java.util.Scanner;

public class HomeworkFOURtwo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
 
		int del1 = input.nextInt();
		int del2 = input.nextInt();
		int antal = input.nextInt();

		for (int i = 1; i <= antal; i++) {

			if (i % del2 == 0 && i % del1 == 0) {
				System.out.println("FizzBuzz");
			}

			else if (i % del1 == 0) {
				System.out.println("Fizz");
			} else if (i % del2 == 0) {
				System.out.println("Buzz");
			} else if (i % del1 != 0 && i % del2 != 0) {
				System.out.println(i);
			}
		}
	}
}
