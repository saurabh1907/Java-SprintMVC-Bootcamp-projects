package exp;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedList {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		

		
		list1.add(55);
		list1.add(30);
		list1.add(20);
		list1.add(new Integer(45));
		
		Iterator itr = list1.iterator();
		
		System.out.println(itr.getClass().getName());
		
		while(itr.hasNext()){
			Object o = itr.next();
			System.out.print((Integer)o+"\t");
		}
		System.out.println();
		
//		FOR-EACH LOOP
		
		for(Object o : list1){
			System.out.print((Integer)o+"\t");
		}
		
		TreeSet tree = new TreeSet();
		
		tree.addAll(list1);
		
		System.out.println();
		for(Object o : tree){
			System.out.print((Integer)o+"\t");
		}
		
//		LOCAL CLASS
		
		class MyComparator implements Comparator{
			@Override
			public int compare(Object o1, Object o2) {
				int diff =((Integer) o1)-((Integer) o2);
				
				return -diff;
			}
		}
		
		Comparator comp = new MyComparator();
		TreeSet tree2 = new TreeSet(comp);
		tree2.addAll(list1);
		
		System.out.println();
		for(Object o : tree2){
			System.out.print((Integer)o+"\t");
		}
		
		
		
		
	}
	
	
	
}
