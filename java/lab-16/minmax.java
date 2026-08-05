import java.util.*;

class minmax{
	public static void main(String [] s){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(),i;
		int a[]=new int[n];
		
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int max=a[0];
		for(i=1;i<n;i++)
		{
			if(max<a[i]){
				max=a[i];
			}
			if(min>a[i]){
				min=a[i];
			}
		}
		System.out.println("Minimum Number Is "+min);
		System.out.println("Maximum Number Is "+max);
	}
}