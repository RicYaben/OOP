package Lectures;
import java.util.Scanner;

public class L2P1 {
    public static void main(String[]arg){
        Scanner toast= new Scanner(System.in);

        double sum,maximum,min;

        double n1= toast.nextDouble();
        double n2;
        n2 = toast.nextDouble();
        double n3= toast.nextDouble();

        sum= n1 + n2 + n3;
        maximum= n1;
        if (n2 > maximum){
            maximum= n2;
        }
        if (n3 > maximum)
            maximum= n3;

        min= n1;
        if (n2 < min){
            min= n2;
        }
        if (n3 < min)
            min= n3;

        System.out.printf("%.2f%n%.2f%n%.2f", sum, maximum, min);
    }
}

