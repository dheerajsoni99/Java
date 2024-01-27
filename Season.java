class Season
{

	public static void  main(String[] args)
	{ 	
		System.out.println("enter month number");
		
		int month = Integer.parseInt(args[0]);

		switch(month){
		 	case 1 :
case 11:
case 12:
case 2 : 
				System.out.println("winter season " );

					break;
			case 3:
case 4 :
case 5 : 
case 6:
				System.out.println("summer season");
				break;

			case 7:
case 8:
case 9:
case 10 :
				System.out.println("rainy season " );
			default :
				System.out.println("invalid");
}

}
}