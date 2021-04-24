/**
* Variables
*/
public class Variables {

	public static void main(String[] args) {
		
	  int x; //Declaration
	  x = 123; //Assignment

	  int y = 321; //Initialization

	  System.out.println("My number is: " + x + ", the other number initialized is: " + y); //Concatenation

	  long z = 347603604707236476L; //Variable to store large numbers, always ends with capital l

	  System.out.println("This is a very large number: " + z);
	  
	  float n = 3.14f; //Variable to store floating point numbers, always ends with a f

	  System.out.println("This is the short value of pi: " + n);

	  double m = 3.141592653589; //Variable to store up to 15 floating digits

	  System.out.println("This is a more complete pi number: " + m);

	  boolean t = true;
	  boolean f = false; //Variable to store true or false

	  System.out.println("It can be whether " + t + " or " + f);

	  char symbol = '@'; //Variable to store a single piece of data, it is written within ''
	  String name = "Hello World!";

	  System.out.println(name + ", the at symbol is: " + symbol);
	}	
}
