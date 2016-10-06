import java.util.Iterator;
import java.util.TreeSet;

import com.cg.Person;

public class Entry2 {
	public static void main(String[] args) {
		
		Person p1 = new Person("Ajay", 35);
		Person p2 = new Person("Geeta", 15);
		Person p3 = new Person("Vijay", 25);
		
		TreeSet tree1 = new TreeSet();
	
		tree1.add(p3);
		tree1.add(p1);
		tree1.add(p2);
		
		System.out.println(tree1.size());
		
		Iterator itr = tree1.iterator();
		
		while(itr.hasNext()){
			Person e = (Person) itr.next();
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}
	
}
