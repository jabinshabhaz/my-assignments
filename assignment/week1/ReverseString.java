package assignment.week1;

public class ReverseString {
	public static void main(String[] args) {
		//declare string
	    String sha = "jabinshabhaz";
	    //convert string into character array
	    char[] letters=sha.toCharArray();
	    //iterate using reverse for loop

	    for (int i =letters.length-1; i >=0; i--) {
	    System.out.println(letters[i]);
	    }
	  }
	}


