class Student 
{
	int roll_number;
	String n;
	String college_name;
	String course;

	Student(int roll_number,String name)
	{
		this.roll_number = roll_number;
		this.n = name;
	}
	{
		this.college_name = "lara";
	}

	{
		this.course = "java-full-stack";
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"siva");
		Student s2 = new Student(2,"kumari");
		Student s3 = new Student(3,"yashu");
        Student s4 = new Student(4,"satwi");
		System.out.println(s1.roll_number + " , " + s1.n + " , " + s1.college_name+ " , " +s1.course);
		System.out.println(s2.roll_number + " , " + s2.n + " , " + s2.college_name+ " , " +s2.course);
		System.out.println(s3.roll_number + " , " + s3.n + " , " + s3.college_name+ " , " +s3.course);
		System.out.println(s4.roll_number + " , " + s4.n + " , " + s4.college_name+ " , " +s4.course);
		

	}
	
}
