package Collection;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Employee empObj=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter your Pan No: ");
		String pan=sc.next();
		
		empObj.setEmpId(id);
		empObj.setEmpPan(pan);
		
		
		PanValidater panVal=(emp)->{
			String p="[A-Z]{5}[0-9]{4}[A-Z]{2}";
			if(emp.getEmpPan().matches(p))
			{
				return 1;
			}
			else {
				return -1;
			}
		};
		
		int s1=panVal.validatePan(empObj);
		if(s1==1)
		{
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Failed");
		}
		
		System.out.println("Enter your Phone No: ");
		String phone=sc.next();
		empObj.setEmpPhone(phone);
		
		PhoneValidater phoneVal=(e)->{
			String ph="[789]{1}[0-9]{9}";
			if(e.getEmpPhone().matches(ph))
			{
				return 1;
			}
			else {
				return -1;
			}
		};
		
		int s2=phoneVal.validatePhone(empObj);
		if(s2==1)
		{
			System.out.println("Suceessful");
		}
		else {
			System.out.println("Failed");
		}
	}
}
