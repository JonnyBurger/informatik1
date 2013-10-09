import java.util.Scanner;
public class Average {
	public void avg() {
		System.out.println("Enter doubles:");
		Scanner keyboard 	= new Scanner(System.in);
		double 	sum 		= 0,
				next  		= keyboard.nextDouble(),
				lngth 		= 0;
		boolean areMore 	= true;
		while (areMore) {
			sum += next;
			lngth++;
			if (next < 0) {
				areMore = false;
			}
			else {	
				next = keyboard.nextDouble();
			}
		}
		if (lngth > 0) {
			System.out.println("The average is " + (sum/lngth));
		}
	}
}