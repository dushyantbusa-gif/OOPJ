// 52. WAP to accept a number and check whether the number is prime or not. Use method name check (int n). The method returns
// 1, if the number is prime otherwise, it returns 0. (C)

import java.util.*;

public class primenum
{
	public static void main(String[] s)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre the number");
		n=sc.nextInt();
		int p=prime(n);
		if(p==1){
			System.out.println("Number is prime");
		}
		else{
			System.out.println("Number is Not prime");
		}
	}
	public static int prime(int n){
	int f=0,i;
	for(i=1;i<=n;i++){
		if(n%i==0){
			f++;
		}
	}
	if(f==2)
		return 1;
	else
		return 0;
	}
}
