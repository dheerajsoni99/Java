import java.util.Scanner;

class ReverseString
{
    public static void main(String args[])
    {
        String name;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter your name : ");
        name = kb.next();
        for(int i=(name.length()-1);i>=0;i--){
            char ch=name.charAt(i);
            System.out.print(ch);
        }
        
    }
}