class Prom
{
	
	private String name;

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}

	
}








class Pro 
{
	public static void main(String[] args) 
	{
		Prom p=new Prom();
		p.setName("madhu");
		System.out.println(p.getName());
	}
}
