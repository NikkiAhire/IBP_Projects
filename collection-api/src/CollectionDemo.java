import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Google");
		list.add("Oracle");
		list.add(2,"Microsoft");
		list.add("IBM");
		
		System.out.println("-----Traversing over ArrayList Using for...loop");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------Traversing over ArrayList using Iterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----Traversing over ArrayList using for...Each");
		for(String s:list) {
			System.out.println(s);
		}
		
		
		LinkedList<String> link = new LinkedList<String>();
		link.add("Tesla");
		link.addFirst("Apache");
		link.add("Apple");
		link.addLast("Meta");
		
		list.addAll(link);
		System.out.println("-----Traversing over updated arraylist using for...each");
		for(String s :list) {
			System.out.println(s);
		}
		
		//Convert Arraylist into HashSet
		HashSet<String> hash = new HashSet<String>(list);
		System.out.println("---Traversing over Hashset using for....each....loop");
		for(String s: hash) {
			System.out.println(s);
		}
		TreeSet<String> tree = new TreeSet<String>(list);
		System.out.println("---Traversing over Treeset using for....each....loop");
		for(String s: tree) {
			System.out.println(s);
		}
	}
}
