import java.util.*;

public class area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the side for area and perimeter");
        double s = sc.nextDouble(); 
        double sa = s*s;
        double sp = 4*s;
        System.out.println("Square area and perimeter");
        System.out.println("area="+sa);
        System.out.println("perimeter="+sp);
        System.out.println("Entre the side for area and perimeter");
        double l = sc.nextDouble(); 
        double w = sc.nextDouble(); 
        double ra = l*w;
        double rp = 2*(w+l);
        System.out.println("Rectangle area and perimeter");
        System.out.println("area="+ra);
        System.out.println("perimeter="+rp);
        

    }
}
