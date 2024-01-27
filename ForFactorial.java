import java.util.Scanner;
class ForFactorial
{
    public static void main(String args[])
    {
        int n,f=1;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter number");
        n=kb.nextInt();
        for(int i=n;i>0;i--)
        {
            f=f*i;
            System.out.println("operations :"+ i +" "+f);
        }
        System.out.println("complete factorial is : "+f);


    }
}
