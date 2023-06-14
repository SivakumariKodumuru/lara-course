class Publisher
{
	String name;
	String publisherID;
	String city;

	Publisher(String name,String publisherID,String city)
	{
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}
}
class Author

{
	String authorName;
	int age;
	String place;
	
	//author class consrtructor
	Author(String name, int age, String place)
	{
		this.authorName = name;
		this.age = age;
		this.place = place;
    }
}
// Book  class has-a author
//Book class has-a Publisher
class Book

{
	String name;
	int price;

	//author details
	Author author;
	Publisher publisher;

	Book(String n,int p, Author author,Publisher publisher)
	{
		this.name = n;
		this.price = p;
		this.author = author;
		this.publisher = publisher;
	}



	public static void main(String[] args) 
	{
		Author author = new Author("jhon",42,"USA");
		Publisher publisher =new Publisher("sun publications","jsdr-III4","LA");
		Book b = new Book("java for beginner",800,author,publisher);

		System.out.println("Book name: "+b.name);
		System.out.println("Book price: "+b.price);
		System.out.println("----------Author details---------");
		System.out.println("Author name:"+b.author.authorName);
		System.out.println("Author age : "+b.author.age);
		System.out.println("Author place: "+b.author.place);
		System.out.println("-------Publisher details---------");
		System.out.println("Publisher name: "+b.publisher.name);
		System.out.println("publisher ID: "+b.publisher.publisherID);
		System.out.println("publisher city: "+b.publisher.city);
	}

}
