
public class PALINDROME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=33, sum=0;
		int temp=a;
		int r;
	    while(a>0)	{
	    	r=a%10;
	    sum= (sum*10)+ r;
		a=a/10;
	    }
		if(temp==sum) {
		System.out.println(sum+  "the given number is palindrome ");
		}
		
		else {
			System.out.println(sum + "not a palindrome");
		}}}

