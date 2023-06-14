class Car 
{
    private String name;

	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		this.name=n;	
	}

	

    // Getters and setters for name, price, and quantity
    // ...
}

class Products
{


    public static void main(String[] args)
		
	{
        Products p1=new Products();
		System.out.println(p1.getName());
		p1.setName("Phone");
        String name = p1.getName();
        System.out.println("Name: " + name);
     }
}