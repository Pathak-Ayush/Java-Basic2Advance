public class Student {
	private int id;
	private int marks1;
	private int mark2;
	private int mark3;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public static void getTotalMarks(Student student) {
		int totalMarks = student.getMarks1() + student.getMark2() + student.getMark3();
		System.out.println("Total marks: " + totalMarks);
	}
	public int getTotalMarks() {
		return marks1 + mark2 + mark3;
	}

	public String toString(){
		return String.format("Student Id: %d\nStudent Name: %s\nMarks in Subject 1: %d\nMarks in Subject 2: %d\nMarks in Subject 3: %d\n Total Marks : %d" ,
				this.id, this.name, this.marks1, this.mark2, this.mark3,this.getTotalMarks());
	}
	public static void printStudentInfo(Student student) {
		System.out.println("Student Information:");
		System.out.println("--------------------");
		System.out.println("Student Id: " + student.getId());
		System.out.println("Student Name: "+student.getName());
		System.out.println("Marks in Subject 1: " + student.getMarks1());
		System.out.println("Marks in Subject 2: " + student.getMark2());
		System.out.println("Marks in Subject 3: " + student.getMark3());
		System.out.println("Total marks: ");
		getTotalMarks(student);
		System.out.println();
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setName("Ashutosh kumar");
		student.setMarks1(80);
		student.setMark2(70);
		student.setMark3(90);
//		printStudentInfo(student);
		System.out.println(student);

	}
}