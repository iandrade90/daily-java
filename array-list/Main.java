import java.util.ArrayList;

/**
* Main
*/
public class Main {

	public static void main(String[] args) {
		
	  //ArrayList = a resizable array.
	  //Elements can be added and removed after compilation phase
	  //store reference datatypes
	 
	  ArrayList<String> food = new ArrayList<String>();

	  food.add("Piiza");
	  food.add("Hamburguer");
	  food.add("Hotdog");


	  food.set(0, "Arepa");
	  food.remove(2);
	  food.clear();

	  for (int i = 0; i < food.size(); i++) {
	  	System.out.println(food.get(i));
	  }

	}
}
