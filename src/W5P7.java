import java.util.Scanner;

public class W5P7 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number of students and each student’s name and score.");
        int a = scanner.nextInt();

        int[] array = new int[a];
        String[] strings = new String[a];

        for(int x = 0; x < a; x++){
            strings[x] = scanner.next();
            array[x] = scanner.nextInt();
            if(array[x] == 0) {
                try {
                 x++;
                 strings[x] = scanner.next();
                 array[x] = scanner.nextInt();
                }catch(Exception eta){
                    break;
                }
            }
            for(int i = 0; i < x;i++){
                if(array[x] > array[i]){
                    int o = array[x];
                    array[x] = array[i];
                    array[i] = o;

                    String string = strings[x];
                    strings[x] = strings[i];
                    strings[i] = string;
                }
            }
        }
        System.out.printf("1. %s %d%n2. %s %d",strings[0], array[0], strings[1], array[1]);
    }
}
