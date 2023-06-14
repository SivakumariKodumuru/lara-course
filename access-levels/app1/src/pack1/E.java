package pack1;
public class  D
{
	private void test()
	{
		System.out.println("from test()");
	}
}
public class E
{
	public static void main(String[] args)
	{
		D d1 = new D();
	    d1.test();
		System.out.println("Hello World!");
	}
}


//in one java file any number of java files can be developed
// for all the classes a .class will be genaerated (after the successful compailation of .java file)
// ex: A.class , B.class , C.class
