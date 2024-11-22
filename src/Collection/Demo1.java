package Collection;

class Demo2
{
	private int val=100;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d=new Demo2();
		int a=d.getVal();
		System.out.println("before set value "+a);
		d.setVal(500);
		a=d.getVal();
		System.out.println("After set value"+a);

	}

}
