// accepting input from the user
// command line arguments used
class Command 
{
	public static void main( String [] args)
	/*	{
		 System.out.println("hello? "+ args[0]);
		 System.out.println("hello " + args[1]);
		System.out.println("hello, Bye ");
		}*/
// enter "java Command Dheeraj" at time of running the code
// having two arguments and accessing three will give run time error that is called exception 
// having three inputs and accessing two will not give any run time error


		{
				
				int a,b;
					a= Integer.parseInt( args[0]);
					b= Integer.parseInt(args[1]);

				System.out.println("first number is : " +a);
				System.out.println("Second number is : " +b);
				System.out.println("addition is  : "+ (a+b));
}
}

