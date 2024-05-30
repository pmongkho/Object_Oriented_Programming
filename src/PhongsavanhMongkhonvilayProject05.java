//Project 05 A Mortgage	Calculator
//Title: Project05
//Version: 02-28-2022
//Copyright: Copyright (c) 2022
//Author: Phongsavanh E. Mongkhonvilay
//Company: Fort Hays State University
//Description: Project 05 A Mortgage Calculator
//

import java.util.Scanner;

public class PhongsavanhMongkhonvilayProject05 {

    //****************************
    //for loop to print out table
    //****************************
    static void paymentsForLoop(int principle, double interestRate, int term){
        for(int i=1; i<=term;i++) {
        double payment = (principle*interestRate*Math.pow((1+interestRate),term)/(Math.pow((1+interestRate),term)-1));
        double balanceEndOfMonth = principle*Math.pow((1+interestRate),i)-((payment*(Math.pow((1+interestRate),i)-1))/interestRate);
        double totalInterestPaid = payment*i - (principle-balanceEndOfMonth);
            //print headers
            if (i==1){
                System.out.printf("%-8s","Month");
                System.out.printf("%11s","Payment");
                System.out.printf("%17s","Total Interest");
                System.out.printf("%11s","Balance\n");
            }
            //print numbers
            System.out.printf("%5d",i); //month number
            System.out.printf("   $" + "%10.2f", payment);  //payment
            System.out.printf("   $" + "%10.2f", totalInterestPaid);    //total interest
            System.out.printf("   $" + "%10.2f", balanceEndOfMonth);    //balance end of month
            System.out.println();
        }//end for loop
    }

    //****************************
    //while loop to print out table
    //****************************
    static void paymentsWhileLoop(int principle, double interestRate, int term){
        //initialize i
        int i = 1;
        while (i <= term) {
            double payment = (principle * interestRate * Math.pow((1 + interestRate), term) / (Math.pow((1 + interestRate), term) - 1));
            double balanceEndOfMonth = principle * Math.pow((1 + interestRate), i) - ((payment * (Math.pow((1 + interestRate), i) - 1)) / interestRate);
            double totalInterestPaid = payment * i - (principle - balanceEndOfMonth);
            //print headers
            if (i == 1) {
                System.out.printf("%-8s", "Month");
                System.out.printf("%11s", "Payment");
                System.out.printf("%17s", "Total Interest");
                System.out.printf("%11s", "Balance\n");
            }
            //print numbers
            System.out.printf("%5d", i); //month number
            System.out.printf("   $" + "%10.2f", payment);  //payment
            System.out.printf("   $" + "%10.2f", totalInterestPaid);    //total interest
            System.out.printf("   $" + "%10.2f", balanceEndOfMonth);    //balance end of month
            System.out.println();

            //increment i
            i++;
        }//end while loop
    }

    //****************************
    //main
    //****************************
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //do while
        do {
            //user input
            System.out.print("Enter the principle to borrow: $");
            int principle = input.nextInt();
            
            System.out.print("Enter the interestRate in decimal: ");
            double interestRate = input.nextDouble() / 12;    //month interest

            System.out.print("Enter the term (in years): ");
            int term = input.nextInt() * 12;  //term to months

            //****************************
            //for loop to print out table
            //****************************
//            paymentsForLoop(principle,interestRate,term);

            //****************************
            //while loop to print out table
            //****************************
            paymentsWhileLoop(principle,interestRate,term);

            //ask user if they want to loop
            System.out.print("Do you want to calculate another payment? (Y/N): ");
            String loop = input.next();

            //statement to exit do-while loop
            if("N".equalsIgnoreCase(loop)){
                System.out.println("Goodbye.");
                break;
            }

        }while(true);//end do-while
    }//end main
}//end class


