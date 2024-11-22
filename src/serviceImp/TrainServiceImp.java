package serviceImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Entity.Train;
import service.TrainService;

//class SortId implements Comparator{
//
//	@Override
//	public int compare(Train t1, Train t2) {
//		// TODO Auto-generated method stub
//		if(t1.getTarinNumber()>t1.getTarinNumber())
//		{
//			return 1;
//		}
//		return -1;
//	}
//	
//}

public class TrainServiceImp implements TrainService {

	Set<Train> setOfTrain=new TreeSet();
	@Override
	public boolean addTrain(Train train) {
		return   setOfTrain.add(train);
		
	}

	@Override
	public Set<Train> viewTrains() {
		// TODO Auto-generated method stub
		//List<Train> listOfTrain = new ArrayList(setOfTrain);
		return setOfTrain;
	}

	@Override
	public Train deleteTrain(int trainNumber) {
		// TODO Auto-generated method stub
		for(Train t: setOfTrain) 
		{
		   int tno=t.getTarinNumber();
		   if(tno==trainNumber)
			   
		   {
			   setOfTrain.remove(t);
			   return t;
		   }
		}
		return null;
	}

	@Override
	public Train updateTrain(int Train, double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Train> searchTrain(String source, String destination) {
		// TODO Auto-generated method stub
		Set<Train> slist=new LinkedHashSet();
		Iterator<Train> it=setOfTrain.iterator();
		while(it.hasNext())
		{
			 Train t=it.next();
			 String ts=t.getTrainSource();
			 String td=t.getTrainDest();
			 if(ts.equalsIgnoreCase(source)&& td.equalsIgnoreCase(destination))
			 {
				 slist.add(t);
			 }
		}
		return slist;
	}

	@Override
	public List<Train> sortTraininOrder() {
		// TODO Auto-generated method stub
		Comparator<Train> cmp=(t1,t2)->{
			if(t1.getTarinNumber()>t2.getTarinNumber())
			{
				return 1;
			}
			return -1;
		};		
		List<Train> list=new ArrayList(setOfTrain);
		Collections.sort(list,cmp);
		return list;
	}

}
