public class calendar_output
    {
        public static void main(String[] args)
        {
          String [] MONTHS = {"Jan.", "Feb.","Mar.", "Apr.", "May", "Jun","Jul","Aug", "Sept.", "Oct","Nov", "Dec"};
          final int MONTH_END = 12;
          int maxCount;
          final int FEB_COUNT = 28;
          final int THIRTY_DAY_COUNT = 30;
          final int MAX_DAY_COUNT = 31;
          int x = 1;
          int i;
          // February 28 days, April, June, Sept. November
          
          //Looping structure that iterat through the month
          while(x <= MONTH_END){ 
              System.out.println("For " + MONTHS[x-1]);
             //Iterate through the days

             //Decision Making Logic to determine day count
             maxCount = MAX_DAY_COUNT;
             if(x == 2){
                 maxCount= FEB_COUNT;
             }else if(x == 4 || x == 6 || x == 9 || x == 11 ){
                 maxCount = THIRTY_DAY_COUNT;
             }
             i = 1; //starting value
             //inner loop
             while(i <= maxCount){

                System.out.print(i + "\t");

                 i++; //incrementing the number
             } //End of inner Loop
              System.out.println(" ");
              x++;
          }
        }
    }
