import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        int num,digit,reverse,original;
        System.out.println("Enter Num :");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        original=num;
        reverse=0;
        while(num>0)
        {
            digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(original==reverse)
        {
            System.out.println("No is Palindrom");
        }
        else{
            System.out.println("no is not palindrom");
        }
        
    }
}