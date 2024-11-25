package Entity;

import java.util.Set;


public class Train implements Comparable<Train>{
	private int trainNumber;
	private String trainName;
	private String trainSource;
	private String trainDest;
	
	private double trainPrice;
	private Set<Station> stations;
	
	
	
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Train(int tarinNumber, String trainName, String trainSource, String trainDest, double trainPrice,
			Set<Station> stations) {
		super();
		this.trainNumber = tarinNumber;
		this.trainName = trainName;
		this.trainSource = trainSource;
		this.trainDest = trainDest;
		this.trainPrice = trainPrice;
		this.stations = stations;
	}
	public int getTarinNumber() {
		return trainNumber;
	}
	public void setTarinNumber(int tarinNumber) {
		this.trainNumber = tarinNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainSource() {
		return trainSource;
	}
	public void setTrainSource(String trainSource) {
		this.trainSource = trainSource;
	}
	public String getTrainDest() {
		return trainDest;
	}
	public void setTrainDest(String trainDest) {
		this.trainDest = trainDest;
	}
	public double getTrainPrice() {
		return trainPrice;
	}
	public void setTrainPrice(double trainPrice) {
		this.trainPrice = trainPrice;
	}
	public Set<Station> getStations() {
		return stations;
	}
	public void setStations(Set<Station> stations) {
		this.stations = stations;
	}
	@Override
	public int compareTo(Train t) {
		if(this.getTarinNumber()>t.getTarinNumber())
		{
			return 1;
		}		
		return -1;
	}
	
public int campare(Train t1, Train t2)
{
	if(t1.getTarinNumber()>t2.getTarinNumber())
	{
		return 1;
	}
	return -1;
}
	


}
