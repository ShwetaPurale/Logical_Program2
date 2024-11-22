import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add('x');
		al.add("xyz");
		al.add(20.5f);
		System.out.println(al);
		System.out.println(al.toString());
		//al.delete(100);
		System.out.println(al);		
	}
}