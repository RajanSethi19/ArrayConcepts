package Array_Concepts;

public class Check_particular_value_InArray {

	public static void main(String[] args) {
		int a[]= {10,15,30,40};
		
		int search_no =15;
		
		for(int i=0;i<a.length;i++) {
			
			if(search_no==a[i]) {
				
				System.out.println("15 is present in the array and the index is > "+i);
			}
		}

	}

}
