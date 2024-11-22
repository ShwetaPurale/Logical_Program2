package LambdaExpression;

import java.util.Scanner;

public class ValidateUtility {
	public static Validate validateEmpName()
	{
		String regex1="[a-zA-Z//s]{5,20}";
	      Validate validate=(name)->{
	    	  if(name.matches(regex1))
	    	  {
	    		  //System.out.println("user name is valid");
    		  return true;
	    	  }
	    	  return false;
	      };
	      return validate;
	}
	
	
	public static Validate validateProdName()
	{
		String regex="[A-Za-z]{1}[0-9]{5}";
		Validate validate=(input)->{
			if(input.matches(regex))
			{
				 //System.out.println("product name is valid");
				return true;
			}
			return false;
		};
		return validate;
		
	}	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter emp name");
      String empName=sc.nextLine();
     

      Validate v1=validateEmpName();
      boolean name= v1.validateName(empName);
      if(name)
      {
    	  System.out.println("valid username");
      }
      else {
    	  System.out.println("Invalid username");
      }
      
      
      Validate v2=validateProdName();
      System.out.println("Enter product name");
      String proName=sc.nextLine();
     boolean prodName= v2.validateName(proName);
      if(prodName)
      {
    	  System.out.println("valid product name");
      }
      else
      {
    	  System.out.println("Invalid product name");
      }
	}
	
	

}
