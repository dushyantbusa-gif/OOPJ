import java.util.*;
// CI=P(1+(r/100))^nt.
public class CompoundInteres{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre the number p,r and nt");
		double p = sc.nextDouble();
		double r = sc.nextDouble();
		double nt = sc.nextDouble();
		System.out.println("CompoundInteres is ...");
		double ci=p*Math.pow((1+r/100),nt);
		System.out.println("ci"+ci);
	}
}