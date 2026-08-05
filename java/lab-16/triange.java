import java.util.*;

class triange{
	public static void main(String [] s){
		Scanner sc =new Scanner(System.in);
		System.out.print("Entre the row and col");
		int r=sc.nextInt(),i,j,k;
		int a[][]=new int[r][r];
		System.out.println("Entre the "+r*r+" Numbers");
		for(i=0;i<r;i++){
			for(j=0;j<r;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Your array");
		for(i=0;i<r;i++){
			for(j=0;j<r;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("lower triange");
		for(i=0;i<r;i++){
			for(j=0;j<=i;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("upper triange");
		for(i=0;i<r;i++){
			for(k=4;k>i;k--){
				System.out.print(" ");
			}
			for(j=r;j>0;j--){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		}
}