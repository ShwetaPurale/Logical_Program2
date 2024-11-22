package LambdaExpression;

public class VApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vehicle vObj=new Vehicle();
     vObj.setvNo("MH23");
     vObj.setvPrice(350000.00);
     vObj.setvType("4Wheeler");
     
     Loan loan=()->{
    	 double amt=0.0;
    	 if(vObj.getvType().equals("4Wheeler"))
    	 {
    		 amt=(vObj.getvPrice()*0.80);
    		 return amt;
    	 }
    	 else if(vObj.getvType().equals("3Wheeler"))
    	 {
    		 amt=(vObj.getvPrice()*0.75);
    		 return amt;
    	 }
    	 else if(vObj.getvType().equals("2Wheeler"))
    	 {
    		 amt=(vObj.getvPrice()*0.50);
    		 return amt;
    	 }
    	 return amt;
     };
     double loanAmt=loan.issueLoan();
     System.out.println(loanAmt);
     
     Insurance insurance=()->{
    	 double insAmt=0.0;
    	 if(vObj.getvPrice()>=150000.00 && vObj.getvPrice()<=35000.00)
    	 {
    		 insAmt=3500;
    	 }
    	 if(vObj.getvPrice()>300000.00)
    	 {
    		 insAmt=4500;
    	 }
    	 return insAmt;
     };
     
     double insAmount=insurance.takeInsurance();
     System.out.println(insAmount);
	}
}







