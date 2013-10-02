public class Euclid2 {
	/*
		0 = 0
		1 = 1
		2 = 10
		3 = 11
		4 = 100
	*/
	int i = 1;
	int potenz = 0;
	String result = "";
	void calc(double number) {
		while(number > i) {
			potenz++;
			i = i*2;
		}
		potenz--;
		for (int j = potenz; j >= 0; j--) {
			double a = Math.pow(2, j);
			if (number >= a) {
				result+="1";
				number = number - a;
			}
			else {
				result+="0";
			}
		}
		System.out.println(result);
	}
}