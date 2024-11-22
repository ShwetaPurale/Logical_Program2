package LambdaExpression;

import java.util.Scanner;

public class TestUserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User userObj=new User("abc", "cyber@123");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter user name");
       String name=sc.next();
       System.out.println("Enter user password");
       String password=sc.next();
       
       UserService service=(user)->{
    	   if(user.getUserName().equalsIgnoreCase(name) && user.getPassword().equals(password))
    	   {
    		   return "Valid Admin";
    	   }
    	   else {
    		   return "Invalid Admin";
    	   }
       };
       
      String result= service.getLogin(userObj);
      System.out.println(result);
      
      service.showMsg();
	}
}
