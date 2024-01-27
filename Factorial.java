import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {
        int b=1;
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a integer");
        int a= kb.nextInt();

       while(a>1)
       {
            b=b*a;
            a--;
            System.out.println("the factorial is : "+b);
       }
        System.out.println("factorial of given number is "+b);
       
        

       /*for(a=(b-1);a<1;a--){
            b=b*a;

         System.out.println("factorial of given number is "+b);
       }   
           
         System.out.println("factorial of given number is "+b);
        */
    }
}