package Core.java;

public class CheckingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1="cyber";
         String str2="cyber";
         String str3="success";
         System.out.println(str1==str2);
         System.out.println(str1==str3);
         String str4=new String("cyber");
         String str5=new String("cyber");
         String str6=new String("success");
         System.out.println(str4==str5);
         System.out.println(str4==str6);
         System.out.println(str1==str4);
         System.out.println(str2==str5);
	}

}
