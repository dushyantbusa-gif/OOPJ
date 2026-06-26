import java.util.*;

public class swap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre the number a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t;
		System.out.print("Number Sewp is >>> ");
		t=a;
		a=b;
		b=t;
		System.out.print("a="+a);
		System.out.print("b="+b);
	}
}