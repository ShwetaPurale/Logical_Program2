package Controller;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import Entity.Station;
import Entity.Train;
import service.TrainService;
import serviceImp.TrainServiceImp;

public class TrainController {

	public static void main(String[] args) {

		TrainService service=new TrainServiceImp();
				
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many train do you wants to add");
		int not=scanner.nextInt();
		Set<Station> setOfStation=new LinkedHashSet();
		for(int i=0; i<not; i++)
		{
		System.out.println("Enter train number");
		int number=scanner.nextInt();
		System.out.println("Enter train name");
		String tname=scanner.next();
		System.out.println("Enter train source");
		String tsrc=scanner.next();
		System.out.println("Enter train dest");
		String tdest=scanner.next();
		System.out.println("Enter train price");
		double tprice=scanner.nextDouble();
		Station station=new Station();
		System.out.println("Enter station code");
		int code=scanner.nextInt();
		System.out.println("enter the station name");
		String name=scanner.next();
		station.setStationCode(code);
		station.setStationName(name);
		setOfStation.add(station);

		Train train=new Train(number,tname,tsrc,tdest,tprice,setOfStation);
		if(service.addTrain(train))
		{
			System.out.println(" "+ (i+1)+ " "+"Train added");
		}	
	 }
		Set<Train> list=service.viewTrains();
		for(Train t:list)
		{
			System.out.println(t.getTarinNumber()+" "+t.getTrainName());
			System.out.println(t.getTrainSource()+" "+t.getTrainDest());
			System.out.println(t.getTrainPrice());
			Set<Station> s=t.getStations();
			{
				for(Station station:s)
				{
					System.out.println(station.getStationCode()+" "+station.getStationName());
				}
			}
		}
		System.out.println("Enter a No Remove the Train ");
		int tn=scanner.nextInt();
		Train tno=service.deleteTrain(tn);
		if(tno!=null)
		{
		System.out.println(tno.getTarinNumber()+ " Delected");
		}else
		{
			System.out.println("tnumber not found");
		}
		
		
//		Set<Train> list1=service.viewTrains();	
//		for(Train t:list1)
//		{
//			System.out.println(t.getTarinNumber()+" "+t.getTrainName());
//			System.out.println(t.getTrainSource()+" "+t.getTrainDest());
//			System.out.println(t.getTrainPrice());
//			Set<Station> s=t.getStations();
//			{
//				for(Station station:s)
//				{
//					System.out.println(station.getStationCode()+" "+station.getStationName());
//				}
//			}
//		}
		System.out.println("Enter source");
		String sc=scanner.next();
		System.out.println("Enter destination");
		String dest=scanner.next();
		Set<Train> sd=service.searchTrain(sc, dest);
		 for(Train t:sd)
		 {
			 System.out.println(t.getTrainSource() + " "+t.getTrainDest());
		 }
		 
		 
		 
		 List<Train> sortList=service.sortTraininOrder();
		 Iterator<Train> itr=sortList.iterator();
		 while(itr.hasNext())
		 {
			 Train trainNo=itr.next();
			 System.out.println(trainNo.getTarinNumber());
		 }
		 
		 List<Train> sl=service.sortTraininOrder();
	     Iterator<Train> itr1=sl.iterator();
	     while(itr1.hasNext())
	     {
	    	 Train t=itr1.next();
	    	 System.out.println(t.getTrainPrice());
	     }
	}
}
