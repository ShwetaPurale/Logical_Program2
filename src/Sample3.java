
class Demo8
{
  void m1()
  {
	  System.out.println("Inside m1 method");
  }
}

class Y extends Demo8{
	void m2()
	{
		System.out.println("Inside m2");
	}
}

class X extends Y
{
	void m3() {
		System.out.println("Inside m3 method");
	}
}

class SubClass extends Demo8{
	void m4() {
		System.out.println("Inside m4 method");
	}
}

class Sub extends SubClass{
	void m5()
	{
		System.out.println("Inside m5 method");
	}
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X b=new X();
		b.m1();
		b.m2();
		b.m3();
		
		Sub s=new Sub();
		s.m1();
		s.m4();
		s.m5();

	}

}
