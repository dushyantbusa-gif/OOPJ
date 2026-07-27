// 50. WAP to generate Fibonacci series of N given number using method. (B)

import java.util.*;
public class fibonacci{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Entre the n");
		n=sc.nextInt();
		f(n);
	}
public static void f(int n){
	int a=0,b=1,i;
	for(i=1;i<=n;i++){
		System.out.println(a);
		int t=a+b;
		a=b;
		b=t;
	}
}
}

