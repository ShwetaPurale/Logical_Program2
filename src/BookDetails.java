import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Book implements Comparable<Book>{
  private int isbnNo;
  private String name;
  private String author;
  private String publisher;
  private int quantity;
public Book(int isbnNo, String name, String author, String publisher, int quantity) {
	super();
	this.isbnNo = isbnNo;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
	this.quantity = quantity;
}
public int getIsbnNo() {
	return isbnNo;
}
public void setIsbnNo(int isbnNo) {
	this.isbnNo = isbnNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Book [isbnNo=" + isbnNo + ", name=" + name + ", author=" + author + ", publisher=" + 
publisher+ ", quantity=" + quantity + "]";
}

//public int compare(Book b1, Book b2) {
//	// TODO Auto-generated method stub
//	if(b1.getIsbnNo()>b2.getIsbnNo())
//	{
//		return 1;
//	}
//	return -1;
//}
@Override
public int compareTo(Book b1) {
		if(this.getIsbnNo()>b1.getIsbnNo())
		{
			return 1;
		}
	// TODO Auto-generated method stub
	return -1;
}
}

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Book> queue=new PriorityQueue();
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter isbn number");
			int no=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter Book author");
			String author=sc.next();
			System.out.println("Enter publisher");
			String publisher=sc.next();
			System.out.println("Enter Book quantity");
			int quantity=sc.nextInt();
			Book book=new Book(no, name, author, publisher, quantity);
			queue.offer(book);
			System.out.println(queue);
		}
		System.out.println("***peek object from Queue***");
		System.out.println(queue.peek());
		System.out.println("***After peek object iterator the Queue***");
		for(Book book:queue)
		{
			System.out.println(book);
		}
		System.out.println("***After iterating remove the object from Queue***");
		Book removeB=queue.poll();
		System.out.println(removeB);
		
		System.out.println("***After the removing again iterating the Queue"
				+ ""
				+ "***");
		for(Book finalList:queue)
		{
			System.out.println(finalList);
		}
	}

}
