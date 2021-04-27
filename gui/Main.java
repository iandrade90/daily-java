//Import JOptionPane
import javax.swing.JOptionPane;

/**
* Main
*/
public class Main {

	public static void main(String[] args) {
		
	  String name = JOptionPane.showInputDialog("Enter your name"); //With this line, a GUI box is displayed
	  JOptionPane.showMessageDialog(null, "Hello, " + name); //Info stored in name is shown in a box

	  int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //The Integer.parseInt is used to convert the input line to int
										    //Double.parseDouble is the double version of this convertion
	  JOptionPane.showMessageDialog(null, "Your age is: " + age);
	}
}
