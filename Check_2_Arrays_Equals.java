package Array_Concepts;

public class Check_2_Arrays_Equals {

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 30, 40 };
		int arr2[] = { 10, 20, 50, 40 };

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				System.out.println(arr1[i] + "=" + arr2[i] + "equal");
			}

			else {
				System.out.println(arr1[i] + "!=" + arr2[i] + "not equal");
			}

		}

	}

}
