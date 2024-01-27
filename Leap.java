class Leap
{
    public static void main(String args[])
    {
        int year = Integer.parseInt(args[0]);
        if (year%4==0 || year%400==0){
            System.out.println("its a leep year");
        }else if(year%100==0){
            System.out.println("its not ");
        }else{
            System.out.println("its not a leap year");
        }
    }

}