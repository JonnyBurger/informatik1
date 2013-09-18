/*
	Represents a cuboid.
*/
public class Cuboid {
	private int length = 50, width = 30, height = 10;
	/*
		Calculates teh volume of a cube.
	*/
	public void printVolume() {
		System.out.println("The volume is: " + length*width*10);
	}
	public void printSurface() {
		int surface = 2*(height*width + width*length + length*height);
		System.out.println("The surface is: " + surface);
	}
	public void test() {
		double x = 7;
		double y = 30;
		System.out.println(x / (y % ++x));
	}
}