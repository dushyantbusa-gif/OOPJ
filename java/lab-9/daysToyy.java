import java.util.*;

public class daysToyy{
	public static void main(String[] args){
		System.out.print("Entre the Days");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();	
		int yy = day/365;
		int mm = (day%365)/30;
		int dd = (day%365)%30;
	System.out.println(+yy +":" +mm +":" +dd);	
}
}