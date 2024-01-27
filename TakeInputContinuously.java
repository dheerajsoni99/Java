import java.util.Scanner;
class TakeInputContinuously
{
    public static void main(String args[])
    {
        int n,sum=0;
        System.out.println("Enter a nos and type zero to stop");
         Scanner sc = new Scanner (System.in);
        for(;;)
        {
            n= sc.nextInt();
            
            if (n==0){
                break;
            }
            sum=sum+n;

        }
        System.out.println("sum is "+sum);

        
             
    }
}