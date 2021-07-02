package exercise7;

import java.util.HashMap;

public class SetViewMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
  
        // Mapping string values to int keys
        hash_map.put(5, "I");
        hash_map.put(10, "am");
        hash_map.put(15, "a");
        hash_map.put(20, "Hash");
        hash_map.put(25, "Map");
  
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);
  
        // Displaying the size of the map
        System.out.println("The size of the map is " + hash_map.size());
	}

}
