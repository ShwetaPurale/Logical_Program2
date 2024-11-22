package Core.java;

class Demo
{
    void m1()
    {
    	System.out.println("Inside m1 0 arg Demo");
    }    
}
class Sample extends Demo
{
	void m1()
    {
		super.m1();
    	System.out.println("Inside m1 0 arg sample");
    }	
}
public class RuntimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo d1=new Sample();
        d1.m1();
	}

}
