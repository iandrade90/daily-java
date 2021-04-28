import javax.swing.JOptionPane;

/**
* Main
*/
public class Main {

	public static void main(String[] args) {
		
	  //Math.max(double) is used to find the max number of given variables -- Math.min() is the opposite
	  //Math.abs() to find the abosolute number
	  //Math.sqrt() to find square root
	  //Math.round() to round a number
	  //Math.ceil() to round up a number
	  //Math.floor() to round down a number
	  //
	  //Find the hypotenuse of a triangle
	  
	  double side_a = Double.parseDouble(JOptionPane.showInputDialog("Enter the side a of the triangle"));
	  double side_b = Double.parseDouble(JOptionPane.showInputDialog("Enter the side b of the triangle"));

	  double result = Math.sqrt(Math.pow(side_a, 2) + Math.pow(side_b, 2));

	  JOptionPane.showMessageDialog(null, "The hypotenuse of the triangle is " + result);

	}
}
