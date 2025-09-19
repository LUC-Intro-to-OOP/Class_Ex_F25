/*	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Fall 1 2025
    System: Visual Studio Code, Windows 10
    Author: C. F
*/
import java.util.Scanner;
public class DailyLog {
    public static void main(String[] args) throws Exception {
        
        //DECLARATIONS *Make sure to also consider all variables that will keep tally and initialize to zero; declare scanner object
        final int EXIT = -1; //Sentinal Value
        int attendantID;

        //Declare scanner object
        Scanner input = new Scanner(System.in);

        //Call Welcome Message method
        outputWelcomeMsg(); //Define or involk the method

        //Create Space
        System.out.println("");

        //OUTPUT OF CARE ATTENDANT INFO.
        System.out.println("Enter 11 for Noah Charles");
        System.out.println("Enter 22 for Silas Alexander");
        System.out.println("Enter 33 for Chris Isaac");
        System.out.println("Enter 44 for Mya Lynn");

        //PRIMER
        attendantID = Integer.parseInt(input.nextLine());




        //Looping structure that allow for continous iteration and checks against sentinel value
        do{
                //Enfore that only 11, 22, 33, 44 and sentinel value can be entered
                //Looping structure to lock them into the loop. It's only when they enter the correct value 
                //that would allow the end-user to exit the loop
                while(attendantID != 11 && attendantID != 22 && attendantID != 33 && attendantID != 44){
                    System.out.println("Invalide Entry, please enter a valid atendant ID number 11, 22, 33 or 44");
                    attendantID = Integer.parseInt(input.nextLine());
                }

                //Selection structure to Determine which dogs to display based on attendant id number 

                    //Enforce that dog ID is an applicable number for attendant according to the chart


                //Gather rest of information such as total numbers of min. spent with dog and dog note


                //Selection structure to consider edge case for dog id 388


                //Selection structure to Determine color count and total time spent by color


                //Increment count for total entries



                //OUTPUT OF CARE ATTENDANT INFO. Example of format below
                /*
                    System.out.println("Dog Information:");
                    System.out.println("*********************************");
                    System.out.println("Attendant ID #:\t" + somevariable);
                    System.out.println("Dog ID #:\t" + somevariable);
                    System.out.println("Min. w/Dog:\t" + somevariable);
                    System.out.println("Notes:\t" + somevariable);
                    System.out.println("*********************************");
                */

                //Reprompt user to enter another user and enforce that only care attendant ID #'s are entered' 
                //OUTPUT OF CARE ATTENDANT INFO.
                System.out.println("Enter 11 for Noah Charles");
                System.out.println("Enter 22 for Silas Alexander");
                System.out.println("Enter 33 for Chris Isaac");
                System.out.println("Enter 44 for Mya Lynn");

                //PRIMER
                attendantID = Integer.parseInt(input.nextLine());


        }while(attendantID != EXIT);
        //Output total time and count by color 

        /*
        System.out.println("\nThanks for entering your dog logs");
        System.out.println("*************************************");
        System.out.println("Total # of log entries: " + yourvariable);
        System.out.println("\tRed total count: " + yourvariable + " \tRed total # of min.: " + yourvariable);
        System.out.println("\tGreen total count: " + yourvariable + " \tGreen total # of min.: " + yourvariable);
        System.out.println("\tYellow total count: " + yourvariable + " \tYellow total # of min.: " + yourvariable);
        System.out.println("\tBlue total count: " + yourvariable + " \tBlue total # of min.: " + yourvariable);       
        */



    }//end of main method

    //Defining the method
    public static void outputWelcomeMsg(){
        //WELCOME MESSAGE
        System.out.println("Welcome to the MPLS care attendant daily log program.  This program will allow you to enter a care attendant id and produce a log for the dogs under the attendant's care.");

    }

    //method to do defensive programming
    public static void checkAttendantID(int attendantID){

    }//end of checkAttendantID method

    //method to determine color group

}//End of DailyLog class
