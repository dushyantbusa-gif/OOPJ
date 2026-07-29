// 55. WAP to count number of even or odd number from an array of n number. (A)

import java.util.*;
public class oddeven
{
	public static void main(String[] s){
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre ther Number");
			int n,even=0,odd=0;
			n=sc.nextInt();
			int arr[]=new int[n];
			int i;
			System.out.println("Entre "+n+" Number");
			for(i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}	
			for(i=0;i<n;i++){
				if(arr[i]%2==0){
					 even++;
				}
				else{
					odd++;
				}
			}
			System.out.println("your total Even Numbers is..."+even);
			System.out.println("your total Odd Numbers is..."+odd);


	}
} 	