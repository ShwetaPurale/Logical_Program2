package Collection;

public class ArrayList13 implements Comparable {

	int empId;
	String empName;
	ArrayList13(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}

	@Override
	public int compareTo(Object o) {
		ArrayList13 a=(ArrayList13)o;
		return empName.compareTo(a.empName);
	}

}
