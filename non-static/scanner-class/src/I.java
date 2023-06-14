import java.util.Scanner;
class I
{
	public static void main(String[] args) 
	{
		System.out.println("please enter roll number:  ");
		
		
		Scanner sc = new Scanner (System.in);
		int value1 = sc.nextInt();
		
		System.out.println("please enter name:  ");
		String name = sc.next();
		System.out.println("please enter initial :  ");
		char value2 = sc.next().charAt(0);
		System.out.println("please enter age:  ");
		int age = sc.nextInt();
		System.out.println("please enter course:  ");
		String course = sc.next();
		System.out.println("please enter skills:  ");
		String skills = sc.next();
		System.out.println("please enter fees:  ");
		double fees = sc.nextDouble();
		System.out.println("please enter job:  ");
		boolean job = sc.nextBoolean();

		System.out.println("\nroll number  is  : " + value1 +"\nname is: " + name+"\nage is: " + age+
			"\ncourse is: " + course+
			"\nskills are: " + skills+
			"\nfees: " + fees+
			"\njob: " + job+"initial is: "+value2);
		
	}
}
