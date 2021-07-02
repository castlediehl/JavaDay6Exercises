package exercise10;

import java.text.SimpleDateFormat;

public class DateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "1999-02-28";
		
		
		try {
			java.util.Date today = new SimpleDateFormat("yyyy-mm-dd").parse(s);
			String date = new SimpleDateFormat("dd/mm/yyyy").format(today);
			System.out.println("The date today is: " + date);
		}catch(Exception e){
			System.out.println("Error occured" + e);
		}
		
	}

}
