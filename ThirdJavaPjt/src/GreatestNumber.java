
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkgreatestnumber(1, 2, 5670);
		checkgreatestnumber(1, 2, 3);
		checkgreatestnumber(2, 3, 4);
		// int a,b,c;
		// a=70;
		// b=89 ;
		// c=3001;
//	if (a>=b && a>=c){
//	 System.out.println(a+"is the greatest number");
//	}	 
//	else if (b>=c && b>=a) {
//	 System.out.println(b+"is the greatest number");
//	 }
//	 else{
//		 System.out.println(c + "::c is greater than a and b");
//	 
//	
//	 }
//	   
//	    float    a= -11.5f;
//		int b= 20; 
//				float c= 2.5f;
//	        if( a >= b && a>= c) {
//	       System.out. println(a + " is the largest number.");}
//	        else if (b >= a && b >= c) {
//	     System.out.println(b + " is the largest number.");
//	        }else {
//	     System.out.println(c+ " is the largest number.");
//	}

	}

	private static void checkgreatestnumber(int a, int b, int c) {
		// TODO Auto-generated method stub
		if (a >= b && b >= c) {
			System.out.println(a + "is the greatest number");
		} else if (b >= a && b >= c) {
			System.out.println(b + "is the greatest number");

		} else {
			System.out.println(c + "is gteater");
		}

	}

}
