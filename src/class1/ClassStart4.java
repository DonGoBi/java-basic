package class1;

public class ClassStart4 {

	public static void main(String[] args) {

		Student student1;
		student1 = new Student();	//참조값 생성
		student1.name = "학생1";
		student1.age = 15;
		student1.grade = 90;


		Student student2 = new Student(); //참조값 생성
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

		
		Student[] students = new Student[2];  	//참조값 기본값 null
		students[0] = student1;		//참조값 넣어줌
		students[1] = student2;		//참조값 넣어줌



		System.out.println("이름 = " + students[0].name + " 나이:" + students[0].age + " 성적: "+ students[0].grade);
		System.out.println("이름 = " +students[1].name + " 나이:" + students[1].age + " 성적: "+ students[1].grade);
	}
}
