import java.util.*;

public class percentage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Meter");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int Total = sub1+sub2+sub3+sub4+sub5;
    double percentage=Total/5;

        System.out.println("Total="+Total);
        System.out.println("percentage="+percentage);
    }
}