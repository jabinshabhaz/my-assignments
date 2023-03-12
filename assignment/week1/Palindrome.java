package assignment.week1;

public class Palindrome {
public static void main(String[] args) {
		//declare a string text
		String text="wow";
		//declare a empty string
		String rev=" ";
		//convert string into char array
		char[]character=text.toCharArray();
		//iterate loop using reverse for loop
		for(int i=character.length;i>=0;i--) {
	   //store the iterating values in reverse string
			rev=rev+character[i];
		}
		System.out.println(rev);
		//compare both strings are equal
		if(text.equals(rev)) {
	    //if it matches the given string is palindrome
			System.out.println("the given string is palindrome");
		}
		//if it doesn't match the given string is not palindrome
			else
			{
			System.out.println("the given is not palindrome");
			
		}
	}
}
	

	
	
	
	
	


