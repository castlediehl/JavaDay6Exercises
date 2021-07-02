package exercise8;

import java.util.HashMap;

public class SortKeysWithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty HashMap
        HashMap<String, String> hash_map = new HashMap<String, String>();
  
        // Mapping string values to string keys
        hash_map.put("wave", "ocean");
        hash_map.put("android", "phone");
        hash_map.put("macbook", "laptop");
        hash_map.put("dog", "animal");
        hash_map.put("nike", "shoe");
  
        // Displaying the HashMap
        System.out.println("Initial Mappings Compared: " + hash_map);
  
	}

}
