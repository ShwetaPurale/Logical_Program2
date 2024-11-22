package Core.java;

public class StringPali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ysu8sy";
		String newstr="";
		
		for(int i=str.length()-1; i>=0; i--)
		{			
			newstr=newstr+str.charAt(i);
		}
			System.out.println(newstr);
		
		if(str.equals(newstr))
		{
			System.out.println("String is palindrom");
		}
		else {
			System.out.println("String is not palindrom");
		}

	}

}
