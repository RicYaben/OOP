package Week5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Week 5 – Problem 8
 * Write a program that reads an undefined number of student’s. The program should stop asking when the input ‘End’ is
 * read. The program will read a name, a grade (an integer between 0 and 100, inclusively) on the final test and will ask
 * to know the status of three assignments. If the student has a grade higher than or equal to 60, and has completed
 * assignment 1 or 2, but has also completed mandatory assignment 3, that student should be allowed to go to the exam.
 * If, however, assignment 3 is not completed, and both 1 and 2 are, the student is NOT eligible to attend the exam.
 *The student is also NOT eligible to attend the exam if ONLY assignment 3 is completed. If the grade is below 60,
 * regardless of the assignments, the student is not eligible.
 */

public class W5P8 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringsKey = new ArrayList<>();
        int index = 0;

        //For loop that scans a next with string pattern and continues doing it so until the string is "End"
        for (String string = scanner.next(); !"End".equals(string); string = scanner.next()) {
            int integer = scanner.nextInt();
            String assignment1 = scanner.next();
            String assignment2 = scanner.next();
            String assignment3 = scanner.next();

            //Check only the numbers between 0 and 100 and put a String in the ArrayList.
            if (integer >= 0 && integer <= 100) if (integer >= 60) {
                if ((assignment1.equals("y") || assignment2.equals("y"))) {
                    if (assignment3.equals("y")) {
                        stringsKey.add(index, string + " is eligible to attend the exam.");
                    } else {
                        stringsKey.add(index, string + " is not eligible to attend the exam.");
                    }
                } else {
                    stringsKey.add(index, string + " is not eligible to attend the exam.");
                }
            } else {
                stringsKey.add(index, string + " is not eligible to attend the exam.");
            }
            index ++;
        }

        //This for each loop prints all the Strings from the ArrayList.
        for (String aStringsKey : stringsKey) {
            System.out.println(aStringsKey);
        }
    }
}
