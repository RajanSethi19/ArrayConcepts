package Array_Concepts;

public class Average_Value_of_Array {

	public static void main(String[] args) {
		int a[] = { 10, 12, 33, 44, 50 };

		int sum = 0;
		double avg = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		avg = sum / a.length;

		System.out.println(avg);
	}

}
