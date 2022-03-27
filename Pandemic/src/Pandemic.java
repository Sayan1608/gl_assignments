import java.util.Scanner;

public class Pandemic {

	public void implementationOfBubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean sorted = true;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j-1] > arr[j]) {
					sorted = false;
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			if (sorted) {
				break;
			}
		}
	}

	public int isCureable(int[] vaccineStrengths, int[] patientImmunityStrengths) {
		int count = 0;
		for (int i = 0; i < vaccineStrengths.length; i++) {
			if (vaccineStrengths[i] < patientImmunityStrengths[i]) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pandemic obj = new Pandemic();

		System.out.print("Enter the no of entries : ");
		int n = in.nextInt();

		int[] vaccineStrengths = new int[n];
		int[] patientImmunityStrengths = new int[n];

		System.out.println("Enter the Vaccine Strengths : ");
		for (int i = 0; i < n; i++) {
			vaccineStrengths[i] = in.nextInt();
		}

		obj.implementationOfBubbleSort(vaccineStrengths);

		System.out.println("Enter the Patient Immunity Strengths : ");
		for (int i = 0; i < n; i++) {
			patientImmunityStrengths[i] = in.nextInt();
		}

		obj.implementationOfBubbleSort(patientImmunityStrengths);
		in.close();

		if (obj.isCureable(vaccineStrengths, patientImmunityStrengths) != 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}
