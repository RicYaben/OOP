import java.util.Scanner;

/**
 *
 * Week 2 – Problem 4
 * Create a calculator. You should write two Java classes Calculator.java and CalculatorTest.java (You should upload both classes).
 *   • The first class should implement different methods that simulate the features of a calculator.
 *   • The second class should first instantiate a Calculator object. Then, it should read 10 commands from the input and for each command should call the corresponding method of the Calculator object.
 *   • The format of the commands is OP n1 if the operation is unary or OP n1 n2 if the operation is binary. The operation is given as a string, while the type of the operands depends on the operation (read below).
 *   • Floating point numbers should be printed with three digits after the decimal point.
 * The commands that should be supported are the following:
 *   • DIV_I n1 n2
 *       o Calculate the division of two integers n1 and n2
 *   • PROD_L n1 n2
 *       o Calculate the product of two long n1 and n2
 *   • SUM_D n1 n2
 *       o Calculate the sum of two double n1 and n2
 *   • DEC_TO_BIN n1
 *       o Convert the number n1 to unsigned binary representation. o 0<=n1<16
 *       o If n1 is not in the given interval print ERROR
 *   • NEGn1
 *       o Read an integer. If the number is positive make it negative, and
 *         vice-versa.
 *   • POW_I n1 n2
 *       o Calculate n1 to the power of n2. n1 and n2 are integers: 0 <= n1 <= 10 and 0 <= n2 <= 10.
 *       o If n1 or n2 is not in the given interval print ERROR
 */

class Calculator {

    public void DIV_I(int a, int b) {
        if(a == 0){
            System.out.println("ERROR");
        }else {
                int total = a / b;
            System.out.println(total);}
    }

    public void PROD_L(long a, long b) {
        long total = a * b;
        System.out.printf("%d%n", total);
    }

    public void SUM_D(double a, double b) {
        double total = a + b;
        System.out.printf("%.3f%n",total);
    }

    public void DEC_TO_BIN(int a) {
        if (a >= 0 && a < 16) {
                String temp = Integer.toBinaryString(a);
                System.out.println(temp);
        } else {
            System.out.println("ERROR");
        }
    }

    public void NEG(int a) {
        int total = a * (-1);
        System.out.println(total);
    }

    public void POW_I(int a, int b) {
        double total;
        if ((a >= 0 && a <= 10) && (b >= 0 && b <= 10)) {
            total = Math.pow(a, b);
            System.out.printf("%.0f%n",total);
        } else {
            System.out.println("ERROR");
        }
    }
}

class CalculatorTest {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        for (int x = 0; x < 10; x++) {
            String string = scanner.next();

            switch (string) {
                case "DIV_I":
                    calculator.DIV_I(scanner.nextInt(), scanner.nextInt());
                    break;
                case "PROD_L":
                    calculator.PROD_L(scanner.nextLong(), scanner.nextLong());
                    break;
                case "SUM_D":
                    calculator.SUM_D(scanner.nextDouble(), scanner.nextDouble());
                    break;
                case "DEC_TO_BIN":
                    calculator.DEC_TO_BIN(scanner.nextInt());
                    break;
                case "NEG":
                    calculator.NEG(scanner.nextInt());
                    break;
                case "POW_I":
                    calculator.POW_I(scanner.nextInt(), scanner.nextInt());
                    break;
            }
        }
    }
}

