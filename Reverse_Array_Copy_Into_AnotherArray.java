package Array_Concepts;

import java.util.Arrays;

public class Reverse_Array_Copy_Into_AnotherArray {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		int array_Copy[] = new int[array.length];
		int k = 0;
		for (int i = array.length - 1; i >= 0; i--) {

			array_Copy[i] = array[k];
			k++;

		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array_Copy));

	}

}
