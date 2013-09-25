public class AutomobileTestDriver {
	public static void main(String[] args) {
		Automobile michaelsCar = new Automobile();
		michaelsCar.fuel = 60;
		michaelsCar.speed = 20;
		michaelsCar.license = "ZH999";

		System.out.println("amount of fuel: " + michaelsCar.fuel + " gallons");
		System.out.println("speed: " + michaelsCar.speed);
		System.out.println("license plate: " + michaelsCar.license);

		Automobile sebisCar = new Automobile();
		sebisCar.fuel = 70;
		sebisCar.speed = 10;
		sebisCar.license = "ZH998";

		System.out.println("amount of fuel: " + sebisCar.fuel + " gallons");
		System.out.println("speed: " + sebisCar.speed);
		System.out.println("license plate: " + sebisCar.license);

	}
}