/**
* Main
*/
public class Main {

	public static void main(String[] args) {
		
	  //Method = a block of code that is executed whenever it is called upon

	  String name = "Java";

	  hello(name);

	  int x = 5;
	  int y = 10;

	  System.out.println("This is a sum: " + add(x, y));

	}

	static void hello(String name){

	  System.out.println("Hello " + name + "!");

	}

	static int add(int x, int y){

	  return x + y;

	}
}
