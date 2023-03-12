package assignment.week1;
public class PrintDuplicate{

	public static void main(String[] args) {
		//declare a string
		int num[]= {1,2,2,4,4,1,5,6,7,8,8};
		//1,4,8
		//Iterate the value 0 to array length
		for (int i = 0; i < num.length; i++) {
			//iterate another for loop j=i+1
			for (int j = i+1; j < num.length; j++) {
				//check equals
				if(num[i]==num[j]) {
					System.out.println(num[i]);
			}
			}
			
		}
	}
}
	
			
			


