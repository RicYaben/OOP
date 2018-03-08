package Week2;
import java.util.Scanner;

/**
 *Week 2 – Problem 14
 * Create a class Student and a class TestStudent. Student class has the following attributes:
 *  • int id;
 *  • String name;
 *  • String lastName;
 *  • int birthYear;
 *  • int grade;
 * Create getter and setter methods for each attribute.
 * The class TestStudent implements the main method and reads commands from the terminal.
 * First, the details of 5 students will be entered in this order: id, name, lastName, birthyear, grade. You should create 5 Student objects using these details.
 * Note: You can assume, that the IDs of the students will start from 1 and will increase by 1.
 * Then, 5 commands will be given from the terminal, which we define as follows:
 * 1 <= x <= 5
 * 1 x → print the name of a student with id x.
 * 2 x → print the last name of a student with id x.
 * 3 x → print the birth year of a student with id x.
 * 4 x → print the grade of a student with id x.
 * 5 x → print all information of a student with id x, in this format: [name,
 *  lastName, birthyear, grade] (‘[‘ and ‘]’ included).
 */

class Student {
    private int id;
    private String name;
    private String lastName;
    private int birthYear;
    private int grade;

    public Student(int id, String name, String lastName, int birthYear, int grade){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.grade = grade;
    }

    // NOT NECESSARY ANY SETTER!!
    public void setId(int id){ this.id = id; }
    public void setName(String name){ this.name = name; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public void setBirthYear(int birthYear){ this.birthYear = birthYear; }
    public void setGrade(int grade){ this.grade = grade; }

    public int getId(){ return id;}
    public String getName(){ return name;}
    public String getLastName(){ return lastName;}
    public int getBirthYear(){ return birthYear;}
    public int getGrade(){ return grade;}
}
class StudentTest{
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[5];
        for(int x = 1; x <=5 ; x++){
            students[x-1] = new Student(scanner.nextInt(),scanner.next(),scanner.next(),scanner.nextInt(),scanner.nextInt());
        }
        for(int x = 0; x <5;x++ ){

            int i = scanner.nextInt();
            int a = scanner.nextInt();

            switch(i) {
                case 1:
                    System.out.println(students[a-1].getName());
                    break;
                case 2:
                    System.out.println(students[a-1].getLastName());
                    break;
                case 3:
                    System.out.println(students[a-1].getBirthYear());
                    break;
                case 4:
                    System.out.println(students[a-1].getGrade());
                    break;
                case 5:
                    System.out.println("[" + students[a-1].getName() + ", " + students[a-1].getLastName() + ", " + students[a-1].getBirthYear() + ", " + students[a-1].getGrade() + "]");
                    break;
            }
        }
    }
}

