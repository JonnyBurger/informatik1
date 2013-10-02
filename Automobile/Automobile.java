public class Automobile {
	double fuel, speed;
	String license;
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
}