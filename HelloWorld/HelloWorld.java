import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello there! I can add two numbers");
		int i1, i2;

		Scanner input = new Scanner(System.in);

		i1 = input.nextInt();
		i2 = input.nextInt();

		int result = i1 + i2;

		System.out.println("Your number is " + result);
	}
}