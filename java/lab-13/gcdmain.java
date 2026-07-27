// 51. Write a method with following method header: public int gcd (int num1, int num2). Write a program that prompts the user to
// enter two integers and compute the gcd of two integers. [Note: The greatest common divisor (GCD) of two numbers is the largest
// number that divides them both.] (B)


import java.util.*;

public class gcdmain
{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=gcd(a,b);
		System.out.println("your gcd is"+ans);

	}
	public static int gcd(int num1, int num2){
		int n=1,gcd1=1;
		if(num1>num2){
			n=num2;
		}
		else{
			n=num1;
		}
		for(int i=1;i<=n;i++){
			if(num1%i==0 && num2%i==0){
				gcd1=i;
		}
		}
		return gcd1;
	}
}