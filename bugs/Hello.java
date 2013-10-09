import java.util.Scanner;

public class Hello {
	/*
		Define necessary variables
	*/
	double 	GROWTH_RATE 	= 0.95,
			ONE_BUG_VOLUME 	= 0.002,
			houseVolume,
			startPopulation,
			bugVolume;
	int		weekCount = 0;

	public void calculate() {
		/*
		*	Define scanner
		*/
		Scanner scan = new Scanner(System.in);
		/*
		*	Ask user to input necessary variables
		*/
		System.out.println("Please enter the volume:");
		houseVolume = scan.nextDouble();
		System.out.println("Please enter the startPopulation:");
		startPopulation = scan.nextInt();
		/*
		*	Convert the start population into volume
		*/
		bugVolume = startPopulation * ONE_BUG_VOLUME;
		/*
		*	Compute number of weeks
		*/
		while (houseVolume >= bugVolume) {
			weekCount++;
			bugVolume = bugVolume*1.95;
		}
		/*
		*	Print how many weeks it takes to fill the hosue.
		*/
		System.out.println("It takes " + weekCount + " weeks to fill the house.");
	}
}