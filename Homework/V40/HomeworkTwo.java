package V40;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1 = input.nextInt();
		int num2 = input.nextInt();

		if (num1 > 0 && num2 > 0) {
			System.out.println(1);

		} else if (num1 < 0 && num2 > 0) {
			System.out.println(2);
		}

		else if (num1 < 0 && num2 < 0) {
			System.out.println(3);
		}

		else if (num1 > 0 && num2 < 0) {
			System.out.println(4);

		}
	}
}
