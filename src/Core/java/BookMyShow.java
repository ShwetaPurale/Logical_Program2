package Core.java;

 class PveMov {
	 private static PveMov MTicket;
	 private PveMov()
	 {
		 System.out.println("please wait data is fetching...");
	 }
	 public static PveMov BookTicket()
	 {
		 System.out.println("please wait ticket is checking");
		 if(MTicket==null)
		 {
			 MTicket=new PveMov();
		 }
		 return MTicket;
	 }
	}

	class BookMyShow
	{
	   public static void main(String[]args)
	   {
		   PveMov MTicket1= PveMov.BookTicket();
		   System.out.println("your id is: "+MTicket1);
		   MTicket1= PveMov.BookTicket();
		   System.out.println("your id is: "+MTicket1);
	   }
	}
