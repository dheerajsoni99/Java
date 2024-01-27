import java.util.Scanner;
class TakeNos
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;

        System.out.println("enter numbers and enter zero to stop");
        while(true)
        {
            n=sc.nextInt();
            if(n==0){
                break;

            }

            sum=sum+n;
        }

        System.out.println("sum of the given numbers is the : "+sum);
    }



}