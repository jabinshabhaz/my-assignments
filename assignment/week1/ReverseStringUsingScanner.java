package assignment.week1;
import java.util.Scanner;

public class ReverseStringUsingScanner {
public static void main(String[] args) {
	//declare a scanner class
	 Scanner scan =new Scanner(System.in);
	 System.out.println("Enter your name");
      String nextLine = scan.nextLine();
      //convert string into character array
      
		char[] character= nextLine.toCharArray();
		//iterate array using reverse for loop
		for(int i=character.length-1;i>=0;i--)
		{
			System.out.print(character[i]);
		}
		
	}

}


