// taking string  input from Scanner class
import java.util.Scanner;
class StringInput
{
    public static void main(String args[])
    {
        String name,name2;
        Scanner kb = new Scanner(System.in);
        System.out.println("please enter your name ");
        name = kb.next();
       name2 = kb.nextLine();
        System.out.println("your name is : " +name +);
            }
}