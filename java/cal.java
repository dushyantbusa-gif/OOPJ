import java.util.*;

public class cal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Number a and b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Entre the C");
        char c = sc.next().charAt(0);
    double ans=0;
        if(c=='+')
        {
            ans=a+b;
        }
        else if(c=='-')
        {
            ans=a-b;
        }
       else if(c=='*')
        {
            ans=a*b;
        }
       else if(c=='/')
        {
            ans=a/b;
        }
       else if(c=='%')
        {
            ans=a%b;
        }
        System.out.println("ans="+ans);
    }
}