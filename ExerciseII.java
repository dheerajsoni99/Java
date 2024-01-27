// ExerciseII  absolute values


class ExerciseII 
{
public static void main(String [] args)
{

/*int b = Integer.parseInt(args[0]);
int a = (b<=0) ?(-b):(b);
System.out.println(a);*/

// all code in one statement 
int a = (Integer.parseInt(args[0])<=0)?(System.out.println(Integer.parseInt(args[0])) ):(System.out.println(Integer.parseInt(args[0])));
}
}