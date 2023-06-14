class Car 
{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String n)
	{
		this.name = n;
	}
}

class Parts
{
	public static void main(String[] args) 
	{
		Parts p = new Parts();
		System.out.println(p.getName());
		p.setName("car");
		String name = p.getName();
		System.out.println("Name: " + name);
	}
}
