package OOps;

import java.util.HashSet;
import java.util.Set;

public class Sets extends TestCollection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> set1 = new HashSet<String>();
		

		//ArrayList list2 = new ArrayList();

		set1.add("Element 1");
		set1.add("Element 2");
		set1.add("Element 1");
		set1.add("Element 2");
		set1.add("Element 3");
		set1.add("Element 4");
		set1.add("Element 4");
		System.out.println(set1);
	

	}

}
