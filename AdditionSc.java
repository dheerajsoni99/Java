// this addition is done using Scanner class not using command line arguments



import java.util.Scanner;
class AdditionSc
{
    public static void main(String args[])
    {
        int a,b,sum;
       Scanner kb = new Scanner(System.in);
       System.out.println("enter first number : ");
       a=kb.nextInt();
       System.out.println("enter second number : ");
       b=kb.nextInt();
       sum=a+b;
       System.out.println("sum is :"+sum); 
    }
}