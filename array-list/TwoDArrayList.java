import java.util.*;

/**
* TwoDArrayList
*/
public class TwoDArrayList {

	public static void main(String[] args) {
		
	  //2D ArrayList = a dynamic list of lists
	  //You can change the size of these lists during runtime
	  //

	  ArrayList<ArrayList<String>> groceryList = new ArrayList();


	  ArrayList<String> bakeryList = new ArrayList<String>();

	  bakeryList.add("Pasta");
	  bakeryList.add("Garlic bread");
	  bakeryList.add("Donut");

	  ArrayList<String> produceList = new ArrayList<String>();

	  produceList.add("Tomatoes");
	  produceList.add("Zucchini");
	  produceList.add("Pepper");

	  ArrayList<String> drinkList = new ArrayList<String>();

	  drinkList.add("Soda");
	  drinkList.add("Coffee");

	  //System.out.println(drinkList);
	  //System.out.println(bakeryList.get(0)); To get only the element at the index requested
	  
	  groceryList.add(bakeryList);
	  groceryList.add(produceList);
	  groceryList.add(drinkList);

	  System.out.println(groceryList);
	  System.out.println(groceryList.get(0));
	  System.out.println(groceryList.get(1).get(2));

	}
}
