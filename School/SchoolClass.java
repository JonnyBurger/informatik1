public class SchoolClass {
	private int EXAMS = 15;
	private String name;
	private int numberOfExams = 0;
	private Exam[] exams = new Exam[EXAMS];

	public void setName(String n) {
		name = n;
	}
	public void addExam(Exam ex) {
		if (numberOfExams >= EXAMS) {
			System.out.println("The class is already full!");
			return;
		}
		else {
			exams[numberOfExams] = ex;
			numberOfExams++;
		}
	}
	public void printHighestPoints() {
		int highestPoints = 0;
		String bestPupil = "";
		if (numberOfExams == 0) {
			System.out.println("There are no exams registered!");
			return;
		}
		else {
			for (int i = 0; i < numberOfExams; i++) {
				Exam e = exams[i];
				if (e.getPoints() > highestPoints) {
					highestPoints = e.getPoints();
					bestPupil = e.getName();
				}
			}
			System.out.println("The best exam was written by " + bestPupil + " and has " + highestPoints + " points.");
		}
	}
}