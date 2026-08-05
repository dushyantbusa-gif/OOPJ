import java.util.*;

class transpose{
	public static void main(String [] s){
		Scanner sc =new Scanner(System.in);
		System.out.print("Entre the row and col");
		int r=sc.nextInt(),i,j;
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Entre the "+r*c+" Numbers");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Your array");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("transpose");
		for(i=0;i<c;i++){
			for(j=0;j<r;j++){
				System.out.print(a[j][i]);
			}
			System.out.println();
		}


		}
}