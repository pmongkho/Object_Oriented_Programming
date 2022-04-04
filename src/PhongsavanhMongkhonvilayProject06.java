//CSCI 231 Project06
//Title: Project05
//Version: 03-09-2022
//Copyright: Copyright (c) 2022
//Author: Phongsavanh E. Mongkhonvilay
//Description: CSCI 231 Project06

import java.util.Scanner;

public class PhongsavanhMongkhonvilayProject06 {
    //******************************
    //countLetters(String s)
    //******************************
    public static int countLetters(String s){
        //initialize count
        int count = 0;

        //for loop to iterate through letters in String s
        for(int i=0; i<s.length(); i++) {
            //boolean to determine if char is a letter
            boolean isCharacter = Character.isLetter(s.charAt(i));

            //uses boolean to add to count
            if (isCharacter) {
                //adds 1 to count if letter
                count++;
            }
        }//end for
        return count;
    }//end method

    //******************************
    //countLetters(String s, char c)
    //******************************
    public static int countLetters(String s, char c){
        //base case to exit program
        boolean notValidInput = !Character.isLetter(c);
        if(notValidInput){
            return -1;
        }

        //initialize count
        int count = 0;
        
        //for loop to iterate through characters in String s
        for(int i=0; i<s.length(); i++) {
            //finds characters in String s
            char character = s.charAt(i);

            //boolean to evaluate if character and parameter c is equal, using String methods
            boolean isCharacterEqual = Character.toString(character).equalsIgnoreCase(Character.toString(c));

            //uses boolean to add to count
            if (isCharacterEqual) {
                //adds 1 to count if equal
                count++;
            }
        }//end for
        return count;
    }//end method

    //*******************************
    //main
    //*******************************
    public static void main(String[] args) {
        //while loop to keep looping
        while(true) {
            //create a scanner instance
            Scanner input = new Scanner(System.in);

            //user input for string
            System.out.print("Enter a string: ");
            String string = input.nextLine();

            //user input for character
            System.out.print("Enter a char: ");
            char character = input.next().charAt(0);

            //stores functions into variables
            int stringResult = countLetters(string);
            int stringCharResult = countLetters(string, character);

            //print statements
            System.out.println("The result of calling function int countLetters(String s) is: " + stringResult);
            System.out.println("The result of calling function int countLetters(String s, char c) is: " + stringCharResult);

            //ask user to play again?
            System.out.print("Do you want to try another test? (Y/N): ");
            String answer = input.next();

            //if user enters n, loop exits
            if(answer.equalsIgnoreCase("N")){
                System.out.println("Goodbye.");
                break;
            }

        }//end while
    }//end main
}// end class

//output:
//        Enter a string: Hello iam a monster1226*/-
//        Enter a char: a
//        The result of calling function int countLetters(String s) is: 16
//        The result of calling function int countLetters(String s, char c) is: 2
//        Do you want to try another test? (Y/N): y
//        Enter a string: azulajalsdkj87987/*-
//        Enter a char: a
//        The result of calling function int countLetters(String s) is: 12
//        The result of calling function int countLetters(String s, char c) is: 3
//        Do you want to try another test? (Y/N):
//        y
//        Enter a string: owiejosdf987/*-
//        Enter a char: 3
//        The result of calling function int countLetters(String s) is: 9
//        The result of calling function int countLetters(String s, char c) is: -1
//        Do you want to try another test? (Y/N): n
//        Goodbye.
//
//        Process finished with exit code 0