// 59. WAP to print the score card of cricket match using the two dimensional array. Take all the input regarding score card from
// the user. (B)


import java.util.*;

class cricket{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]= new int[n][4];
		int i,j,run=0,p=1,p1run,p2run;
		
		for(i=0;i<n;i++){
			System.out.println("Entre the score for player "+p);

			System.out.print("Entre The Ball player:");
			arr[i][0]=sc.nextInt();
			System.out.print("Entre The one run player:");
			arr[i][1]=sc.nextInt();
			System.out.print("Entre The Fours player:");
			arr[i][2]=sc.nextInt();
			System.out.print("Entre The Sixs player:");
			arr[i][3]=sc.nextInt();
			System.out.println();
			p1run=arr[0][1];
			p2run=arr[0][2];			
			run+=arr[i][1];
			p++;

		}
		System.out.println("ball Russ Fours Sixs:");

		for(i=0;i<n;i++){
			System.out.print(arr[i][0]+"     ");
			System.out.print(arr[i][1]+"     ");
			System.out.print(arr[i][2]+"      ");
			System.out.print(arr[i][3]+"   ");
			System.out.println();
		}
		System.out.println("Team Total score:"+run);
	}
}