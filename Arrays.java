/* write a program to creare an array of size n, where n should be taken from the user.
 and then aske user for input its elements and then show its sums and average as well as show
  the actual array elements
*/

import java.util.Scanner;
class Arrays
{
    public static void main(String args [])
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a integer (Size of array) : ");
        int a= kb.nextInt();
        int arr[];
        arr=new int[a];
        int inp,sum=0;
        double av;
        for(inp=0;inp<a;inp++)
        {
            System.out.println("enter element to array"+inp);
            arr[inp]=kb.nextInt();
             sum = sum+arr[inp];
           
            
        }
        
        System.out.println("the sum is "+sum);
        av=sum/a;
        System.out.println("the average is "+av);

        
    }
}