package Week7;
import java.util.Scanner;

/**
 * Week 7 – Problem 1
 * Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme:
 * Grade is A if score is ≥ best - 10 Grade is B if score is ≥ best - 20; Grade is C if score is ≥ best - 30; Grade is D
 * if score is ≥ best - 40;
 * Grade is F otherwise.
 * The program reads a positive integer of the total number of students, then prompts the user to enter all of the scores,
 * and concludes by displaying the grades.
 */

public class W7P1 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        int students = scanner.nextInt();
        int[] student = new int[students];
        int max = 0;
        for(int x = 0; x< students; x++){
            student[x]= scanner.nextInt();
            if(max < student[x]){
                max = student[x];
            }
        }
        for(int j = 0; j< students; j++){
            if(student[j] >= max-10){
                System.out.println(" Student " + (j+1) + " score is " +student[j] + " and grade is A");
            }else if(student[j] >= max-20){
                System.out.println(" Student " + (j+1) + " score is " +student[j] + " and grade is B");
            }else if(student[j] >= max-30){
                System.out.println(" Student " + (j+1) + " score is " +student[j] + " and grade is C");
            }else if(student[j] >= max-40){
                System.out.println(" Student " + (j+1) + " score is " +student[j] + " and grade is D");
            }else {
                System.out.println(" Student " + (j+1) + " score is " + student[j] + " and grade is F");
            }
        }
    }
}
