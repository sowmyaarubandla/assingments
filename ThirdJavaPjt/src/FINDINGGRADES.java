//import java.util.Scanner;
public class FINDINGGRADES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Average Score:");
//		int num = sc.nextInt();
//	if (num>=90)	{
//		System.out.println(num+ "%: grade A");
//	}
//		else if (num>=70 && num<90) {
//			System.out.println(num+ "%: grade B");
//		
//		
//		}
//		else {
//			System.out.println( num+ "%: gradec");
//	}
//	
//	

		studentgrades(23);
		studentgrades(45);
		studentgrades(90);

//		-if the average score >=90% =>grade=A
//				-if the average score >= 70% and <90% => grade=B
//				-if the average score>=50% and <70% =>grade=C
//				-if the average score<50% =>grade=F

	}

	private static void studentgrades(int i) {
		// TODO Auto-generated method stub
		if (i >= 90) {
			System.out.println(i + "%: grade A");
		} else if (i >= 70 && i < 90) {
			System.out.println(i + "%: grade B");

		} else {
			System.out.println(i + "%: gradec");
		}
	}
}
