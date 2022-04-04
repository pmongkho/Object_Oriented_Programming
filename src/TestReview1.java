//import java.util.Scanner;
//
//public class TestReview1 {
//
//    public static void main(String[] args) {
//
////        double x = -3.5;
////        System.out.println(Math.ceil(x));
////        Scanner keyboard = new Scanner(System.in);
//////        String input = keyboard.nextLine();
//////        System.out.println(input);
////        char c = 'A';
////        boolean isEnglishLetter = Character.isAlphabetic(c) ;
////        System.out.println("it is "+ (isEnglishLetter?"an English letter":"not an English letter"));
////        String greeting = "Hello my name is Java.";
////        System.out.println("greeting is: "+ greeting.length());
////        int score = 61;
////        char grade = score>60?'P':'U';
////        System.out.println(grade);
////        int xx = 2;
////        int yy = 12;
////        System.out.println(Math.pow(xx,yy));
////        boolean isArithOp = c == '+'||c=='-'||c=='*'||c=='/'||c=='%';
////        System.out.println(isArithOp);
////        String s = "LKJDKFAHSLKADF JKLJdFH";
////        System.out.println(s.matches("[^a-z]+"));
////        System.out.println(s.lastIndexOf(c)+ s.indexOf(c));
//////        System.out.println((s.lastIndexOf(c)+ s.indexOf(c))%s.indexOf(c)!=0);
//
//        }
//
//
//    }
//}
//import java.util.Scanner;
//class Exercise05_49 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a String: ");
//        String string = input.nextLine();
//
//        int countVow = 0;
//        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
//        string = string.replaceAll("\\s+","");
//        System.out.println(string.length());
//
//        for ( int i = 0; i < string.length();i++) {
//            for (int j = 0; j < vowels.length; j++) {
//                if (vowels[j] == string.charAt(i)) {
//                    countVow++;
//                }
//            }
//        }
//        System.out.println("The number of vowels is " + countVow);
//        System.out.println("The number of consonants is " + (string.length() - countVow));
//    }
//}

//class Solution {
////    public static boolean isPalindrome(int x) {
////        int reverse = 0;
////        int newNumber = x;
////        while(true){
////            int remainder = x%10;
////            reverse = reverse *10 + remainder;
////            x = x/10;
////            if(x<1){
////                break;
////            }
////        }
////        System.out.println(reverse);
////        return reverse == newNumber;
////    }
//
//
//
//    public static void main(String[] args) {
//int[] array = new int[5];
//int i;
//for( i=0; i<array.length;i++){
//
//}
//        System.out.println(i);
//    }
//
//}

class Quiz{

    public static int[][] initializeArray(){
        int[][] array = new int[3][3];

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = (int)(Math.random()+0.5);
            }
        }

        return array;
    }

    public static void main(String[] args){
        int[][] array = initializeArray();

        for(int list[]:array){
            for(int element: list){
                System.out.print(element);
            }
            System.out.println();
        }
    }

}