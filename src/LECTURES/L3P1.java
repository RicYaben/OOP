package LECTURES;

import java.util.Scanner;

class Student {

    private String name;
    private double averageGrade;

    public Student(String name, double averageGrade) {
        this.name = name;
        if (averageGrade > 0.0)
            this.averageGrade = averageGrade;

    }
    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLetterGrade() {

        String LetterGrade;

        if (averageGrade >= 90)
            LetterGrade = "A";
        else if (averageGrade >= 80)
            LetterGrade = "B";
        else if (averageGrade >= 70)
            LetterGrade = "C";
        else if (averageGrade >= 60)
            LetterGrade = "D";
        else LetterGrade = "F";

        return LetterGrade;
    }
}
class StudentTest {
    public static void main(String[]arg){
        Scanner scan = new Scanner(System.in);
        Student account1 = new Student(scan.next(),scan.nextDouble());
        System.out.printf("%s %s", account1.getName(), account1.getLetterGrade());
    }

}