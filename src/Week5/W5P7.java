package Week5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Week 5 – Problem 7
 *  Write a program that prompts the user to enter the number of students and each student’s name and score. The
 *  program stops reading input when 0 is entered into the console. The program finally displays the student with the
 *  highest score and the student with the second-highest score.
 *  All grades are different.
 */
public class W5P7 {

    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        for(int x=0; x!=-1; x++){
            strings.add(x,scanner.next());
            if(strings.get(x).equals("0")){
                break;
            }
            array.add(x,scanner.nextInt());

            for(int i= 0; i<= x; i++){
                if(array.get(i)<= array.get(x)){
                    int temp = array.get(i);
                    array.add(i,array.get(x));
                    array.add(x,temp);

                    String tempString = strings.get(i);
                    strings.add(i,strings.get(x));
                    strings.add(x,tempString);
                }
            }

        }
        for(int j = 0; j<= 1; j++){
            System.out.println((j+1)+". "+strings.get(j)+" "+array.get(j));
        }
    }
}

