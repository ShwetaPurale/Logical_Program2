
public class Static1 {
   static int a=100;
   static float b=200.5f;
	public static void main(String[] args) {
		Static1 s1=new Static1();
		s1.m1(10, 20.5f);

	}
	void m1(int a, float b)
	{
		System.out.println("Inside m1 method");
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}

}
