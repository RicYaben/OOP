package Week5;
import java.util.Scanner;

/**
 *
 *  Week 5 – Problem 2
 *  A mail-order house sells five products whose retail prices are as follows:
 *  • Product 1, $2.98;
 *  • product 2, $4.50;
 *  • product 3, $9.98;
 *  • product 4, $4.49;
 *  • and product 5, $6.87.
 *  Write an application that reads a series of pairs of numbers as follows: a) productnumber
 *  b) quantity sold.
 *  Your program should use a switch statement to determine the retail price for each product. It should calculate and
 *  display the total retail value of all products sold.
 *  Use a sentinel-controlled loop to stop looping when reading 0 as product number and display the final results.
 *  The double numbers should be printed with two digits after the decimal point. Use the template in the next page as
 *  a starting point.
 */

public class W5P2 {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        double[] array = {0, 2.98, 4.50, 9.98, 4.49, 6.87};
        int[] arrayInt = new int[6];
        for(int x = scanner.nextInt(); x!= 0; x = scanner.nextInt()){
            switch(x){
                case 1:
                    arrayInt[1] = arrayInt[1]+ scanner.nextInt();
                    break;
                case 2:
                    arrayInt[2] = arrayInt[2]+ scanner.nextInt();
                    break;
                case 3:
                    arrayInt[3] = arrayInt[3]+ scanner.nextInt();
                    break;
                case 4:
                    arrayInt[4] = arrayInt[4]+ scanner.nextInt();
                    break;
                case 5:
                    arrayInt[5] = arrayInt[5]+ scanner.nextInt();
                    break;
            }
        }
        for(int i = 1; i<array.length; i++){
            System.out.printf("Product %d: $%.2f%n",i, array[i]*arrayInt[i]);
        }

    }
}

