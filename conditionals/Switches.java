public class Switches{

      public static void main(String[] args) {
      	
	String day = "Lunes";

	switch (day) {
	  case "Monday": System.out.println("The first day of the working week");
	  break;
	  case "Tuesday": System.out.println("Getting use to the week");
	  break;
	  case "Wednesday": System.out.println("Halfway there");
	  break;
	  case "Thursday": System.out.println("Little friday");
	  break;
	  case "Friday": System.out.println("Finally free");
	  break;
	  case "Saturday": System.out.println("Recovering from last night party");
	  break;
	  case "Sunday": System.out.println("Day for family");
	  break;
	  default: System.out.println("That is not a day");
	}
      }
}
