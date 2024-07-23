package Array_Concepts;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int k=0;
		int arr2[]= new int[arr1.length];
		
		for(int i=arr1.length-1;i>=0;i--) {
			
			arr2[i]=arr1[k];
			k++;
		}
		System.out.println(Arrays.toString(arr1));
System.out.println(Arrays.toString(arr2));
	}

}
