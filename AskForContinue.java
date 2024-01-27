import java.util.Scanner;

class AskForContinue
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        String Ask;
        do{
            System.out.println("enter two numbers : ");
            int a=kb.nextInt();
            int b=kb.nextInt();
            int sum =  a+b;
            System.out.println("the sum is : "+sum);
            System.out.println("Do you want to continue : (Yes/No)");
            Ask = kb.next();

        }while(Ask.equalsIgnoreCase("Yes"));
        
        
        
    }
}