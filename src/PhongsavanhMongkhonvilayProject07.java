//CSCI 231 Project06
//Title: Project07
//Version: 03-09-2022
//Copyright: Copyright (c) 2022
//Author: Phongsavanh E. Mongkhonvilay
//Description: CSCI 231 Project07, Array Festive

import java.util.*;
public class PhongsavanhMongkhonvilayProject07 {
    //*******************************
    //main
    //*******************************
    public static void main(String[] args) {
        //loop program
        while(true) {
            //create Scanner
            Scanner input = new Scanner(System.in);

            //user input for size
            System.out.print("Enter the size of array to create: ");
            int size = input.nextInt();

            //create new array with size
            int[] array = new int[size];

            //initialize array with random ints 1-100
            initializeArray(array);

            //print array
            System.out.println("The printed array is:");
            printArray(array);

            //print smallest in array
            System.out.println("The smallest value of the array is: " + smallest(array));

            //print largest in array
            System.out.println("The largest value of the array is: " + largest(array));

            //print range of array
            System.out.println("The range of the array is: " + range(array));

            //print average of array
            System.out.println("The average of the array is: " + String.format("%.2f", average(array)));

            //find key in array, ask user input
            System.out.print("Enter a key to search in the array: ");
            int key = input.nextInt();
            System.out.println("The index of the key is: " + linearSearch(array, key));

            //sort array with select sort
            selectSort(array);
            System.out.println("The sorted printed array is:");

            //print new sorted array
            printArray(array);
            System.out.println();

            //ask user if they want loop again
            System.out.print("Do you want to try another? (Y/N): ");
            String answer = input.next();

            //if statement to terminate program
            if(answer.equalsIgnoreCase("N")){
                System.out.println("goodbye.");
                break;
            }
        }//end while
    }//end main

    //*******************************
    //methods
    //*******************************

    //	assign	each	element	in	array	with	a	random	number
    //	between	1	and	100,	inclusive
    public static void initializeArray(int arr[]){
        //create randomNumber
        int randomNumber = (int)(Math.random()*100)+1;

        //loop through array length
        for(int i=0; i<arr.length; i++){
            //assign random numbers to arrray
            arr[i] = randomNumber;
        }
    }//end initialize array

    //	print	out	all	array	elements.	5	elements	per	line
    public static void printArray(int arr[]){
        //i is to help print 5 in a row
        int i = 1;

        //loop through array
        for(int element:arr){
            //print element with comma, if last print element without comma and newline
            System.out.print(element!=arr[arr.length-1]? element+", ": element+"\n");

            //every 5 elements, print newline
            if(i%5==0){
                System.out.println();
            }
            i++;
        }
    }//end print array

    //	find	the	largest	element	in	array
    public static int largest(int arr[]){
        //starting value of max
        int max = 0;

        //loop to find max element
        for(int element: arr){
            if(element>max){
                max = element;
            }
        }

        return max;
    }//end max

    //	find	the	smallest	element	in	array
    public static int smallest(int arr[]){
        //starting value of min
        int min = 101;

        //loop through array to find min
        for(int element: arr) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }//end smallest

    //	find	the	range	of	all	array	elements
    //	the	range	is	defined	as	the	difference	between	the	largest	and	smallest	elements
    public static int range(int arr[]){
        int min = smallest(arr);
        int max = largest(arr);
        return(max-min);
    }//end range

    //	find	the	average	value	of	all	elements	in	array
    public static double average(int arr[]){
        //sum variable to add up values
        double sum = 0;

        //for loop to add all values
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
        }

        //calculation of average
        double average = sum/arr.length;

        return (average);
    }//end average

    //	return	the	index	of	the	first	occurrence	of	key	in	arr
    //	if	key	is	not	found	in	arra,	return	-1
    public static int linearSearch(int arr[],	int	key){
        //for loop to find key
        for(int i=0; i<arr.length; i++){
            //if found key
            if(arr[i] == key){
                //return index of key
                return i;
            }
        }

        //return -1 if not found
        return -1;
    }//end linearSearch

    //	sort	the	arr	from	least	to	largest	by	using	select	sort	algorithm
    public static void selectSort(int arr[]){
        //nested for loop to loop through array for every i
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                //if j is less switch with current i
                if(arr[j]<arr[i]){
                    //swap values
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }//end selectSort
}//end class

//output:
//
//        Enter the size of array to create: 14
//        The printed array is:
//        67, 39, 97, 5, 66,
//        45, 1, 88, 67, 35,
//        72, 46, 76, 12
//        The smallest value of the array is: 1
//        The largest value of the array is: 97
//        The range of the array is: 96
//        The average of the array is: 51.14
//        Enter a key to search in the array: 39
//        The index of the key is: 1
//        The sorted printed array is:
//        1, 5, 12, 35, 39,
//        45, 46, 66, 67, 67,
//        72, 76, 88, 97
//
//        Do you want to try another? (Y/N): y
//        Enter the size of array to create: 16
//        The printed array is:
//        43, 80, 1, 80, 18,
//        80, 10, 18, 30, 69,
//        67, 82, 63, 88, 38,
//        47
//        The smallest value of the array is: 1
//        The largest value of the array is: 88
//        The range of the array is: 87
//        The average of the array is: 50.88
//        Enter a key to search in the array: 43
//        The index of the key is: 0
//        The sorted printed array is:
//        1, 10, 18, 18, 30,
//        38, 43, 47, 63, 67,
//        69, 80, 80, 80, 82,
//        88
//
//        Do you want to try another? (Y/N): y
//        Enter the size of array to create: 18
//        The printed array is:
//        35, 57, 57, 79, 41,
//        61, 49, 22, 19, 66,
//        69, 53, 94, 72, 47,
//        34, 5, 33
//        The smallest value of the array is: 5
//        The largest value of the array is: 94
//        The range of the array is: 89
//        The average of the array is: 49.61
//        Enter a key to search in the array: 36
//        The index of the key is: -1
//        The sorted printed array is:
//        5, 19, 22, 33, 34,
//        35, 41, 47, 49, 53,
//        57, 57, 61, 66, 69,
//        72, 79, 94
//
//        Do you want to try another? (Y/N): n
//        goodbye.
//
//        Process finished with exit code 0