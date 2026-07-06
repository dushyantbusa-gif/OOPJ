// 44. WAP to find whether the given number is prime or not without using function.


import java.util.*;
public class prime{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the number");
		int n=sc.nextInt();
		int i,f=0;
		for(i=1;i<=n;i++){
			if(n%i==0){
				f++;
			}
		}
		if(f==2){
			System.out.println("number is prime");
		}
		else{
			System.out.println("number not prime");
		}
		
	}
}
