package Core.java;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="success";
		String str1="cyber";
		String str3="cyber";
		System.out.println(str1.equals(str3));
		System.out.println(str.equals(str1));
		
		String str2=new String("success");
		String str4=new String("success");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str.equals(str2));
		System.out.println(str4.equals(str2));
		
		if(str==str2)
		{
			System.out.println("content base");
		}
		else if(str==str2)
		{
			System.out.println("reference base..args...");
		}
		else if(str1.equals(str3))
		{
			System.out.println("reference base.....");
		}

	}

}
