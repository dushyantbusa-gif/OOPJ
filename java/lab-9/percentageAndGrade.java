// Calculate grade of a student depending on percentage. (If >90% then A+ grade,
// 80-90% then A grade, 70-80% then B+ grade, 60-70% then B grade, 50-60% then C grade, 35-50% then P grade and <35 then FT)

import java.util.*;

public class percentageAndGrade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Marks");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int Total = sub1+sub2+sub3+sub4+sub5;
        double percentage=Total/5;

        System.out.println("Total="+Total);
        System.out.println("percentage="+percentage);
        System.out.print("grade");

        if(percentage >= 90){
            System.out.println("A+");
        }
        else if(percentage >= 80){
            System.out.println("A");
        }
        else if(percentage >= 70){
            System.out.println("B+");
        }
        else if(percentage >= 60){
            System.out.println("B");
        }
        else if(percentage >= 50){
            System.out.println("C");
        }
        else if(percentage >= 35){
            System.out.println("P");
        }
        else if(percentage < 35){
            System.out.println("F");
        }
    }
}