package Week3;
import java.util.Scanner;

public class W3P8 {

    public static void main(String[]arg){

        Scanner scanner= new Scanner(System.in);

        int counter = 0;
        double total = 0;
        int grade;
        int grade1 = 1;
        int grade2 = 1;
        int lowestGrade = 100;

        int input = scanner.nextInt();

        while (1 <= input && input <= 100){

            total = total + input;

            if(grade1 < input){
                grade1 = input;
            }
            if(grade2 < grade1){
                grade = grade1;
                grade1 = grade2;
                grade2 = grade;
            }
            if(lowestGrade > input){
                lowestGrade = input;
            }

            input = scanner.nextInt();
            counter ++;

            double average = total/counter;

            if(input == -1){
                System.out.printf("%d%n%d%n%d%n%.3f", lowestGrade, grade2, grade1, average);

            }
        }
    }
}
