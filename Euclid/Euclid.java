public class Euclid {
	void start(int a, int b) {
		while(a > 0 && b > 0) {
			if (a > b) {
				a = a - b;
			}
			else {
				b = b - a;
			}
		}
		if (b == 0) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
 	}
}