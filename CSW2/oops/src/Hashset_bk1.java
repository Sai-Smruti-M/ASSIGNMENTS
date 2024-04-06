import java.util.*;
public class Hashset_bk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet  haset= new HashSet();
		haset.add(10);
		 haset.add("Mango");
		 haset.add("Orange");
		 haset.add("Strawberry");
		 haset.add("Dates");
		 // Adding duplicate elements
		 haset.add("Orange");
		 haset.add("Mango");
		 // Multiple null values
		 haset.add(null);
		 haset.add(null);
		 // Displaying the stored HashSet elements
		 System.out.println(haset);
	}

}
