package Exam;

public class Exam {
	private int TotalMarks;
	public Exam(int marks) {
		TotalMarks=marks;
	}
	public void ShowResults(int marksobt) {
	float per = (float) marksobt*100/TotalMarks;
	if(per>=60) {
		System.out.println("You have passed the exam");
		}
		else {
			System.out.println("You have failed the exam");
		}
	}
}
