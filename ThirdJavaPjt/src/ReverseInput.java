
public class ReverseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 987654321, reversedno = 0;
		while (number != 0) {
			int d = number % 10;
			reversedno = reversedno * 10 + d;
			number = number / 10; /* num/=10 */
		}
		System.out.println("Reversed Number: " + reversedno);

	}

}
