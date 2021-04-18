//function makeChange(price, payment) {
// your logic here
 //       }


//        makeChange(1, 5) // expected output -> [4, 0, 0, 0, 0]
// price was $1 and customer paid $5. Change back is [4 dollars, 0 quarters, 0 dimes, 0 nickels, 0 pennies]

//        makeChange(1.55, 20) // expected output -> [18, 1, 2, 0, 0]
// price was $1.55 and customer paid $20. Change back is [18 dollars, 1 quarter, 2 dimes, 0 nickels, 0 pennies]

//        makeChange(3.67, 100) // expected output -> [96, 1, 0, 1, 3]
// price was $3.67 and customer paid $100. Change back is [96 dollars, 1 quarter, 0 dimes, 1 nickels, 3 pennies]


import java.text.DecimalFormat;
import java.util.Scanner;

public class CodingChallenge1 {
    public static void main(String[] args) {
        makeChange(1, 5);

        System.out.println("");
        makeChange(1.55, 20);

        System.out.println("");
        makeChange(3.67, 100);
    }

    private static void makeChange(double price, double payment) {
        DecimalFormat dollarsCents = new DecimalFormat("#.00");

        double change = payment - price;

        double convertedPrice = price * 100;
        int integerPrice = (int) convertedPrice;

        double convertedPayment = payment * 100;
        int integerPayment = (int) convertedPayment;

        int totalChange = (integerPayment - integerPrice);

        //Dollars
        int dollarChange = totalChange / 100;

        int initialChange = (totalChange - (dollarChange * 100));
        int remainingChange = initialChange;


        //Quarters
        int quarterQuantity =  remainingChange / 25;
        remainingChange = remainingChange % 25;


        //Dimes
        int dimeQuantity =  remainingChange / 10;
        remainingChange = remainingChange % 10;


        //Nickels
        int nickelQuantity =  remainingChange / 5;
        remainingChange = remainingChange % 5;


        //Pennies
        int pennyQuantity =  remainingChange;

        System.out.println("If you gave the cashier $" + dollarsCents.format(payment) + " and the item cost $" + dollarsCents.format(price) +
                ", then you will receive $" + dollarsCents.format(change) + " in change." );
        System.out.println("That comes out to:");
        System.out.println("     " + dollarChange + " dollars");
        System.out.println("     " + quarterQuantity + " quarters");
        System.out.println("     " + dimeQuantity + " dimes");
        System.out.println("     " + nickelQuantity + " nickels");
        System.out.println("     " + pennyQuantity + " pennies");
    }
}
