public class InlämningsUppgift {

	public static void main(String[] args) {
		System.out.println(FtoK(100));
		System.out.println(KtoC(0));
		System.out.println(velocityConversion(90));
		System.out.println(kineticEnergy(2, 2));
		System.out.println(potentialEnergy(2, 5));
		System.out.println(delta(1, 5, 9));
		System.out.println(("PaParaZZi").trim().toLowerCase());
		System.out.println(("Jag vill bli godkänd i programmering! <3").replace("o", "0").trim().toUpperCase());
		System.out.println(svtTime(10, 2));
		System.out.println(work(50, 10));
		System.out.println(velocityToHeight(9.82));
		System.out.println(sphereVolumeToRadius(20));
		System.out.println(triangle(5, 2));
		System.out.println(square(5, 2));
	}

	/**
	 * Omvandlar Fahrenheit till Kelvin
	 * 
	 * @param fahrenheit
	 * @return
	 */
	public static double FtoK(double fahrenheit) {
		double kelvin = (fahrenheit + 459.67) * 5 / 9;
		return kelvin;
	}

	/**
	 * Omvandlar kelvin till Celsius
	 * 
	 * @param kelvin
	 * @return
	 */
	public static double KtoC(double kelvin) {
		double celsius = (kelvin) - 273.15;
		return celsius;
	}

	/**
	 * Omvanlar km/h till m/s
	 * 
	 * @param velocityKmH
	 * @return
	 */
	public static double velocityConversion(double velocityKmH) {
		double ms = (velocityKmH) / 3.6;
		return ms;
	}

	/**
	 * Räknar ut kinetisk energi med hjälp av massa och hastighet.
	 * 
	 * @param mass
	 * @param velocity
	 * @return
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double ke = (mass * Math.pow(velocity, 2) / 2);
		return ke;
	}

	/**
	 * Räknar ut potentiell energi med hjälp av massa och höjd.
	 * 
	 * @param mass
	 * @param height
	 * @return
	 */
	public static double potentialEnergy(double mass, double height) {
		double pe = (mass * 9.82 * height);
		return pe;

	}

	/**
	 * räknar ut medelvärde mellan tre givna värden.
	 * 
	 * @param first
	 * @param second
	 * @param last
	 * @return
	 */
	public static double delta(double first, double second, double last) {
		double average = ((first + second + last) / 3);
		return average;

	}

	/**
	 * räknar ut tid för hjälp av sträcka och hastighet
	 * 
	 * @param distance
	 * @param velocity
	 * @return
	 */
	public static double svtTime(double distance, double velocity) {
		double time = (distance / velocity);
		return time;

	}

	/**
	 * räknar ut arbete med hjälp av kraft och sträcka.
	 * 
	 * @param force
	 * @param distance
	 * @return
	 */
	public static double work(double force, double distance) {
		double arbete = (force * distance);
		return arbete;

	}

	/**
	 * räknar ut hur högt ett föremål med en viss hastighet uppåt kommer
	 * 
	 * @param velocity
	 * @return
	 */
	public static double velocityToHeight(double velocity) {
		double height = (velocity / 2);
		return height;

	}

	/**
	 * Räkna ut radien hos en sfär som har en viss volym.
	 * 
	 * @param Volume
	 * @return
	 */
	public static double sphereVolumeToRadius(double Volume) {
		double r = Math.pow(Volume / (4.0 / 3.0 * 3.14), 1.0 / 3.0);
		return r;

	}

	/**
	 * Räknar ut arean hos en triangel
	 * 
	 * @param base
	 * @param height
	 * @return
	 */
	public static double triangle(double base, double height) {
		double area = (base * height) / 2;
		return area;

	}

	/**
	 * Räknar ut arean hos en kvadrat
	 * 
	 * @param base
	 * @param height
	 * @return
	 */
	public static double square(double base, double height) {
		double area = (base * height);
		return area;
	}
}