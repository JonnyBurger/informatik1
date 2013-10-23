public class TestDriver {
	public static void main(String[] args) {
		SchoolClass aSchoolClass = new SchoolClass();
		aSchoolClass.setName("6c");

		Exam exam1 = new Exam();
		exam1.setName("Carl");
		exam1.setPoints(4);

		Exam exam2 = new Exam();
		exam2.setName("Anne");
		exam2.setPoints(5);

		aSchoolClass.addExam(exam1);
		aSchoolClass.addExam(exam2);

		aSchoolClass.printHighestPoints();
	}
}