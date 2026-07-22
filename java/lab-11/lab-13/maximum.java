// 48. WAP to find maximum number from given three numbers using method. (A)

import java.util.*;

public class maximum{
	public static void main(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre the number a b and c");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int m = max(a,b,c);
	System.out.println("max is "+m);
	}

public static int max(int a, int b,int c){
	if(a>b && a>c){
		return a;
	}
	else if(b>c){
		return b;
	}
	else{
		return c;
	}
}
}