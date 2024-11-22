class Inner
{
    void m1() {
    	System.out.println("Inside m1 method----Demo");
    }
    void m2() {
    	System.out.println("Inside m2 method----Demo");
    }
}
//class Outer
//{
//	Inner d=new Inner() {
//		void m1(){
//	    	System.out.println("Inside m1 method----Anynomause1...");
//		}
//		void m2() {
//	    	System.out.println("Inside m2 method----Anynomause1...");
//	    }
//	};
//	}

public class Anonymous1 {

	public static void main(String[] args) {
		Inner d=new Inner() {
		void m1(){
	    	System.out.println("Inside m1 method----Anynomause1...");
		}
		void m2() {
	    	System.out.println("Inside m2 method----Anynomause1...");
	    }
	};
//		Anonymous1 a=new Anonymous1();
//		Outer o=new Outer();
		d.m1(); d.m2();
	}

}