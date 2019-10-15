package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);

		Student studentSon = new Student(1002, "Son");
		studentSon.addSubject("국어", 100);
		studentSon.addSubject("수학", 70);
		studentSon.addSubject("영어", 85);
		
		studentLee.showStudentInfo();
		System.out.println();
		studentSon.showStudentInfo();
		
	}

}
