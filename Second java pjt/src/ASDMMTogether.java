

public class ASDMMTogether /*additionsubtractionmultiplicationdivision....
*/
{
	public static void main(String[] args) {
		int x, y;
		x = 10;
		y = 30;
		int sum = y + x;
		int sub = x - y;
		int mul = x * y;
		int div = x / y;
		int mod = x % y;
		System.out.println("summary of two numbers : " + sum);
		System.out.println("sub of two numers : " + sub);
		System.out.println("multiplication of two numbers : " + mul);
		System.out.println("modules of two numbers :" + mod);
		System.out.println("division of two numbers : " + div);

		if (sum > sub ) {
			System.out.println("sum is greater");
		}
		else {
		System.out.println( "nothing matched");
		
		}
	
		if (sub<sum || sub>mul || sub<div  || sub<mod)
		{
		
			System.out.println("sub is greater"); 
		}
		 if(sub<mul ) {
	
		
	System.out.println("print ok ");
		}
		
		else {
		System.out.println("not matched");
		}
		
		
		
		

		System.out.println("hello world ");

	}

}
