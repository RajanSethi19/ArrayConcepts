package Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class Array_With_Scannerclass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int a = sc.nextInt();

		int arr[] = new int[a];

		for (int i = 0; i < arr.length; i++) {
			//System.out.println("Enter the values");
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

	}

}
