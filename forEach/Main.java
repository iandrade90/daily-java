import java.util.ArrayList;

/**
* Main
*/
public class Main {

	public static void main(String[] args) {
		
	  //for-each(enhanced for loop) = traversing technique to iterate through the elements in an array/collection
	  //less steps, more readable
	  //less flexible
	  //
	  String[] animals1 = {"zebra", "lion", "hipo", "horse"};
	  
	  ArrayList<String> animals = new ArrayList<String>();

	  animals.add("cat");
	  animals.add("dog");
	  animals.add("rat");
	  animals.add("bird");

	  //Different ways to iterate arrays and ArrayLists using fori and foreach loops


	  for (String i : animals) {
	  	System.out.println(i);
	  }

	  for (String i : animals1) {
	  	System.out.println(i);
	  }

	  for (int i = 0; i < animals1.length; i++) {
	  	System.out.println(animals1[i]);
	  }

	  for (int i = 0; i < animals.size(); i++) {
	  	System.out.println(animals.get(i));
	  }

	}
}
