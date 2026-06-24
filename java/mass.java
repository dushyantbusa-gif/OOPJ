import java.util.*;
class mass {
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Entre the w and h");
	double p = sc.nextDouble();
	double i= sc.nextDouble();
	double w = p*0.45359237;
	double h = i*0.0254;
	double bmi = w/(h*h);
	System.out.println("bmi = "+bmi);
}
}

