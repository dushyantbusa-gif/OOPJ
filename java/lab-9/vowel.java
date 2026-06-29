// 37. WAP that prompts the user to enter a letter and check whether a letter is a vowel or consonants. (B)


import java.util.*;

public class vowel{
    public static void main(String[] args){
         Scanner sc =new Scanner(System.in);
        System.out.println("Entre the Char");
        char a = sc.next().charAt(0);

        if(a=='a' || a=='i' || a=='e' || a=='o' || a=='u'|| a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
            System.out.println("vowel");
        }
        else if(a!='a' || a!='i' || a!='e' || a!='o' || a!='u'|| a!='A' || a!='E' || a!='I' || a!='O' || a!='U'){
            System.out.println("consonants");
        }
    }
       
}