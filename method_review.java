public class method_review {
    public static void main(String[] args){
        //Array
        final String [] GROCERY_ITEMS = {"Nuts", "Beans", "Fish", "Olive Oil"};
        
        //Overloading methods
        outputItems(GROCERY_ITEMS); //Call/Involk method
        
    }//end of main method

    //Define a method that accepts a string array and output the items in array
    public static void outputItems(String [] foodArray){
        //Looping structure to output items
        for(int i = 0; i < foodArray.length; i++){
            System.out.println(foodArray[i]);


        }

        outputItems(foodArray, 2);
    }
    //Define a method that accepts a string array and output the items in array
    public static void outputItems(String [] food, int count){
        //Looping structure to output items
        for(int i = 0; i < count; i++){
            System.out.println(food[i]);
        }
    }
}
