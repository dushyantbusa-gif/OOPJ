// 47. WAP to calculate simple interest using method. (A)

import java.util.*;
public class simpleinterest{

	public static double si(double p,double r,double n){
	double total = (p*r*n)/100;
	return total;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double p,r,n,t;
		System.out.println("Entre the p,r and n");
		p=sc.nextDouble();
		r=sc.nextDouble();
		n=sc.nextDouble();
		t=si(p,r,n);
		System.out.println("You simple Interest is"+t);
	}
}

