package class1;

public class ClassStart2 {

	public static void main(String[] args) {

		String[] student1Names = {"학생1", "학생2"};
		int[] studentAges = {15, 16};
		int[] studentGrade = {90, 80};

		for (int i = 0; i < student1Names.length; i++) {
			System.out.println("이름 = " + student1Names[i] + " 나이:" + studentAges[i] + " 성적: "+ studentGrade[i]);
		}



	}
}
