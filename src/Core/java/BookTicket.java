package Core.java;

class PVRMovie
{
     private static PVRMovie mTicket;
     private PVRMovie()
     {
    	System.out.println("Welcome to the pvr world.....");
     }
     public static PVRMovie bookTicket()
     {    
    	 System.out.println("Wait Booking detatils is fetching!");
    	 if(mTicket==null)
    	 {
    		 mTicket=new PVRMovie();
    	 }
    	 return mTicket;
     }
}

public class BookTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PVRMovie cust1= PVRMovie.bookTicket();
        System.out.println("your mTicket id is "+cust1);
        cust1= PVRMovie.bookTicket();
        System.out.println("your mTicket id is "+cust1);
	}

}
