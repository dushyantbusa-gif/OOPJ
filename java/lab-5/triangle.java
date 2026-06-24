import java.util.*;

class triangle {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

	System.out.println("Entre the Number a,b and c");
	float a = sc.nextFloat();
	float b = sc.nextFloat();
	float c = sc.nextFloat();
	
	if(a==b && b==c){
	System.out.println("e");
	}
	else if(a==b || b==c || c==a){
		System.out.println("I");
	}
	else if(
		(a*a + b*b ==c*c)||
		(c*c + b*b ==a*a)||
		(a*a + c*c ==b*b)
	){
		System.out.println("right");
	}
	else{
		System.out.printf("s");
	}
    }
}
