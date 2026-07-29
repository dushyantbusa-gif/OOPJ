// 54. WAP that create an array, take the size of array from the user, take the array member from the user and display it using loop.
// (A)

import java.util.*;
public class arrayprint
{
	public static void main(String[] s){
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre ther Number");
			int n;
			n=sc.nextInt();
			int arr[]=new int[n];
			int i;
			System.out.println("Entre "+n+" Number");
			for(i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println("your Number is...");	
			for(i=0;i<n;i++){
				System.out.println(arr[i]);
			}
	}
} 	