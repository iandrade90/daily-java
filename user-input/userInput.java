/**
* userInput
*/

//Import the Scanner library
import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		
	  Scanner scanner = new Scanner(System.in);  //We declare in a variable the Scanner

	  System.out.println("What is your name? ");
	  String name = scanner.nextLine(); //We call the scanner and add the method nextLine which is used for Strings inputs

	  System.out.println("How old are you? ");
	  int age = scanner.nextInt(); //We call the scanner and add the method nextInt which is ised for int inputs
	  scanner.nextLine(); //By using this line, we prevent for an error of the nextLine method
	  
	  System.out.println("What is your favorite food?");
	  String food = scanner.nextLine();

	  System.out.println("My name is " + name + ", I'm " + age + " years old, and I love " + food + "!" );
	}
}