//output:
//        Enter the principle to borrow: $100000
//        Enter the interestRate in decimal: .05
//        Enter the term (in years): 3
//        Month       Payment   Total Interest   Balance
//        1   $   2997.09   $    416.67   $  97419.58
//        2   $   2997.09   $    822.58   $  94828.40
//        3   $   2997.09   $   1217.70   $  92226.43
//        4   $   2997.09   $   1601.98   $  89613.62
//        5   $   2997.09   $   1975.37   $  86989.92
//        6   $   2997.09   $   2337.82   $  84355.29
//        7   $   2997.09   $   2689.31   $  81709.68
//        8   $   2997.09   $   3029.76   $  79053.04
//        9   $   2997.09   $   3359.15   $  76385.34
//        10   $   2997.09   $   3677.42   $  73706.52
//        11   $   2997.09   $   3984.53   $  71016.55
//        12   $   2997.09   $   4280.43   $  68315.36
//        13   $   2997.09   $   4565.08   $  65602.92
//        14   $   2997.09   $   4838.43   $  62879.17
//        15   $   2997.09   $   5100.42   $  60144.08
//        16   $   2997.09   $   5351.02   $  57397.59
//        17   $   2997.09   $   5590.18   $  54639.66
//        18   $   2997.09   $   5817.85   $  51870.23
//        19   $   2997.09   $   6033.97   $  49089.27
//        20   $   2997.09   $   6238.51   $  46296.72
//        21   $   2997.09   $   6431.41   $  43492.53
//        22   $   2997.09   $   6612.63   $  40676.66
//        23   $   2997.09   $   6782.12   $  37849.06
//        24   $   2997.09   $   6939.82   $  35009.67
//        25   $   2997.09   $   7085.70   $  32158.45
//        26   $   2997.09   $   7219.69   $  29295.36
//        27   $   2997.09   $   7341.75   $  26420.33
//        28   $   2997.09   $   7451.84   $  23533.33
//        29   $   2997.09   $   7549.89   $  20634.29
//        30   $   2997.09   $   7635.87   $  17723.18
//        31   $   2997.09   $   7709.72   $  14799.94
//        32   $   2997.09   $   7771.38   $  11864.51
//        33   $   2997.09   $   7820.82   $   8916.86
//        34   $   2997.09   $   7857.97   $   5956.92
//        35   $   2997.09   $   7882.79   $   2984.65
//        36   $   2997.09   $   7895.23   $      0.00
//        Do you want to calculate another payment? (Y/N): Y
//        Enter the principle to borrow: $50000
//        Enter the interestRate in decimal: .08
//        Enter the term (in years): 5
//        Month       Payment   Total Interest   Balance
//        1   $   1013.82   $    333.33   $  49319.51
//        2   $   1013.82   $    662.13   $  48634.49
//        3   $   1013.82   $    986.36   $  47944.90
//        4   $   1013.82   $   1305.99   $  47250.71
//        5   $   1013.82   $   1621.00   $  46551.90
//        6   $   1013.82   $   1931.34   $  45848.43
//        7   $   1013.82   $   2237.00   $  45140.26
//        8   $   1013.82   $   2537.93   $  44427.38
//        9   $   1013.82   $   2834.12   $  43709.74
//        10   $   1013.82   $   3125.52   $  42987.32
//        11   $   1013.82   $   3412.10   $  42260.08
//        12   $   1013.82   $   3693.83   $  41527.99
//        13   $   1013.82   $   3970.68   $  40791.03
//        14   $   1013.82   $   4242.62   $  40049.15
//        15   $   1013.82   $   4509.62   $  39302.32
//        16   $   1013.82   $   4771.63   $  38550.52
//        17   $   1013.82   $   5028.64   $  37793.70
//        18   $   1013.82   $   5280.60   $  37031.84
//        19   $   1013.82   $   5527.48   $  36264.90
//        20   $   1013.82   $   5769.24   $  35492.85
//        21   $   1013.82   $   6005.86   $  34715.65
//        22   $   1013.82   $   6237.30   $  33933.26
//        23   $   1013.82   $   6463.52   $  33145.67
//        24   $   1013.82   $   6684.49   $  32352.82
//        25   $   1013.82   $   6900.18   $  31554.68
//        26   $   1013.82   $   7110.54   $  30751.23
//        27   $   1013.82   $   7315.55   $  29942.42
//        28   $   1013.82   $   7515.16   $  29128.21
//        29   $   1013.82   $   7709.35   $  28308.58
//        30   $   1013.82   $   7898.08   $  27483.49
//        31   $   1013.82   $   8081.30   $  26652.89
//        32   $   1013.82   $   8258.99   $  25816.76
//        33   $   1013.82   $   8431.10   $  24975.05
//        34   $   1013.82   $   8597.60   $  24127.73
//        35   $   1013.82   $   8758.45   $  23274.76
//        36   $   1013.82   $   8913.61   $  22416.11
//        37   $   1013.82   $   9063.06   $  21551.73
//        38   $   1013.82   $   9206.73   $  20681.58
//        39   $   1013.82   $   9344.61   $  19805.64
//        40   $   1013.82   $   9476.65   $  18923.86
//        41   $   1013.82   $   9602.81   $  18036.20
//        42   $   1013.82   $   9723.05   $  17142.62
//        43   $   1013.82   $   9837.33   $  16243.09
//        44   $   1013.82   $   9945.62   $  15337.55
//        45   $   1013.82   $  10047.87   $  14425.98
//        46   $   1013.82   $  10144.04   $  13508.34
//        47   $   1013.82   $  10234.10   $  12584.57
//        48   $   1013.82   $  10318.00   $  11654.65
//        49   $   1013.82   $  10395.69   $  10718.53
//        50   $   1013.82   $  10467.15   $   9776.17
//        51   $   1013.82   $  10532.33   $   8827.52
//        52   $   1013.82   $  10591.18   $   7872.55
//        53   $   1013.82   $  10643.66   $   6911.21
//        54   $   1013.82   $  10689.73   $   5943.47
//        55   $   1013.82   $  10729.36   $   4969.27
//        56   $   1013.82   $  10762.49   $   3988.58
//        57   $   1013.82   $  10789.08   $   3001.35
//        58   $   1013.82   $  10809.09   $   2007.54
//        59   $   1013.82   $  10822.47   $   1007.11
//        60   $   1013.82   $  10829.18   $     -0.00
//        Do you want to calculate another payment? (Y/N): y
//        Enter the principle to borrow: $50000
//        Enter the interestRate in decimal: .1
//        Enter the term (in years): 1
//        Month       Payment   Total Interest   Balance
//        1   $   4395.79   $    416.67   $  46020.87
//        2   $   4395.79   $    800.17   $  42008.59
//        3   $   4395.79   $   1150.25   $  37962.86
//        4   $   4395.79   $   1466.60   $  33883.43
//        5   $   4395.79   $   1748.96   $  29769.99
//        6   $   4395.79   $   1997.05   $  25622.28
//        7   $   4395.79   $   2210.57   $  21440.01
//        8   $   4395.79   $   2389.23   $  17222.88
//        9   $   4395.79   $   2532.76   $  12970.61
//        10   $   4395.79   $   2640.85   $   8682.90
//        11   $   4395.79   $   2713.20   $   4359.47
//        12   $   4395.79   $   2749.53   $      0.00
//        Do you want to calculate another payment? (Y/N): n
//        Goodbye.
//
//    Process finished with exit code 0
