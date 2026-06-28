import java.util.*;

public class metersTofeet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Meter");
        double meter = sc.nextDouble();

        double feet = meter*3.28084;

        System.out.println("Feet="+feet);
    }
}