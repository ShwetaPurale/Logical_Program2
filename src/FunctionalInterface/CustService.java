package FunctionalInterface;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustService {

	Set<Customer> setOfCust;
	public void addAllCustonmer(Set<Customer> setOfCust)
	{
		this.setOfCust=setOfCust;		
	}
	
	public List<Customer> getAllCust()
	{
		List<Customer> list=setOfCust.stream().collect(Collectors.toList());
		return list;
	}
	
	public List<Customer> getAllCustFromSameCity(String city)
	{
		return setOfCust.stream().filter(cust->cust.getAddress().
				equalsIgnoreCase(city)).collect(Collectors.toList());
	}
	
	public long countMaleCust()
	{
		long male=setOfCust.stream().filter(m->m.getGender().
				equalsIgnoreCase("male")).count();
		return male;
	}
	
	public Set<String> getAllCity()
	{
//		Set<Customer> city1= setOfCust.stream().filter(city->city.getAddress()).collect(Collectors.toSet());
		return null;
    }
	
	public Stream<Customer> sortCustById()
	{
		Comparator<Customer> cmp=(id1, id2)->{
			if(id1.getId()<id2.getId())
			{
				return 1;
			}
			return -1;
		};
    	Stream<Customer> id=setOfCust.stream().sorted();
		return id;
	}	
}
