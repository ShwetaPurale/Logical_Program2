
public class Demo {
	public static void main(String[] arg)
	{
		Emp[] e=new Emp[3];
		e[0]=new Emp(101,"Rohit");
		e[1]=new Emp(102,"Aditya");
		e[2]=new Emp(103,"Satish");
		for(Emp e1:e)
		{
			if(e1 instanceof Emp)
			{
				System.out.println(e1.empId+" "+e1.empName);
			}			
		}
	}

}
