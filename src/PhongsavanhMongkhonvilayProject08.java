//Title: Project08
//Version: 03-09-2022
//Copyright: Copyright (c) 2022
//Author: Phongsavanh E. Mongkhonvilay
//Description: CSCI 231 Project08, HEADSANDTAILS:
//create a [512][3][3] dimensional array that stores head and tails data
//My plan:
//create an initializer for array for head and tails, [512][3][3]
//print out array like this:
//HTT
//TTT
//TTT
//*trick find way to turn 0's and 1's to to H and T
//

import java.util.Scanner;

public class PhongsavanhMongkhonvilayProject08 {

    //****************************************
    //initialize Array
    //****************************************
    public static int[][][] initializeArray(){

        //create a multidimensional array
        int[][][] newArray = new int[512][3][3];

        //assign values to array
        for(int grid=0; grid<newArray.length; grid++) {
            for (int row = 0; row < newArray[grid].length; row++) {
                for (int column = 0; column < newArray[row].length; column++) {
                    //assign a random number 0 or 1 to array cell
                    newArray[grid][row][column] = (int) (Math.random() * 2);
                }//column
            }//row
        }//grid

        return newArray;
    }

    //****************************************
    //output Array
    //****************************************
    public static void outputArray(int[][][]a, int grid){

        //for loop to print H or T as a 3x3 matrix
        for(int row=0; row<a[grid].length; row++){
            for(int column=0; column<a[grid][row].length; column++){
                //boolean to see if cell isHeads
                boolean isHeads = a[grid][row][column]==0;
                //if Heads print "H" else print "T"
                System.out.print(isHeads?"H":"T");
            }//end column

            //print new line for next row
            System.out.println();
        }//end row
    }

    //****************************************
    //main
    //****************************************
    public static void main(String[] args) {
        //Initial statement
        System.out.println("There are 512, 3x3 matrix of coin flips.\n");

        //initialize array
        int[][][] array = initializeArray();

        //while loop to run multiple times
        while(true) {
            //create Scanner
            Scanner input = new Scanner(System.in);
            //user input for which grid to print, enter negative to quit

            System.out.print("Enter an integer between 0 and 511, representing \nthe state of the matrix, enter -1 to quit: ");
            int grid = input.nextInt();

            //exit if grid integer is not in range
            boolean isInvalid = grid < 0 || grid > 511;
            if(isInvalid){
                System.out.println("goodbye");
                break;
            }

            //output array at grid integer
            outputArray(array, grid);
        }//end while
    }//end main
}//end class

//output:
//
//        There are 512, 3x3 matrix of coin flips.
//
//        Enter an integer between 0 and 511, representing
//        the state of the matrix, enter -1 to quit: 0
//        HHH
//        THT
//        TTH
//        Enter an integer between 0 and 511, representing
//        the state of the matrix, enter -1 to quit: 0
//        HHH
//        THT
//        TTH
//        Enter an integer between 0 and 511, representing
//        the state of the matrix, enter -1 to quit: 2
//        THH
//        THT
//        TTT
//        Enter an integer between 0 and 511, representing
//        the state of the matrix, enter -1 to quit: 5
//        HHH
//        THH
//        THH
//        Enter an integer between 0 and 511, representing
//        the state of the matrix, enter -1 to quit: 511
//        THT
//        HHH
//        TTT
//        Enter an integer between 0 and 511, representing
//        the state of the matrix, enter -1 to quit: 252
//        HHH
//        HHT
//        THT
//        Enter an integer between 0 and 511, representing
//        the state of the matrix, enter -1 to quit: -1
//        goodbye
//
//        Process finished with exit code 0