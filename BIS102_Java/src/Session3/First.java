package Session3;

public class First {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displayAddress();
		
		calculateGross(50.3,12);
	}
	
	public static void calculateGross(double hours, int a) {
		// TODO Auto-generated method stub
		final double STD_RATE = 13.75;
		double gross;
		gross = hours *STD_RATE;
		System.out.println(hours + " hours at $"+STD_RATE + " per hour is $" + gross);
		
		
	}
	
//	public static void displayAddress() {
//		// TODO Auto-generated method stub
//		System.out.println("XYZ Company");
//		System.out.println("8900 U.S Hwy 14");
//		System.out.println("Crystal lake IL60014");
//		 
//	}
	
}
