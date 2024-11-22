class A {
	int a=10;
	void m1()
	{
		System.out.println("Inside a class "+a);
	}
}
class B extends A
{
	float b=20.5f;
	void m2()
	{
		System.out.println("Inside a B "+b);
	}
	
}
class Dmo extends A{
	void simple()
	{
		System.out.println("inside a simple");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a=new A();
//		a.m1();
//		B b=new B();
//		b.m1();
//		b.m2();
//		A c=new B();
//		c.m1();
		Dmo d=new Dmo();
		d.m1(); 
//		d.m2(); 
		d.simple();
			

	}

}
