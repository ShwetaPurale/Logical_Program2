package Core.java;

public class StudMarks {

	int mark;
	StudMarks(int mark)
	{
		this.mark=mark;
	}
	void checkMark()
	{
		System.out.println("please wait your result will be display");
		if(mark<35 && mark>0)
		{
			System.out.println("student is fail");
		}
		else if(mark>=35)
		{
			System.out.println("student is pass");
		}
		else if(mark==0)
		{
			throw new ArithmeticException("enter valid marks");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudMarks s1=new StudMarks(50);
        s1.checkMark();
	}

}
