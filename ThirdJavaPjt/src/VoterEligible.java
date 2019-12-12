
public class VoterEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// int voter=11;
//if (voter>=18) {
//	System.out.println("voter is eligible");
//	
//}else {
//	System.out.println("not eligible");
//}

		checkeligibility(1);

	}

	public static void checkeligibility(int voter) {

		if (voter >= 18) {
			System.out.println("eligible");

		} else {
			System.out.println("not eligible");
		}

	}
}
