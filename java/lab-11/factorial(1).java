// 43. WAP to find factorial of the given number.


import java.util.*;
public class factorial{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the number");
		int n=sc.nextInt();
		int i,f=1;
		for(i=1;i<=n;i++){
			f=f*i;
		}
		System.out.println("factorial="+f);
	}
}
