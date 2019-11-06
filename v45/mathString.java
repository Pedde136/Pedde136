import java.util.Scanner;

public class mathString {

public static void main(String[] args) {
	
double a = "7";
double b = "3";

double svar = Math.sqrt((Math.pow(3, 2) + 4));

System.out.println("Svar:" + svar);

Math.max(3, 7);

String mening = "Tomas är dum men taskig";

System.out.println(mening);

Scanner input = new Scanner(System.in);

String mening2 = input.nextLine();

if(mening.equals(mening2)) {
	System.out.println("samma mening");
}

System.out.println(mening.length());
System.out.println(mening.toUpperCase());
System.out.println("TomAs Kan inTe StAva".toLowerCase());
System.out.println("Tomas är dum!".contains("Tomas"));
System.out.println("    TomaS är dUm    ".trim());
System.out.println("    TomaS är dUm    ".trim().toLowerCase());
System.out.println("Tomas är bra".replace('a', 'B'));

int a = 7;
int b = 3;

double answer = (double) a / (double) b;

String c = "7";
String d = "3";

System.out.println(answer);
	
	
	
}

}
