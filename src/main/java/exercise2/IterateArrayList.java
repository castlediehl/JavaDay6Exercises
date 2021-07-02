package exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Red");
		list.add("Green");
		list.add("Red");
			
		Iterator<String> i = list.iterator();

		for(int j = 0; j < list.size(); j++)
		{
		    System.out.println(list.get(j));
		}
		
		
	}

}
