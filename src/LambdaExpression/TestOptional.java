package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOptional {
	static List<String> list=new ArrayList();
    static 
    {
  	  list.add("Mr. A");
  	  list.add("Mr. B");
  	  list.add(null);
  	  list.add("Mr. C");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1=null;
      Optional<String> opt=null;
      for(String str: list)
      {
    	  opt=Optional.ofNullable(str);
    	  if(opt.isPresent())
    	  {
    		 String value= opt.get();
    		  System.out.println(value);
    	  }
    	  else {
    		 String s2= opt.orElse("NOT APPLICABLE");
    		 System.out.println(s2);
    	  }
      }
	}

}
