package LambdaExpression;

interface Verify
{
   boolean verify(String document);	
}
class PanVerify
{
	boolean panVerify(String panId)
	{
   String regex="[A-Z]{5}[0-9]{4}[A-Z]{1}";
   if(panId.matches(regex))
   {
	   return true;
   }
   return false;
  }
}
class EmailVerify
{
   	
}

public class Verifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
