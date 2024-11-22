package Collection;

public class Emp2 implements Comparable{
     int empId;
     String empName;
     Emp2(int empId, String empName)
     {
    	 this.empId=empId;
    	 this.empName=empName;
     }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Emp2 e2=(Emp2)o;
		int returnType=0;
		if(e2.empId==empId)
		{
			returnType=0;
		}
		else if(e2.empId>empId)
		{
			returnType =-1;
		}
		else if(e2.empId<empId)
		{
			returnType= 1;
		}
		return returnType;
	}
}
