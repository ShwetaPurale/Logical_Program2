
class Sample1{
	int a=10;
	void m1()
	{
		System.out.println("Inside m1 "+ a);
	}
}
class Sample2 extends Sample1{
float b=25.5f;
void m2()
{
  System.out.println("Inside m2 "+b);	
}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 sample=new Sample2();
		sample.m1();
		sample.m2();

	}

}
