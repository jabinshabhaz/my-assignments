package assignment.week1;

public class EqualsMethod {
		public static void main(String[] args) {
			String text="jabin";
			text="shabhaz";
			System.out.println(text);
			
			String m1="jabinshabhaz";
			String m2="jabinshabhaz";
			
			//a==b  .equal
			
			if(m1==m2) {
				System.out.println("Both are equal");
			}else {
				System.out.println("not equal");
			}
			
			String text1=new String("iqra");
			String text2=new String("Iqra");
			boolean equals = text1.equals(text2);
		    System.out.println(equals);
			if(text1.equals(text2)) {
				System.out.println("Both are equal");
			}else {
				System.out.println("not equal");
			}
			
			
		}
		


}
