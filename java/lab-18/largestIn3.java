
// 75. WAP to print the largest number from the three given number using Math class function. (B)

import java.util.*;

class largestIn3{
	public static void main(){
		Scanner sc = new Scanner(System.in);

	System.out.println("Entre the 3 Numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int max=Math.max(a,Math.max(b,c));
	System.out.println("max number is "+max);
	}
}