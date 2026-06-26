import java.util.*;

public class swapwithout{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre the number a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("Number Sewp is >>> ");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("a="+a);
		System.out.print("b="+b);
	}
}