
import java.util.Scanner;

public class W7P2 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        String[] tokens = stringBuilder.toString().split(" ");

        int y = tokens.length;

        for (int r = y - 1 ; r >= 0; r-- )
            System.out.print(tokens[r] + " ");

    }
}
