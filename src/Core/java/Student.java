package Core.java;

public class Student {

	static void librarian() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("take a key and open the Library");
	}
	static void library() throws InterruptedException
	{
		librarian();
		System.out.println("search a Book");
	}
	static void friend() throws InterruptedException
	{
		library();
		System.out.println("give me your a Book");
	}
	static void stud() throws InterruptedException
	{
		friend();
		System.out.println("I want to read the Book");
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
        stud();
	}

}
