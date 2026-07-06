// 42. WAP to print numbers between two given numbers which is divisible by 2 but not divisible by 3.


import java.util.*;

public class numbersbetween{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre the number A");
		int a = sc.nextInt();

		System.out.println("Entre the number A");
		int b = sc.nextInt();
		int i;

		for(i=a;i<=b;i++){
			if(i%2==0 && i%3!=0){
				System.out.println(i);
			}
		}

	}
	
}