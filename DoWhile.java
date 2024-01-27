import java.util.Scanner;
class DoWhile
{
    public static void main(String args [])
    {
        Scanner kb=new Scanner(System.in);
        boolean b;
        do {
                    System.out.println("enter two numbers");

            int n=kb.nextInt();
            int m = kb.nextInt();
            int sum = n+m;
            System.out.println("the sum is : "+sum);


            System.out.println("do you want to continue or not : true/false");
             b = kb.nextBoolean();
        }while(b==true);
    }
}