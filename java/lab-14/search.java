// 57. WAP to accept n numbers in an array. Now, enter a number and search whether the number is present or not in the list of
// array elements by using linear search. (C)

import java.util.*;

public class search
{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		int i,d=0;
		System.out.println("Entre The Number");
		int n = sc.nextInt();
		System.out.println("Entre The Number For Search ");
		int se = sc.nextInt();
		int a[]=new int[n];
		System.out.println("Entre "+n+" Number");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		for(i=0;i<n;i++){
			if(se==a[i]){
				d++;
			}
		}


		if(d!=0){
			System.out.println("present in this arrey "+d+" Times");
		}
		else{
			System.out.println("Not present in this arrey");
		}
	}
}