import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first num : ");
		int num1 = in.nextInt();
		System.out.print("Enter the second num : ");
		int num2 = in.nextInt();

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

}
