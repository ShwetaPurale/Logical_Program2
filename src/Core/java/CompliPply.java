package Core.java;

public class CompliPply {
	void m1()
	{
		System.out.println("Inside m1----0 arg");
	}
    int m1(int a)
    {
    	System.out.println("Inside m1----1 arg "+a);
    	return a;
    }
    void m1(int a,float b)
    {
    	System.out.println("Inside m1----2 arg "+a+b);
    }
    void m1(float a, int b)
    {
    	System.out.println("Inside m1----2 arg changing"+" "+a+b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CompliPply c1=new CompliPply();
        c1.m1();
        int a=c1.m1(10);
        c1.m1(10, 20.5f);
        c1.m1(20.5f, 10);
	}
}









