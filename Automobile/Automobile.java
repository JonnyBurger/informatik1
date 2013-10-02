public class Automobile {
	double fuel = 50, speed;
	String license;

	static final double CONSUMPTION_IN_LITER_PER_MILE = 0.06;
	void print() {
		System.out.println("amount of fuel: " + fuel + " gallons");
		System.out.println("speed: " + speed);
		System.out.println("license plate: " + license);
	}

	void accelerate(int pedalPressure) {
		speed = speed + (5*pedalPressure / 100d);
	}

	void slowdown(int pedalPressure) {
		speed = speed - (5*pedalPressure / 100d);
	}

	void drive(int miles) {
		fuel -= miles*CONSUMPTION_IN_LITER_PER_MILE;
		if (fuel <= 0) {
			System.out.println("Tank leer");
		}
	}
	/*
		a method that returns a thing does not have a void statement,
		it has a object type in fornt of it
	*/
	String getDescription() {
		String description = "your fuel is " + fuel + " and your speed is " + speed
							+ " and your license plate is " + license;
		return description; 
	}
	double getMileage() {
		double result = fuel / CONSUMPTION_IN_LITER_PER_MILE;
		return result;
	}
}