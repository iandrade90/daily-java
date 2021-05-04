/**
* Main
*/
public class Main {

	public static void main(String[] args) {
		
	  //arrays are used to store multiple data in one variable
	  

	  String[] cars = {"Camaro", "Mustang", "Chevy"}; //To define an array, a set of [] must be go after declaring the type of variable
	  //The data must be within {}
	  
	  //To access the data stored in an array in one step, the index must be declared as follows = cars[0] == Camaro
	  //cars[0] = "Corvette" == define a new data in the index 0 of the array
	  
	  //Syntax to predefine the size of an array
	  
	  String[] objects = new String[3];

	  objects[0] = "Bed";
	  objects[1] = "Computer";
	  objects[2] = "Chair";

	  for (int i = 0; i < cars.length; i++) {
	  	System.out.println(cars[i]);
	  }

	  for (int i = 0; i < objects.length; i++) {
	  	System.out.println(objects[i]);
	  }

	}
}
