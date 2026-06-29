// 38. WAP to find out largest number from given three numbers without using Logical Operator.(C)

import java.util.*;

public class biginthree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Three Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("A is big");
            }
            else{
                System.out.println("C is big"); 
            }
        }
        else{
            if(b>c){
                System.out.println("B is big");
            }
            else{
                System.out.println("C is big"); 
            }
        }
    }
}
