package exercise4;

import java.util.HashSet;

public class RetainSetElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  HashSet<String> hs = new HashSet<String>();
	        //add elements to HashSet
	        hs.add("blue");
	        hs.add("yellow");
	        hs.add("green");
	        hs.add("red");
	        hs.add("orang");
	        
	        System.out.println(hs);
	        
	        // Subset of HashSet<String> hs
	        HashSet<String> subSet = new HashSet<String>();
	        subSet.add("yellow");
	        subSet.add("red");
	        subSet.add("green");
	        
	        // retainAll method retains elements in hs
	        hs.retainAll(subSet);
	        System.out.println("HashSet Retained content:");
	        System.out.println(hs);
	}

}
