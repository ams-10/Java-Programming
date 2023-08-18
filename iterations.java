import java.util.List;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.ListIterator;
public class iterations {
	public static void main(String args[]){
		List<String> names = new List<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		System.out.println(names);
		System.out.println("Iterator ..... ");
		Iterator<String> itrt = names.iterator();
		while(itrt.hasNext()){
			System.out.println(itrt.next());
		}
	}
}