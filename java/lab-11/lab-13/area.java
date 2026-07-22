// 49. WAP that calculates area of circle, triangle and square using method overloading. (A)


import java.util.*;
public class area{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the r for area of circle");
		double r=sc.nextDouble();
		double c = circle(r);
		System.out.println("You area of square is"+c);


		System.out.println("Entre the b and h for area of triangle");
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		double t = triangle(b,h);
		System.out.println("You area of square is"+t);

		System.out.println("Entre the a for area of square");
		double a=sc.nextDouble();
		double s = square(a);
		System.out.println("You area of square is"+s);
	}

public static double circle(double r){
	double circle = 3.14*r;
	return circle;
}
public static double triangle(double b,double h){
	double triangle = (b*h*1)/2;
	return triangle;
}
public static double square(double a){
	double square = a*a;
	return square;
}
}