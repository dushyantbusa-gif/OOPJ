// 53. WAP to find the factorial of given number using recursion. (C)

import java.util.*;
public class factorial{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Entre the n");
		n=sc.nextInt();
		int fac=f(n);
		System.out.println(fac);
	}
public static int f(int n){
	int f=1;
	if(n!=1){
		f=n*f(n-1);
		return f;
	}
	else{
		return f;
	}
	
}
}