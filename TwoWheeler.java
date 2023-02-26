package week1day1;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=222222L;
	boolean isPunctured=false;
	String bikeName="RoyalEnfeild";
	double runningKM=5500.54;

	public static void main(String[] args) {
		TwoWheeler bike=new TwoWheeler();
		   System.out.println(bike.noOfWheels);
		   System.out.println("No.of mirrors ="+bike.noOfMirrors);
		   System.out.println("chassis Number "+" ="+bike.chassisNumber);
		   System.out.println(bike.isPunctured);
		   System.out.println("Bike Name ="+bike.bikeName);
		   System.out.println("runningKM "+" ="+bike.runningKM);
	
}
}


}
