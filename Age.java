// this is the first class of taking input from the user and printing it in the system
import java.util.Scanner;
class Age
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.println(" please enter your age ");
        int age = kb.nextInt();
        System.out.println("your age is : "+age);
        
    }
}