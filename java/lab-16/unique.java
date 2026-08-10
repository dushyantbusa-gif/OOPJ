import java.util.*;

public class unique
{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the number n For Array Size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		int i,d,j,unique=0;
		System.out.println("Entre the number "+n);
		for(i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		for(i=0;i<n;i++){
			d=0;
			for(j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					// d++;
					break;
				}
			}
		if(d==0){
			unique++;
			}
		}

		System.out.println("In the program unique numbers is"+unique);

	}
}