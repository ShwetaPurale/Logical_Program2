class Dem4
{
	void m1()
	{
		System.out.println("inside m1");
	}
}
class Demo2 extends Dem4{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Demo3 extends Demo2{
	void m3()
	{
		System.out.println("Inside m3 method");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d=new Demo3();
		d.m1();
		d.m2();
		d.m3();

	}

}
