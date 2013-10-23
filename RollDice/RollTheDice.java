import java.util.Random;

public class RollTheDice {
	private int target 		= 30;
	private int[] rolls 	= new int[target];
	private int totalPoints = 0;
	private int rollnr 		= 0;

	public void RollDice() {
		if (totalPoints < target) {
			int result 		= new Random().nextInt(6) + 1;
			rolls[rollnr] 	= result;
			totalPoints 	+= result;
			rollnr++;
			RollDice();
		}
		else {
			System.out.println("The result is " + totalPoints);
			System.out.println("The numbers were:");
			for (int i = 0; i < rollnr; i++) {
				System.out.println(rolls[i]);
			}
		}
	}  
}