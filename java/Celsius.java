import java.util.*;
class Celsius {
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Entre the f");
	double f = sc.nextDouble();
	double c = (f-32)*5/9;
	System.out.println(" Fahrenheit to Celsius = "+c);
}
}

