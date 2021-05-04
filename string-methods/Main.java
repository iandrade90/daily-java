/**
* Main
*/
public class Main {

	public static void main(String[] args) {
		
	  //Strings are reference data type that can store one or more characters
	  //
	  //equal method = compares to strings and returns a boolean (It is case sensitive)
	  //length method = returns how many chars are in the data
	  //charAt method = returns the letter at a given index
	  //indexOf method = returns the index number of a given char
	  //Is empty method = returns a boolean whether the variable is empty or not
	  //to uppercase method = changes to uppercase
	  //to lowercase method = changes to lowercase
	  //replace method = replaces a given char to a new value

	  String country = "Argentina";

	  boolean resultEqual = country.equals("Argentina"); //equalsIgnoreCase() ignores the case sensitivity
	  int resultLen = country.length();
	  char resultChar = country.charAt(5);
	  int resultIndex = country.indexOf("n");
	  boolean resultIsEmpty = country.isEmpty();
	  String resultUpper = country.toUpperCase();
	  String resultLower = country.toLowerCase();
	  String resultReplace = country.replace("a", "A");

	  System.out.println(resultReplace);



	}
}
