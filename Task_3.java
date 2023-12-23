import java.util.Scanner;
import java.util.*;

public class Task_3
{
    public static void main(String args[])
    {
        UserAcc ua=new UserAcc();
        Scanner sc=new Scanner(System.in);
        int num,i;
        for(i=0;i<4;i++)
        {
        System.out.println("");
        System.out.println("");
        System.out.println("******WELCOME TO CODSOFT BANK******");
        System.out.println("");
        System.out.println("");
        System.out.println("Press 1 to Deposit");
         System.out.println("");
        System.out.println("Press 2 to WithDraw");
         System.out.println("");
        System.out.println("Press 3 to Check Your Balance");
         System.out.println("");
        System.out.println("Press 4 to Exit");
         System.out.println("");
        num=sc.nextInt();
        
        switch(num)
        {
            case 1:
                ua.deposit();
                break;
            case 2:
               ua. withdraw();
                break;
            case 3:
                ua.showbal();
                break;
            case 4:
            break;
            default:
            System.out.println("");
        
                System.out.println("Enter Correct Value!");
                 System.out.println("");
        }
    }
    }

}

class UserAcc
{
    Scanner s=new Scanner(System.in);
    double balance=0;
    double wd;
    public void deposit()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("Enter Deposit Amount:");
        balance=s.nextDouble();
         System.out.println("");
    }
    public void withdraw()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("Enter Your Withdrawl Amount:");
        wd=s.nextDouble();
         System.out.println("");
        if(wd>balance)
        {
            System.out.println("");
        System.out.println("");
            System.out.println("Insufficient Balance");
             System.out.println("");
        }
        else if(wd<=balance)
        {
            balance=balance-wd;
        }
    }
    public void showbal()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("Your Current Balance:" + balance);
         System.out.println("");
    }
}