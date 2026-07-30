import java.util.*;

public class sum
{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre The Number");
		int n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("Entre "+n+" Number");
		int i,sum=0;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			if(a[i]%3==0 || a[i]%5==0){
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of 3 and 5 divisible = " +sum);
	}
}