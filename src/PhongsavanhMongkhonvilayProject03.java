import java.util.*;

//Title: Project03
//Version: 02-07-2022
//Copyright: Copyright (c) 2022
//Author: Phongsavanh E. Mongkhonvilay
//Company: Fort Hays State University
//Description: This program ask user for an integer 0-100
// and output a letter grade
//
//

public class PhongsavanhMongkhonvilayProject03 {

    //***********************************************
    //method that takes in score input and outputs
    // Your grade is: A,B,C,D, or F
    //for if-else structure
    // **********************************************
    public static void scoreToGradeOutput(int score) {
        //boolean logic to find grade
        boolean isGradeF = score < 60 && score >= 0;
        boolean isGradeD = score < 70 && score >= 60;
        boolean isGradeC = score < 80 && score >= 70;
        boolean isGradeB = score < 90 && score >= 80;
        boolean isGradeA = score <= 100 && score >= 90;

        //ternary to print output
        System.out.println("Your grade is: "
                + ((isGradeF) ? "F"
                : (isGradeD) ? "D"
                : (isGradeC) ? "C"
                : (isGradeB) ? "B"
                : (isGradeA) ? "A"
                : "This is not valid Input"));
    }

    //*****************************************************
    //method that takes in score input and outputs a Letter
    //for switch statement structure
    // ****************************************************
    public static String scoreToLetter(int score) {
        // boolean logic to find grade
        boolean isGradeF = score < 60 && score >= 0;
        boolean isGradeD = score < 70 && score >= 60;
        boolean isGradeC = score < 80 && score >= 70;
        boolean isGradeB = score < 90 && score >= 80;
        boolean isGradeA = score <= 100 && score >= 90;
        //nested ternary to find letter to return
        String letter =
                  (isGradeF) ? "F"
                : (isGradeD) ? "D"
                : (isGradeC) ? "C"
                : (isGradeB) ? "B"
                : (isGradeA) ? "A"
                : "";

        return letter;
    }

    //***********************************
    //* Main Method *
    //***********************************
    public static void main(String[] args) {
        //loop for continuous user prompt
        while (true) {
            //prompt user
            System.out.print("Enter your score (0 -- 100), Enter a letter to quit: ");

            //create scanner object
            Scanner input = new Scanner(System.in);

            //catch statement if is not integer. to exit while loop and end program
            boolean isNotIntegerEndProgram = !input.hasNextInt();
            if (isNotIntegerEndProgram) {
                input.close();
                System.out.println("Goodbye.");
                break;
            }

            //assigns input to score
            int score = input.nextInt();

            //****************************************
            //using scoreToGradeOutput to output grade letter from score
            //for if-else structure
            //****************************************
//            scoreToGradeOutput(score);

            //****************************************
            //using ScoreToLetter to return a letter
            // that can be used in switch statement
            //****************************************
            switch (scoreToLetter(score)) {
                case "F":
                    System.out.println("Your grade is: F");
                    break;
                case "D":
                    System.out.println("Your grade is: D");
                    break;
                case "C":
                    System.out.println("Your grade is: C");
                    break;
                case "B":
                    System.out.println("Your grade is: B");
                    break;
                case "A":
                    System.out.println("Your grade is: A");
                    break;
                default:
                    System.out.println("This is not valid Input");
            }//end switch
        }//end while
    }//end main
}//end class

//output:

//        Enter your score (0 -- 100), Enter a letter to quit: 100
//        Your grade is: A
//        Enter your score (0 -- 100), Enter a letter to quit: 105
//        This is not valid Input
//        Enter your score (0 -- 100), Enter a letter to quit: -15
//        This is not valid Input
//        Enter your score (0 -- 100), Enter a letter to quit: 45
//        Your grade is: F
//        Enter your score (0 -- 100), Enter a letter to quit: 78
//        Your grade is: C
//        Enter your score (0 -- 100), Enter a letter to quit: 89
//        Your grade is: B
//        Enter your score (0 -- 100), Enter a letter to quit: 60
//        Your grade is: D
//        Enter your score (0 -- 100), Enter a letter to quit: a
//        Goodbye.
//
//        Process finished with exit code 0