package homework;

import java.util.Scanner;

public abstract class HomeworkTwo {

	public static void main(String[] args) {

		double number1 = 0;
		double number2 = 0;
		double number3 = 0;
		double number4 = 0;
		double number5 = 0;
		double big = 0;
		double small = 0;
		double average = 0;
		
		Scanner input = new Scanner(System.in);

		
		
		
		
		System.out.println("Skriv in fem heltal.");
		
		number1 = input.nextInt();
		number2 = input.nextInt();
		number3 = input.nextInt();
		number4 = input.nextInt();
		number5 = input.nextInt();
		
		if (number1 >= number2 && number1 >= number3 && number1 >= number4 && number1 >= number5) {
		big = number1;
		
	}
		else if (number2 >= number1 && number2 >= number3 && number2 >= number4 && number2 >= number5) {
			big = number2;
			
		}
		else if (number3 >= number1 && number3 >= number2 && number3 >= number4 && number3 >= number5) {
			big = number3;
			
		}
		else if (number4 >= number1 && number4 >= number2 && number4 >= number3 && number4 >= number5) {
			big = number4;
			
		}
		
		else if (number5 >= number1 && number5 >= number2 && number5 >= number3 && number5 >= number4) {
			big = number5;
			
		}
		
		
		
		
		

		if (number1 <= number2 && number1 <= number3 && number1 <= number4 && number1 <= number5) {
		small = number1;
		
	}
		else if (number2 <= number1 && number2 <= number3 && number2 <= number4 && number2 <= number5) {
			small = number2;
			
		}
		else if (number3 <= number1 && number3 <= number2 && number3 <= number4 && number3 <= number5) {
			small = number3;
			
		}
		else if (number4 <= number1 && number4 <= number2 && number4 <= number3 && number4 <= number5) {
			small = number4;
			
		}
		
		else if (number5 <= number1 && number5 <= number2 && number5 <= number3 && number5 <= number4) {
			small = number5;
			
		}
		
		
		
		double average1 = (number1 + number2 + number3 + number4 + number5)/5;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
System.out.println("Största talet: " + big );
System.out.println("Minsta talet: " + small);
System.out.println("Medelvärde: " + average1);






}
}