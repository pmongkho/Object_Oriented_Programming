import java.util.*;

//Project 02. Java Basic
//        Project Objectives:
//        This project was designed to reinforce programming concepts from Chapter 2. In this
//        project, the students will practice:
//        1. Declare variables
//        2. Use Scanner and String objects
//        3. Do arithmetic operations, including /, %
//        4. Use basic data types int
//        Description of the Problem:
//        Write a program that asks the user input a change between 1 and 99 cents. The program
//        then will display it in amount of quarters, dime, nickels and pennies.
//        Example run 1: (the bold Italic numbers/strings are input):
//        Enter a change between 1 and 99 cents:
//        68
//        You have change 68 cents. That is:
//        2 quarters
//        1 dimes
//        1 nickels
//        3 pennies
//        Example run 2:
//        Enter a change between 1 and 99 cents:
//        97
//        You have change 97 cents. That is:
//        3 quarters
//        2 dimes
//        0 nickles
//        2 pennies
//        After finish the program successfully, you need to comment away (don’t delete) the user
//        input part. Replace it by the code that randomly generates a change between 1 and 99
//        cents, inclusive. Run and test the modified program.
//        Submit YourNameProject02.java via blackboard link. The due date is specified on
//        blackboard.

//Title: Project02
//Version: 01-24-2022
//Copyright: Copyright (c) 2022
//Author: Phongsavanh E. Mongkhonvilay
//Company: Fort Hays State University
//Description: This program will calculate change
//
//
// example:
// You have change 97 cents. That is:
//        3 quarters
//        2 dimes
//        0 nickles
//        2 pennies

public class PhongsavanhMongkhonvilayProject02 {

    //***********************************
    //* Main Method *
    //***********************************
    public static void main(String[] args) {
        //constant variables for coin value
        final int QUARTERS = 25;
        final int DIMES = 10;
        final int NICKLES = 5;
        final int PENNIES = 1;

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a change between 1 and 99 cents:");
//        int centsToChange = input.nextInt();

        //randomly generate number from 99
        int centsToChange = (int)Math.floor(Math.random()*99)+1;
        System.out.println("Enter a change between 1 and 99 cents: " + centsToChange);

        System.out.println("You have change "+ centsToChange + " cents. That is:");
        //finds number of quarters
        int quarters = centsToChange/QUARTERS;
        System.out.println(quarters + " quarters");

        //find how many cents left
        int centsLeftOver = centsToChange%QUARTERS;

        //finds number of dimes
        int dimes = centsLeftOver/DIMES;
        System.out.println(dimes+ " dimes");

        //find how many cents left
        centsLeftOver %= DIMES;

        //finds number of nickels
        int nickels = centsLeftOver/NICKLES;
        System.out.println(nickels+ " nickels");

        //find how many cents left
        centsLeftOver %= NICKLES;

        //finds number of pennies
        int pennies = centsLeftOver/PENNIES;
        System.out.println(pennies+ " pennies");

    }
}

//Output:
//
//Enter a change between 1 and 99 cents:89
//        You have change 89 cents. That is:
//        3 quarters
//        1 dimes
//        0 nickels
//        4 pennies
//Enter a change between 1 and 99 cents:95
//        You have change 95 cents. That is:
//        3 quarters
//        2 dimes
//        0 nickels
//        0 pennies
//Enter a change between 1 and 99 cents:89
//        You have change 89 cents. That is:
//        3 quarters
//        1 dimes
//        0 nickels
//        4 pennies
