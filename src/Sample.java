
class Simple
{
    void m1()
    {
    	System.out.println("m1 method");
    }
}

class D extends Simple{
	void m2()
	{
		System.out.println("m2 method");
	}
}

class C extends Simple{
	void m3()
	{
		System.out.println("m3 method");
	}
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c=new C();
		c.m1();
		c.m3();
		
		D d=new D();
		d.m1();
		d.m2();

	}

}
