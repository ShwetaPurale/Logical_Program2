package LogicProgram;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1232, temp=number, reverse=0;
		while(number!=0){
			int reminder=number%10;
			reverse=(reverse*10+reminder);
			number = number/10;
		}
		System.out.println("The reverse number is "+reverse);
		if(temp==reverse)
		{
			System.out.println("no is palindrom");
		}
		else
		{
			System.out.println("no is not palindrom");
		}
	}

}
