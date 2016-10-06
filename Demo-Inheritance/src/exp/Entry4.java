package exp;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Entry4 {

	public static void main(String[] args) {
		
		
		Map<Long, String> entries = new TreeMap<>();
		
		entries.put(9890098900L, "AirTel");
		entries.put(8055080550L, "Reliance");
		entries.put(9823098230L, "Vodafone");
		
		
		String v = entries.get(new Long("9823098230"));
		
//		String v = entries.get(9823098230L);
		
		System.out.println(v);
		
		
		Set<Map<Long,String>> set = entries.entrySet();
		
		for( Map.Entry<Long,String> entry :set){
			System.out.print(entry.getKey()+"\t");
			System.out.println(entry.getValue());
			Object
		}
		
		
		
		
		
		
		
		
	}
	
	
}
