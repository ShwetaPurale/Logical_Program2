class Demoo{
	int a=10;
}
class Static2 {
Static2()
{
	m1();m2();
	Demoo d1=new Demoo();
	System.out.println(d1.a);
}
	public static void main(String[] args) {
		System.out.println("Inside main method");
		Static2 s2=new Static2();
	}
	static void m1()
	{
		System.out.println("Inside m1 method");
	}
	static void m2()
	{
		System.out.println("Inside m2 method");
	}

}
