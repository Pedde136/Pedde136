package V40;

import java.util.Scanner;

public class HomeworkFOURone {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int h = input.nextInt();
		int m = input.nextInt();

		m -= 45;

		if (m < 0) {

			m += 60;
			h -= 1;
		}

		if (h < 0)
			h = 23;

		System.out.println(h + " " + m);

	}

}
