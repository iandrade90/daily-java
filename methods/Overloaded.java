/**
* Overloaded
*/
public class Overloaded {

	public static void main(String[] args) {
		
	  //Overloaded methods = methods that share the same name but have different params
	  //method name + params = method signature
	  
	  int result = add(2, 2, 2, 2);

	  System.out.println(result);
	  
	}

	static int add(int a, int b){
	  System.out.println("Method 1");
	  return a + b;
	  }
	static int add(int a, int b, int c){
	  System.out.println("Method 2");
	  return a + b + c;
	  }
	static int add(int a, int b, int c, int d){
	  System.out.println("Method 3");
	  return a + b + c + d;
	  }

}
