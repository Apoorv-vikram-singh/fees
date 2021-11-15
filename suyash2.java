import java.util.Scanner;
class suaysh2
{
    public static void main(String ars[])
    {
        int minimum_fixedd=10000;
        Scanner original=new Scanner(System.in);
        System.out.println("enter your amount");
        int sc= original.nextInt();
        int deposite=original.nextInt();
        int disscount=sc/2;
        double school_leave=sc*.10;
        double sport_fee=sc*.05;
        if(deposite>=disscount)
        {
            System.out.println("you get 5% disscount in your fees comgreatutaion");
        }
        else
        {
            System.out.println("not get disscount sorry sir ");
        }
        double result=school_leave+sport_fee+sc;
        System.out.println("final fees" +result);
    }
        
}
