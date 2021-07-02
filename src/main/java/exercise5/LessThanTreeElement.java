package exercise5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LessThanTreeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(10);
		ts.add(15);
		ts.add(20);
		ts.add(25);
		ts.add(30);
		ts.add(35);
		ts.add(40);
		
		int value = 7;

		System.out.println("Values greater than 7: ");
		for(int d: ts) {
			if (d > value) {
				System.out.println(d);
			}
		}
		

		
	
	}

}
