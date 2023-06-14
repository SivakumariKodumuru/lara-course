class Q 
{
	int i;
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.i=10;
		Q q2=q1;
		System.out.println(q2.i);
		q2.i=20;
		Q q3=q2;
		System.out.println(q3.i);
		System.out.println(q1.i);
		Q q4 = new Q();
		System.out.println(q4.i);
		Q q5 = new Q();
		q5.i = 30;
		System.out.println(q5.i);
		System.out.println(q1.i);
		System.out.println(q2.i);
		System.out.println(q4.i);
		System.out.println(q3.i);
		Q q6 = new Q();
		System.out.println(q6.i);
	}
}
