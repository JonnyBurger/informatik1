public class AutomobileTestDriver {
	public static void main(String[] args) {
		Automobile michaelsCar = new Automobile();
		michaelsCar.fuel = 60;
		michaelsCar.speed = 20;
		michaelsCar.license = "ZH999";

		AutomobileTestDriver.printStats(michaelsCar);

		Automobile sebisCar = new Automobile();
		sebisCar.fuel = 70;
		sebisCar.speed = 10;
		sebisCar.license = "ZH998";

		sebisCar.accelerate(50);
		sebisCar.slowdown(50);

		sebisCar.print();
	}
	private static void printStats(Automobile args) {
		System.out.println("amount of fuel: " + args.fuel + " gallons");
		System.out.println("speed: " + args.speed);
		System.out.println("license plate: " + args.license);
	}
}