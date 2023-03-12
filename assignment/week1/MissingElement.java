package assignment.week1;
import java.util.Arrays;
public class MissingElement{
public static void main(String[] args) {
			int number[]= {1,4,3,2,6,7};
			//output :5
			//sort the array in ascending order
			Arrays.sort(number);
			for (int i = 0; i < number.length; i++) {
			if(number[i]!=i+1) {
				System.out.println("missing element is:");
			    System.out.println(i+1);
				break;
					
				}
				
			}
			
			}
		
				
			}
			
		
		
		



