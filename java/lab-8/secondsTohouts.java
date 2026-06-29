import java.util.*;

public class secondsTohouts{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();	
		
		int hh = sec/3600;
		int min = (sec%3600)/60;
		int second = sec%60;
	System.out.println(+hh +":" +min +":" +second);
		
}
}