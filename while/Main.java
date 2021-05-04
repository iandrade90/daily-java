import java.util.Scanner;

/**
* Main
*/
public class Main {

	public static void main(String[] args) {
		
	  //While loops execute a block of code as long as a condition remains true
	  
	  Scanner scanner = new Scanner(System.in);

	  String name = "";

	  while (name.isBlank()) {
	    System.out.println("Enter your name: ");
	    name = scanner.nextLine();

	  }

	  System.out.println("Hello " + name);

	  scanner.close();

	}
}
