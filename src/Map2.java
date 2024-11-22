import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<Integer, String> map=new TreeMap();
        map.put(420, "cyber");
        map.put(524, "success");
        map.put(635, "cyber");
        map.put(85, "training");
        map.put(480, "institude");
        System.out.println(map);
        System.out.println("**********");
        Set<Entry<Integer, String>> entries= map.entrySet();
        for(Map.Entry<Integer, String> map1 : entries)
        {
        	Integer key=map1.getKey();
        	String value=map1.getValue();
        	System.out.println(key+" "+value);
        }
	}

}
