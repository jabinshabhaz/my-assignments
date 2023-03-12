package assignment.week1;


	import java.util.Scanner;

	public class Pattern {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	        System.out.println("enter no");
			int n=sc.nextInt();
			for(int i=3;i<=n;i++) {
			for(int j=3;j<=i;j++)
				System.out.print(" * ");
			    System.out.println();
			}
		}
	}
	
		
		
	
	
	
		
	
	


