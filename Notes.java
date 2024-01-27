// greater notes first 
// denomination notes after very hard struggle


class Notes
{
	public static void main(String [] args) 
	{	
		int x10=(3750%2000%1000%500%100%50%20)/10 ;
		int x20 =(3750%2000%1000%500%100%50)/20;
		
		int amount = 3750;
		System.out.println("Rs 2000 ------- "+(3750/2000)+"notes");
		System.out.println("Rs 1000 --------"+((3750%2000)/1000)+"notes");
		System.out.println("Rs 500 -------"+ (3750%2000%1000)/500+" notes");
		System.out.println("Rs 100 --------" +(3750%2000%1000%500)/100+" notes");
		System.out.println(" Rs 50 ---------" + (3750%2000%1000%500%100)/50+"notes " );
		System.out.println(" Rs 20 ----------" +x20+" notes " );
 		System.out.println(" Rs 10 --------" +x10+ " notes");



	}
}
