package service;
import java.util.List;
import java.util.Set;
import Entity.Train;

public interface TrainService 
{
	public boolean addTrain(Train train);
	public Set<Train> viewTrains();
	public Train deleteTrain(int trainNumber);
	public Train updateTrain(int Train,double price);
	public Set<Train> searchTrain(String source, String destination);
	public List<Train> sortTraininOrder();
}
