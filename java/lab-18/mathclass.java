// 73. WAP to demonstrate the builtin function of Math class
// ( e.g. min(), max(), random(), pow(), sqrt(), round(), ceil(), floor(),abs())

import java.util.*;

class mathclass{
	public static void main(){
		double a;
		a=Math.max(2,5);
		System.out.println("min="+a);
		a=Math.max(2,5);
		System.out.println("max="+a);
		a=Math.random();
		System.out.println("random"+a);
		a=Math.pow(2,5);
		System.out.println("pow"+a);
		a=Math.sqrt(25);
		System.out.println("sqrt"+a);
		a=Math.round(4.55);
		System.out.println("round"+a);
		a=Math.ceil(2.44);
		System.out.println("ceil"+a);
		a=Math.floor(2.44);
		System.out.println("floor"+a);
		a=Math.abs(-232);
		System.out.println("abs"+a);
	}
}