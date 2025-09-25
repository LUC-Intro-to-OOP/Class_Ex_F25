/*--------------------------------------------
Program 5: MPLS Dog Management System
	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Spring I 2023
    System: Visual Studio Code, Windows 10
    Author: C. Fulton
*/

import java.util.Scanner; //Importing Scanner Class
public class DogManagement {
    /*
     * Global Declaration for parallel arrays and Scanner Object
     */
    //DECLARING PARALEL ARRAYS OUTSIDE OF MAIN METHOD TO HOLD DOG DATA use the static keyword


    //DECLARING SCANNER OBJECT
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //Call Welcome method
        welcome();
        displayPrompt(); //Calls method to allow user to enter number option

    
    }

    //Welcome method that outputs introductory text explaining program
    public static void welcome(){
        System.out.println("Welcome, this program allows for a care attendant to be able to create, retrieve and update a dog record from the system.");
    }

    //Method to display prompt and return integer values
    public static int displayPrompt(){
        //Local Variables
        int menuOption;

        System.out.println("\nSelect a menu option:");
        System.out.println("\t1) Create a dog record");
        System.out.println("\t2) Display dog record");
        System.out.println("\t3) Update dog record");
        System.out.println("\t4) Exit Program");
        
        System.out.print("Enter selection here --> ");
        //INPUT
        menuOption = Integer.parseInt(scn.nextLine());
        checkMenuOption(menuOption);

        return menuOption;
    }

    //Method to enforce menu selection
    public static int checkMenuOption(int menuOption){

        //Enforce that only 1,2,3,4 is entered
        while(menuOption <= 1 || menuOption >= 4){
            System.out.println("Please enter a number between 1 and 4");
            menuOption = Integer.parseInt(scn.nextLine());
        }

        return menuOption;

    }

  
    

}
