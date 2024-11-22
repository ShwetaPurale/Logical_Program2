package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InvalidException extends Exception
{
  public InvalidException(String msg)	
  {
	  super(msg);
  }
}
class Employee
{
    int empId;
    String empName;
    Employee(int empId, String empName)
    {
    	this.empId=empId;
    	this.empName=empName;
    }
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
    
}
public class TestOPtioalDemo {

	public static void main(String[] args) throws InvalidException {
		// TODO Auto-generated method stub
        List<Employee> list=new ArrayList();
        list.add(null);
        list.add(new Employee(100, "abc"));
        list.add(new Employee(100, "abc"));
        
        Optional<Employee> opt;
        for(Employee e:list)
        {
        	opt=Optional.ofNullable(e);
        	System.out.println(opt.isPresent());
        	Employee e1= opt.orElse(new Employee(000,"axc"));
        	System.out.println(e1.getEmpId()+" "+e1.getEmpName());
        }
        
        List<Employee> list2=new ArrayList();
        list2.add(new Employee(101,"ssd"));
        list2.add(new Employee(201,"srp"));
        list2.add(null);
        
        System.out.println("Enter id for search");
        int id=101;
        for(Employee e2:list2)
        {
        	Optional<Employee> op=Optional.ofNullable(e2);
        	if(op.isPresent())
        	{
        		if(op.get().empId==id)
        		{
        		   Employee e1=	op.get();
        		   System.out.println(e1);
        		   break;
        		}
        	}
        	else
        	{
        		op.orElseThrow(()->new InvalidException("Invalid id"));
        	}
        }
	}

}








