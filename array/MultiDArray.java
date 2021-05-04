/**
* MultiDArray
*/
public class MultiDArray {

	public static void main(String[] args) {
		
	  //Arrays inside array
	  
	  String[][] cars = new String[3][3];

	  cars[0][0] = "Camaro";
	  cars[0][1] = "Corvette";
	  cars[0][2] = "Silverado";
	  cars[1][0] = "Mustang";
	  cars[1][1] = "Buick";
	  cars[1][2] = "Chevy";
	  cars[2][0] = "F-150";
	  cars[2][1] = "Passat";
	  cars[2][2] = "Fiat Uno";

	  for (int i = 0; i < cars.length; i++) {
		System.out.println();
	  	for (int j = 0; j < cars[i].length ; j++) {
	  		System.out.println(cars[i][j]);
	  	}
	  }

	  String[][] countries = {{"Argentina", "Canada", "Chile"},
				  {"England", "Spain", "Ireland"},
				  {"Germany", "Denmark", "Poland"}};

	  for (int i = 0; i < countries.length; i++) {
	  	System.out.println();
		for (int j = 0; j < countries[i].length; j++) {
			System.out.println(countries[i][j]);
		}
	  }

	}
}
