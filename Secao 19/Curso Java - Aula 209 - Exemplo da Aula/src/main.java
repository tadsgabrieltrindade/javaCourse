import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
	Set<Integer> list = new TreeSet<Integer>();
	list.add(1);
	list.add(95);
	list.add(50);
	list.add(5);
	
	
	for(Integer l : list)
		System.out.println(l);
	System.out.println();
	list.removeIf(x -> x.equals(50));
	
	for(Integer l : list)
		System.out.println(l);

	}

}
