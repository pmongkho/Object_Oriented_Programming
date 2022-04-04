//        Study the REVEL textbook case study: Covert a Hexadecimal
//        to decimal (there is a video for you to watch too).
//        Then write a program that can convert a binary to
//        decimal (only for integer case).
//        There are two ways to do so.
//        Easy way: Directly use Java built-in method to do this. In this case,
//        only couple lines of code. Hint: Study Integer class in Java.
//        Hard way: Write your own code to convert a binary to decimal
//        from scratch. The input is a binary string.
//        The program output is its corresponding decimal value.
//        This way you need to design the algorithm.
//        Student need to do both ways and test them correctly to get 100% credit.
//        If student only did one way or another, the maximum grade is 80%.
//        Due on 02/22/2022 by 11:59 p.m.

//Title: Project04
//Version: 02-16-2022
//Copyright: Copyright (c) 2022
//Author: Phongsavanh E. Mongkhonvilay
//Company: Fort Hays State University
//Description: This program converts binary to integer
//
//
import java.util.*;
import java.lang.Math;
import java.lang.String;

public class PhongsavanhMongkhonvilayProject04 {

    //*********************************************************
    //hard way method
    //*********************************************************
    public static int binaryCalculator(String binary){
        //initialize variable to sum up values of binary
        int binaryToIntSum = 0;

        //for loop to iterate through characters in String
        //101[0]<-- this one first. 10[1]0<-- this one next...so on.
        for (int i = 0; i < binary.length(); i++) {
                //converts char to number
                double nextCharToNumber = Character.getNumericValue(binary.charAt(binary.length()-(i+1)));
                //checks if binary
                boolean isBinary = (nextCharToNumber==0 || nextCharToNumber==1);
                //execute if binary
                if(isBinary){
                    //calculates binary to number
                    double calcEachChar = nextCharToNumber * Math.pow(2, i);
                    //adds the calculation to calcBinary
                    binaryToIntSum += calcEachChar;
                //returns -1 if not binary
                }else{
                return-1;
                }
        }
        return binaryToIntSum;
    }

    //*********************************************************
    //main method
    //*********************************************************
    public static void main(String[] args) {
        while(true){
        System.out.print("Enter a Binary number to convert to a Decimal (Enter a letter to quit): ");

        Scanner input = new Scanner(System.in);
        String binary = input.next();

        //searches for a letter to quit
        boolean isLetterThenQuit = binary.matches(".*[a-z].*");

        //if input has a char, program will quit
        if(isLetterThenQuit){
                input.close();
                System.out.println("Goodbye.");
                break;
            }

            //*********************************************************
            //Easy way method
            //*********************************************************
//            try {
//                Integer binaryConvert = Integer.parseInt(binary, 2);
//                System.out.println("Binary converted to Decimal is: "+binaryConvert);
//            }catch(Exception e){
//                System.out.println("not valid input!");
//            }

            //*********************************************************
            //hard way method
            //*********************************************************
            //store binary calculator to variable
            int binaryCalculated = binaryCalculator(binary);
            //checks if input was valid
            boolean isValidInput = (binaryCalculated != -1);

            System.out.println("Binary converted to Decimal is: "+(isValidInput?binaryCalculated:"not valid input!"));

            }
        }
    }

//    output:
//
//            Enter a Binary number to convert to a Decimal (Enter a letter to quit): 1
//            Binary converted to Decimal is: 1
//            Enter a Binary number to convert to a Decimal (Enter a letter to quit): 11
//            Binary converted to Decimal is: 3
//            Enter a Binary number to convert to a Decimal (Enter a letter to quit): 111
//            Binary converted to Decimal is: 7
//            Enter a Binary number to convert to a Decimal (Enter a letter to quit): 1111
//            Binary converted to Decimal is: 15
//            Enter a Binary number to convert to a Decimal (Enter a letter to quit): 1010
//            Binary converted to Decimal is: 10
//            Enter a Binary number to convert to a Decimal (Enter a letter to quit): 1055
//            Binary converted to Decimal is: not valid input!
//            Enter a Binary number to convert to a Decimal (Enter a letter to quit): 111111
//            Binary converted to Decimal is: 63
//            Enter a Binary number to convert to a Decimal (Enter a letter to quit): a
//            Goodbye.

