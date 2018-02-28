import java.util.Scanner;

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

