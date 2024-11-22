package Collection;

public class Cyber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="rehul";
		String str2="Geeta";
		System.out.println(str);
		System.out.println(str2);
		String str3="rehul";
		
		System.out.println(str==str3);
		String str1=new String("Success");
		String str4=new String("Success");
		System.out.println(str1==str4);
		
		System.out.println(str.equals(str3));
		
		System.out.println(str1.equals(str4));
		System.out.println(str.equals(str2));
		
		StringBuffer strBuf=new StringBuffer("xyz");
		StringBuffer strBuf2=new StringBuffer("xyz");
		StringBuffer strBuf1=new StringBuffer("Demo");
		
		System.out.println(strBuf==strBuf1);
		System.out.println(strBuf.equals(strBuf1));		

	}
}
