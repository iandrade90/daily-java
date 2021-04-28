
import java.util.Random;

/**
* RandomN
*/
public class RandomN {

	public static void main(String[] args) {
		
	  Random random = new Random();
	  
	  int x = random.nextInt(10) +1;

	  double y = random.nextDouble();

	  boolean b = random.nextBoolean();

	  System.out.println("Random integer number: " + x);
	  System.out.println("Random double number: " + y);
	  System.out.println("Random boolean statement: " + b);
	}
}
