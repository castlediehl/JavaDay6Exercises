package exercise3;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
	
	public ArrayList<String> reverseArrayList(List<String> list)
    {
        // Arraylist for storing reversed elements
        ArrayList<String> revArrayList = new ArrayList<String>();
        for (int i = list.size() - 1; i >= 0; i--) {
 
            // Append the elements in reverse order
            revArrayList.add(list.get(i));
        }
 
        // Return the reversed arraylist
        return revArrayList;
    }
	

	public void printElements(ArrayList<String> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ReverseArrayList obj = new ReverseArrayList();
        
        ArrayList<String> arrayli = new ArrayList<String>();


        arrayli.add("Blue");
		arrayli.add("Red");
		arrayli.add("Green");
		arrayli.add("yellow");
		System.out.print("Elements before reversing:");
        obj.printElements(arrayli);
        arrayli = obj.reverseArrayList(arrayli);
        System.out.print("\nElements after reversing:");
        obj.printElements(arrayli);
	}

}
